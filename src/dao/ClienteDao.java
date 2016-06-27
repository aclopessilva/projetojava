package dao;

import Model.Avulso;
import java.util.List;
import Model.Cliente;
import Model.Mensalista;
import Utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class ClienteDao {
 

    public ClienteDao() { 
    }

    public boolean adiciona(Cliente variavel) {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession(); 
            Transaction tx = sec.beginTransaction();
            //adiciona o novo registro no banco INSERT
            
            //a variavel pode ser de tipo Avulso ou Mensalista 
            sec.save(variavel);
            tx.commit();
            sec.close();
            return true;
        } catch (HibernateException u) {
            return false;
        }
    }

    public Cliente atualiza(Cliente variavel) {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Cliente variavelBanco = (Cliente) sec.load(Cliente.class, variavel.getIdPessoa());
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

    public boolean deletar(Cliente variavel) {
        boolean deletou = false;
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Cliente variavelBanco = (Cliente) sec.load(Cliente.class, variavel.getIdPessoa());
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

    public List<Cliente> Lista() {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            List<Cliente> variavelTabela;
            //retorna todos os registros da tabela usuario e insere em uma lista de objetos
            variavelTabela = sec.createCriteria(Cliente.class).list();
            tx.commit();
            sec.close();
            return variavelTabela;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }
    
    public List<Cliente> ListaAvulso() {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            List<Cliente> variavelTabela;
            //retorna todos os registros da tabela usuario e insere em uma lista de objetos
            variavelTabela = sec.createCriteria(Avulso.class).list();
            tx.commit();
            sec.close();
            return variavelTabela;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }
    
    public List<Cliente> ListaMensalista() {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            List<Cliente> variavelTabela;
            //retorna todos os registros da tabela usuario e insere em uma lista de objetos
            variavelTabela = sec.createCriteria(Mensalista.class).list();
            tx.commit();
            sec.close();
            return variavelTabela;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public Cliente consulta(Cliente variavel) {//traz um único objeto
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            Criteria crit = sec.createCriteria(Cliente.class);
            //faz a busca com base no nome sem case sensitive
            //add cria as restrição no criteria 
            //método add do critéria é para montar as restrições 
            crit.add(Restrictions.ilike("nome", (variavel.getNome()), MatchMode.EXACT));
            //garante o retorno de apenas 1 registro
            //ilike não é case sensitive
            crit.setMaxResults(1);
            Cliente usuario = (Cliente) crit.uniqueResult();
            tx.commit();
            sec.close();

            return usuario;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public Cliente consultaId(int idPessoa) {//traz um único objeto
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            Cliente usuario = (Cliente) sec.get(Cliente.class, idPessoa);

            tx.commit();
            sec.close();

            return usuario;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

}
