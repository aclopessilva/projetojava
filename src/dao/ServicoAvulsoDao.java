package dao;

import java.util.List;
import Model.ServicoAvulso;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class ServicoAvulsoDao {

    private final SessionFactory conexao;

    public ServicoAvulsoDao() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    public boolean adiciona(ServicoAvulso variavel) {
        try {
            //Hibernate
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

    public ServicoAvulso atualiza(ServicoAvulso x) {
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            ServicoAvulso variavelBanco = (ServicoAvulso) sec.load(ServicoAvulso.class, String.valueOf(x.getIdServicoAvulso()));
            variavelBanco.setSaida(x.getSaida());
            variavelBanco.setMulta(x.getMulta());
            variavelBanco.setValorServico(x.getValorServico());
            variavelBanco.setTotal(x.getTotal());
            variavelBanco.setFormaDePagamento(x.getFormaDePagamento());
            // faz update no BD
            sec.update(variavelBanco);
            tx.commit();
            sec.close();
            return variavelBanco;
        } catch (HibernateException u) {
            throw new RuntimeException(u);

        }
    }

    public boolean deletar(ServicoAvulso x) {
        boolean deletou = false;
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            //carrega usuario do BD
            ServicoAvulso variavelBanco = (ServicoAvulso) sec.load(ServicoAvulso.class, x.getIdServicoAvulso());
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

    public List<ServicoAvulso> Lista() {
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            List<ServicoAvulso> variavelTabela;
            //retorna todos os registros da tabela usuario e insere em uma lista de objetos
            variavelTabela = sec.createCriteria(ServicoAvulso.class).list();
            tx.commit();
            sec.close();
            return variavelTabela;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

    public ServicoAvulso consulta(ServicoAvulso x) {//traz um único objeto
        try {
            Session sec = conexao.openSession();
            Transaction tx = sec.beginTransaction();
            Criteria crit = sec.createCriteria(ServicoAvulso.class);
            //faz a busca com base no nome sem case sensitive
            //add cria as restrição no criteria 
            //método add do critéria é para montar as restrições 
            crit.add(Restrictions.ilike("idServicoAvulso", String.valueOf(x.getIdServicoAvulso()), MatchMode.EXACT));
            //garante o retorno de apenas 1 registro
            //ilike não é case sensitive
            crit.setMaxResults(1);
            ServicoAvulso usuario = (ServicoAvulso) crit.uniqueResult();
            tx.commit();
            sec.close();

            return usuario;
        } catch (HibernateException u) {
            throw new RuntimeException(u);
        }
    }

}
