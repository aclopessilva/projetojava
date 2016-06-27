package dao;

import java.beans.Expression;
import static java.lang.Math.E;
import java.util.List;
import Model.Operador;
import Utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class OperadorDao {
 

    public OperadorDao() { 
    }

    public boolean adiciona(Operador variavel) {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
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

    public Operador atualiza(Operador variavel) {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Operador variavelBanco = (Operador) sec.load(Operador.class, variavel.getIdPessoa());
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

    public boolean deletar(Operador variavel) {
        boolean deletou = false;
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Operador variavelBanco = (Operador) sec.load(Operador.class, variavel.getIdPessoa());
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

    public List<Operador> Lista() {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            List<Operador> variavelTabela;
            //retorna todos os registros da tabela usuario e insere em uma lista de objetos
            variavelTabela = sec.createCriteria(Operador.class).list();
            tx.commit();
            sec.close();
            return variavelTabela;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public Operador consulta(Operador variavel) {//traz um único objeto
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            Criteria crit = sec.createCriteria(Operador.class);
            //faz a busca com base no nome sem case sensitive
            //add cria as restrição no criteria 
            //método add do critéria é para montar as restrições 
            crit.add(Restrictions.ilike("nome", (variavel.getNome()), MatchMode.EXACT));
            //garante o retorno de apenas 1 registro
            //ilike não é case sensitive
            crit.setMaxResults(1);
            Operador usuario = (Operador) crit.uniqueResult();
            tx.commit();
            sec.close();

            return usuario;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public boolean login(String login, String senha) {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            Criteria crit = sec.createCriteria(Operador.class);
            //faz a busca com base no nome sem case sensitive
            //add cria as restrição no criteria 
            //método add do critéria é para montar as restrições 
            crit.add(Restrictions.ilike("login", login, MatchMode.EXACT));
            crit.add(Restrictions.ilike("senha", senha, MatchMode.EXACT));
            //garante o retorno de apenas 1 registro
            //ilike não é case sensitive
            crit.setMaxResults(1);
            Operador usuario = (Operador) crit.uniqueResult();
            tx.commit();
            sec.close();

            if (usuario == null) {
                return false;
            } else {
                return true;
            }
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

}
