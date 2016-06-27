
package dao;
import java.util.List;
import Model.Servico;
import Utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
      
public class ServicoDao {
     
    
    public ServicoDao(){ 
    }
 
 public boolean adiciona(Servico variavel){
     try{
         Session sec = HibernateUtils.getSessionFactory().openSession();// abre uma conexao 
         Transaction tx = sec.beginTransaction();
         //adiciona o novo registro no banco INSERT
         
         sec.save(variavel);
         tx.commit();
         sec.close();
         return true;
     }
     catch(HibernateException u){
        return false;
     }
 }
 
 public Servico atualiza(Servico x){
    try{
        Session sec = HibernateUtils.getSessionFactory().openSession();
        Transaction tx = sec.beginTransaction();
        //carrega usuario do BD
        Servico variavelBanco = (Servico)sec.load(Servico.class, String.valueOf(x.getIdServico()));
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
    }
    catch(HibernateException u){
        throw new RuntimeException(u);
    
    }
}
 
 public boolean deletar(Servico x){
     boolean deletou = false;
     try{
     Session sec = HibernateUtils.getSessionFactory().openSession();
     Transaction tx = sec.beginTransaction();
     //carrega usuario do BD
     Servico variavelBanco = (Servico)sec.load(Servico.class, x.getIdServico());
     //faz delete no BD
     sec.delete(variavelBanco);
     tx.commit();
     sec.close();
     deletou = true;
     
     }
     catch(HibernateException u){
         throw new RuntimeException(u);
     }
     return deletou;
 
 }
 
 public List<Servico>Lista(){
    try{
        Session sec=HibernateUtils.getSessionFactory().openSession();
        Transaction tx = sec.beginTransaction();
        List<Servico>variavelTabela;
        //retorna todos os registros da tabela usuario e insere em uma lista de objetos
        variavelTabela = sec.createCriteria(Servico.class).list();
        tx.commit();
        sec.close();
        return variavelTabela;
    }
    catch(HibernateException u){
         throw new RuntimeException(u);
     }
}
   
 public Servico consulta(Servico x){//traz um único objeto
     try{
         Session sec = HibernateUtils.getSessionFactory().openSession();
         Transaction tx = sec.beginTransaction();
         Criteria crit = sec.createCriteria(Servico.class);
         //faz a busca com base no nome sem case sensitive
         //add cria as restrição no criteria 
         //método add do critéria é para montar as restrições 
         crit.add(Restrictions.ilike("idServico", String.valueOf(x.getIdServico()),MatchMode.EXACT));
         //garante o retorno de apenas 1 registro
         //ilike não é case sensitive
         crit.setMaxResults(1);
         Servico usuario = (Servico)crit.uniqueResult();
         tx.commit();
         sec.close();
         
         return usuario;
     }
     catch(HibernateException u){
         throw new RuntimeException(u);
     }
 }
 
 
    
}
