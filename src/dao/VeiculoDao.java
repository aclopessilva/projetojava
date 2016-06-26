package dao;

import java.beans.Expression;
import static java.lang.Math.E;
import java.util.List;
import Model.Veiculo;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class VeiculoDao {

    private final SessionFactory conexao;

    public VeiculoDao() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    public boolean adiciona(Veiculo variavel) {
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

    public Veiculo atualiza(Veiculo variavel) {
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Veiculo variavelBanco = (Veiculo) sec.load(Veiculo.class, variavel.getPlaca());
            //Atributo a ser modificado
            variavelBanco.setCor(variavel.getCor());
            variavelBanco.setAvaria(variavel.getAvaria());
            // faz update no BD
            sec.update(variavelBanco);
            tx.commit();
            sec.close();
            return variavelBanco;
        } catch (HibernateException u) {
            throw new RuntimeException(u);

        }
    }

    public boolean deletar(Veiculo variavel) {
        boolean deletou = false;
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            Veiculo variavelBanco = (Veiculo) sec.load(Veiculo.class, variavel.getPlaca());
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

    public List<Veiculo> Lista() {
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            List<Veiculo> variavelTabela;
            //retorna todos os registros da tabela usuario e insere em uma lista de objetos
            variavelTabela = sec.createCriteria(Veiculo.class).list();
            tx.commit();
            sec.close();
            return variavelTabela;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public Veiculo consulta(Veiculo variavel) {//traz um único objeto
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            Criteria crit = sec.createCriteria(Veiculo.class);
            //faz a busca com base no nome sem case sensitive
            //add cria as restrição no criteria 
            //método add do critéria é para montar as restrições 
            crit.add(Restrictions.ilike("placa", variavel.getPlaca(), MatchMode.EXACT));
            //garante o retorno de apenas 1 registro
            //ilike não é case sensitive
            crit.setMaxResults(1);
            Veiculo usuario = (Veiculo) crit.uniqueResult();
            tx.commit();
            sec.close();

            return usuario;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public Veiculo consultaId(String placa) {//traz um único objeto
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();

            Veiculo usuario = (Veiculo) sec.get(Veiculo.class, placa);

            tx.commit();
            sec.close();

            return usuario;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

}
