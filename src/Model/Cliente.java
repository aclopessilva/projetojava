/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.ClienteDao;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Aluno
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED) //Estrategia para criacao de tabela de herance -> mae e filhas 
public class Cliente extends Pessoa {

    protected String tipo;

//    public void HoraEntrada(Cliente data){
//        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
//            gc.setTime(new java.util.Date());
//            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("hh:mm:ss");
//            JOptionPane.showMessageDialog(null,"Hora de entrada : "+sdf.format(gc.getTime()));
//     }
//     
//     public void HoraSaida(Cliente data1){
//        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
//            gc.setTime(new java.util.Date());
//            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("hh:mm:ss");
//            JOptionPane.showMessageDialog(null,"Hora de entrada : "+sdf.format(gc.getTime()));
//     }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean adiciona(Cliente variaveis) {
        try {
            //criando instancia e chamando ClienteDao
            ClienteDao clienteDao = new ClienteDao();
            //Aqui poderiamos criar um AvulsoDao ou MensalistaDao
            //Mas aproveitamos que o ClienteDao pode inserir qualquer tipo de filhos (Avulso/Mensalista).
            
            
            //retornado o resultado de adicionar um cliente.
            return clienteDao.adiciona(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public boolean deleta(Cliente variaveis) {
        try {
            ClienteDao banco = new ClienteDao();
            return banco.deletar(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Cliente atualiza(Cliente variaveis) {
        try {
            ClienteDao banco = new ClienteDao();
            return banco.atualiza(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Cliente consulta(Cliente variaveis) {
        try {
            ClienteDao banco = new ClienteDao();
            return banco.consulta(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Cliente consultaId(int idCliente) {
        try {
            ClienteDao banco = new ClienteDao();
            return banco.consultaId(idCliente);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public List<Cliente> Lista() {
        ClienteDao banco = new ClienteDao();
        return banco.Lista();
    }
}
