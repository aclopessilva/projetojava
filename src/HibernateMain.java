import Model.Avulso;
import Model.Cliente;
import Model.Estacionamento;
import Model.Mensalista;
import Model.Operador;
import Model.ServicoAvulso;
import Model.Vaga;
import Model.Veiculo;
import java.util.GregorianCalendar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * TESTES HIBERNATE 
 */
public class HibernateMain {

    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
//        Pessoa shape = new Pessoa();
//        shape.setCpf(1231);
//        shape.setRg(123);
//        shape.setNascimento(gc);
//        shape.setEndereco("aaa");
//        shape.setNome("nomeee");
//        shape.setTelefone(123);

        Avulso avulso = new Avulso();
        avulso.setCpf(1231);
        avulso.setRg(123);
        avulso.setNascimento(gc);
        avulso.setEndereco("aaa");
        avulso.setNome("nomeee");
        avulso.setTelefone(123);
        avulso.setTipo("Avulso");

        Mensalista mensalista = new Mensalista();
        mensalista.setCpf(1231);
        mensalista.setRg(123);
        mensalista.setNascimento(gc);
        mensalista.setEndereco("aaa");
        mensalista.setNome("nomeee");
        mensalista.setTelefone(123);
        mensalista.setTipo("Mensalista");
        mensalista.setPeriodo("Noturno");
        mensalista.setStatus("OK");

        Operador operador = new Operador();
        operador.setCpf(1231);
        operador.setRg(123);
        operador.setNascimento(gc);
        operador.setEndereco("aaa");
        operador.setNome("nomeee");
        operador.setTelefone(123);
        operador.setPeriodo("Noturno");
        operador.setFuncao("bla");
        operador.setLogin("aaa");
        operador.setSenha("aaa");

//        Estacionamento estacionamento = new Estacionamento();
//        estacionamento.setEndereco("aaa");
//        estacionamento.setTelefone(123);
//        estacionamento.setCidade("SP");
//        estacionamento.setEstado("SP");
//        estacionamento.setCnpj(123);
//        estacionamento.setInscricaoEstadual(123);
//        estacionamento.setQntdVagas(30);
//        estacionamento.setRazaoSocial("TESTE");

        Vaga vaga = new Vaga();
        vaga =  vaga.consultaId(1);
//        vaga.setLocalizacao("aa");
//        vaga.setNumero(1);
//        vaga.setPreco(12.0);
//        vaga.setStatus(true);
//        estacionamento.getVagas().add(vaga);

        Veiculo veiculo = new Veiculo();
        veiculo= veiculo.consultaId("123123");
//        veiculo.setAno(123);
//        veiculo.setPlaca();
//        veiculo.setCor("azzz");
//        veiculo.setTamanho("P");
        
        
        ServicoAvulso servico = new ServicoAvulso();
        servico.setEntrada(gc);
        servico.setPessoa(avulso);
        servico.setVeiculo(veiculo);
        servico.setVaga(vaga);
        servico.setTotal(100.0);
        servico.setMulta(10);
        servico.setValorServico(90);
 
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory sf = configuration.buildSessionFactory(sr);
        Session ss = sf.openSession();
        ss.beginTransaction();
        ss.save((Cliente)avulso);
        ss.save((Cliente)mensalista);
        ss.save(operador);
//        ss.save(estacionamento);
//        ss.save(veiculo);
        ss.save(servico); 
        ss.getTransaction().commit();
        ss.close();
        sf.close();

    }
}
