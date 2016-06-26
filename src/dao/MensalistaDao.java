package dao;

import java.beans.Expression;
import static java.lang.Math.E;
import java.util.List;
import Model.Mensalista;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class MensalistaDao {

    private final SessionFactory conexao;

    public MensalistaDao() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    public boolean adiciona(Mensalista variavel) {
        try {
            Session sec = conexao.openSession();// abre uma conexao 
            Transaction tx = sec.beginTransaction();
         //adiciona o novo registro no banco INSERT

            sec.save(variavel);
            tx.commit();
            sec.close();
            return true;
        } catch (HibernateException u) {
            return false;
        }
    }

    public Mensalista atualiza(Mensalista variavel) {
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Mensalista variavelBanco = (Mensalista) sec.load(Mensalista.class, variavel.getIdPessoa());
            variavelBanco = variavel;
            // faz update no BD
            sec.update(variavelBanco);
            tx.commit();
            sec.close();
            return variavelBanco;
        } catch (HibernateException u) {
            throw new RuntimeException(u);

        }
    }

    public boolean deletar(Mensalista variavel) {
        boolean deletou = false;
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Mensalista variavelBanco = (Mensalista) sec.load(Mensalista.class,  variavel.getIdPessoa());
            //faz delete no BD
            sec.delete(variavelBanco);
            tx.commit();
            sec.close();
            deletou = true;

        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
        return deletou;

    }

    public List<Mensalista> Lista() {
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            List<Mensalista> variavelTabela;
            //retorna todos os registros da tabela usuario e insere em uma lista de objetos
            variavelTabela = sec.createCriteria(Mensalista.class).list();
            tx.commit();
            sec.close();
            return variavelTabela;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public Mensalista consulta(Mensalista variavel) {//traz um único objeto
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            Criteria crit = sec.createCriteria(Mensalista.class);
         //faz a busca com base no nome sem case sensitive
            //add cria as restrição no criteria 
            //método add do critéria é para montar as restrições 
            crit.add(Restrictions.ilike("idPessoa", String.valueOf(variavel.getIdPessoa()), MatchMode.EXACT));
         //garante o retorno de apenas 1 registro
            //ilike não é case sensitive
            crit.setMaxResults(1);
            Mensalista estacionamento = (Mensalista) crit.uniqueResult();
            tx.commit();
            sec.close();

            return estacionamento;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

}
