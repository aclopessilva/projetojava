package dao;

import java.beans.Expression;
import static java.lang.Math.E;
import java.util.List;
import Model.Vaga;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class VagaDao {

    private final SessionFactory conexao;

    public VagaDao() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    public boolean adiciona(Vaga variavel) {
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

    public Vaga atualiza(Vaga variavel) {
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Vaga variavelBanco = (Vaga) sec.load(Vaga.class, variavel.getNumero());
            //Atributo a ser modificado
            variavelBanco.setLocalizacao(variavel.getLocalizacao());
            variavelBanco.setStatus(variavel.isStatus());
            // faz update no BD
            sec.update(variavelBanco);
            tx.commit();
            sec.close();
            return variavelBanco;
        } catch (HibernateException u) {
            throw new RuntimeException(u);

        }
    }

    public boolean deletar(Vaga variavel) {
        boolean deletou = false;
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Vaga variavelBanco = (Vaga) sec.load(Vaga.class, variavel.getNumero());
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

    public List<Vaga> Lista() {
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            List<Vaga> variavelTabela;
            //retorna todos os registros da tabela usuario e insere em uma lista de objetos
            variavelTabela = sec.createCriteria(Vaga.class).list();
            tx.commit();
            sec.close();
            return variavelTabela;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public Vaga consulta(Vaga variavel) {//traz um único objeto
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            Criteria crit = sec.createCriteria(Vaga.class);
            //faz a busca com base no nome sem case sensitive
            //add cria as restrição no criteria 
            //método add do critéria é para montar as restrições 
            crit.add(Restrictions.eq("numero",  variavel.getNumero() ));
            //garante o retorno de apenas 1 registro
            //ilike não é case sensitive
            crit.setMaxResults(1);
            Vaga usuario = (Vaga) crit.uniqueResult();
            tx.commit();
            sec.close();

            return usuario;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public Vaga consultaId(int idVaga) {//traz um único objeto
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();

            Vaga usuario = (Vaga) sec.get(Vaga.class, idVaga);
            tx.commit();
            sec.close();

            return usuario;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

}
