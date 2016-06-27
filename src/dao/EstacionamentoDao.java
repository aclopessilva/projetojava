package dao;

import java.beans.Expression;
import static java.lang.Math.E;
import java.util.List;
import Model.Estacionamento;
import Utils.HibernateUtils;
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

public class EstacionamentoDao {

    public EstacionamentoDao() {
    }

    public boolean adiciona(Estacionamento variavel) {
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

    public Estacionamento atualiza(Estacionamento variavel) {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Estacionamento variavelBanco = (Estacionamento) sec.load(Estacionamento.class, variavel.getCnpj());
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

    public boolean deletar(Estacionamento variavel) {
        boolean deletou = false;
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Estacionamento variavelBanco = (Estacionamento) sec.load(Estacionamento.class, variavel.getInscricaoEstadual());
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

    public List<Estacionamento> Lista() {
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            List<Estacionamento> variavelTabela;
            //retorna todos os registros da tabela usuario e insere em uma lista de objetos
            variavelTabela = sec.createCriteria(Estacionamento.class).list();
            tx.commit();
            sec.close();
            return variavelTabela;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public Estacionamento consulta(Estacionamento variavel) {//traz um único objeto
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            Criteria crit = sec.createCriteria(Estacionamento.class);
            //faz a busca com base no nome sem case sensitive
            //add cria as restrição no criteria 
            //método add do critéria é para montar as restrições 
            crit.add(Restrictions.ilike("nomeFantasia", variavel.getNomeFantasia(), MatchMode.EXACT));
            //garante o retorno de apenas 1 registro
            //ilike não é case sensitive
            crit.setMaxResults(1);
            Estacionamento estacionamento = (Estacionamento) crit.uniqueResult();
            tx.commit();
            sec.close();

            return estacionamento;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public Estacionamento consultaId(int cnpj) {//traz um único objeto
        try {
            Session sec = HibernateUtils.getSessionFactory().openSession();
            Transaction tx = sec.beginTransaction();
            Criteria crit = sec.createCriteria(Estacionamento.class);
            //faz a busca com base no nome sem case sensitive
            //add cria as restrição no criteria 
            //método add do critéria é para montar as restrições 
            crit.add(Restrictions.eq("cnpj", cnpj));
            //garante o retorno de apenas 1 registro
            //ilike não é case sensitive
            crit.setMaxResults(1);
            Estacionamento estacionamento = (Estacionamento) crit.uniqueResult();
            tx.commit();
            sec.close();

            return estacionamento;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

}
