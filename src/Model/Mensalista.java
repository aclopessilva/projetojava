/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.ClienteDao;
import dao.MensalistaDao;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.DiscriminatorValue;

//import dao.MensalistaDao;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Aluno
 */
@Entity
//@PrimaryKeyJoinColumn(name="idCliente")
//@DiscriminatorValue(value="Mensalista")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
public class Mensalista extends Cliente {

    private String pagamento;
    private String status;
    private String periodo;
    
    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public boolean adiciona(Mensalista variaveis) {
        try {
            MensalistaDao banco = new MensalistaDao();
            return banco.adiciona(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public boolean deleta(Mensalista variaveis) {
        try {
            MensalistaDao banco = new MensalistaDao();
            return banco.deletar(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Mensalista atualiza(Mensalista variaveis) {
        try {
            MensalistaDao banco = new MensalistaDao();
            return banco.atualiza(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Mensalista consulta(Mensalista variaveis) {
        try {
            MensalistaDao banco = new MensalistaDao();
            return banco.consulta(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }
    public void extrato() {

    } 
    
    @Override
    public List<Cliente> Lista() {
        ClienteDao banco = new ClienteDao();
        return banco.ListaMensalista();
    }
}
