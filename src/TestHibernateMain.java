
import Model.Auxiliar;
import Model.Estacionamento;
import Model.Vaga;
import Utils.HibernateUtils;
import java.util.Collection;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 * TESTES HIBERNATE
 */
public class TestHibernateMain {

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();
        estacionamento.setEndereco("aaa");
        estacionamento.setNomeFantasia("aaa");
        estacionamento.setTelefone(123);
        estacionamento.setCidade("SP");
        estacionamento.setEstado("SP");
        estacionamento.setCnpj(123);
        estacionamento.setInscricaoEstadual(123);
        estacionamento.setQntdVagas(30);
        estacionamento.setRazaoSocial("TESTE");

        Session ss = HibernateUtils.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(estacionamento);
        ss.getTransaction().commit();

        ss.close();

        Session ss2 = HibernateUtils.getSessionFactory().openSession();
        ss2.beginTransaction();
        estacionamento = estacionamento.consulta(estacionamento);
        estacionamento.setVagas(Auxiliar.iniciaVagas());
        ss2.saveOrUpdate(estacionamento);
        ss2.getTransaction().commit();

        Criteria crit = ss2.createCriteria(Estacionamento.class);
            //faz a busca com base no nome sem case sensitive
        //add cria as restrição no criteria 
        //método add do critéria é para montar as restrições 
        crit.add(Restrictions.eq("cnpj", 123));
            //garante o retorno de apenas 1 registro
        //ilike não é case sensitive
        crit.setMaxResults(1);
        Estacionamento estacionamentos = (Estacionamento) crit.uniqueResult();
        Collection<Vaga> vagas = estacionamentos.getVagas();
        for (Vaga vaga : vagas) {
            System.out.println("Vaga: " + vaga.getLocalizacao());
        }
        
        
        ss2.close();

        HibernateUtils.shutdown();

    }
}
