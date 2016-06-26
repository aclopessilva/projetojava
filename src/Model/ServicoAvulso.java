/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import controller.ClienteControl;
import dao.ServicoAvulsoDao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//import dao.ServicoAvulsoDao;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
public class ServicoAvulso {

    @Id
    @GeneratedValue
    private int idServicoAvulso;

    private GregorianCalendar entrada;
    private GregorianCalendar saida;

    private double multa;
    private double valorServico;

    private double total;

    private String formaDePagamento;

    //REFERENCIA A TABELA Pessoa
    @ManyToOne
    @JoinColumn(name = "idPessoa")
    private Pessoa pessoa;
    //REFERENCIA A TABELA Vaga
    @ManyToOne
    @JoinColumn(name = "idVaga")
    private Vaga vaga;

    //REFERENCIA A TABELA Vaga
    @ManyToOne
    @JoinColumn(name = "placa")
    private Veiculo veiculo;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getIdServicoAvulso() {
        return idServicoAvulso;
    }

    public void setIdServicoAvulso(int idServicoAvulso) {
        this.idServicoAvulso = idServicoAvulso;
    }

    public GregorianCalendar getEntrada() {
        return entrada;
    }

    public void setEntrada(GregorianCalendar entrada) {
        this.entrada = entrada;
    }

    public void setEntrada() {
        Date entrada1 = new Date();
        this.entrada.setTime(entrada1);
    }

    public void setEntrada(String s) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy H:mm");
        dateFormat.setLenient(false);
        Date d = null;
        GregorianCalendar x = new GregorianCalendar();
        try {
            d = dateFormat.parse(s);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        x.setTime(d);
        this.entrada = x;
    }

    public GregorianCalendar getSaida() {
        return saida;
    }

    public void setSaida(GregorianCalendar saida) {
        this.saida = saida;
    }

    public void setSaida(String s) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy H:mm");
        dateFormat.setLenient(false);
        Date d = null;
        GregorianCalendar x = new GregorianCalendar();
        try {
            d = dateFormat.parse(s);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        x.setTime(d);
        this.saida = x;
    }

    public void setSaida() {
        Date saida1 = new Date();
        this.saida.setTime(saida1);
    }

    void defineTotal(ServicoAvulso x) {
        //Método que vai receber um objeto Serviço e tem que retornar a diferença
        //em horas entre a entrada e a saída.
        //Em seguida deve usar o valor descoberto para calcular o valor total.
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public boolean adiciona(ServicoAvulso variaveis) {
        try {
            //Criamos uma instancia de nosso ServicoAvulsoDao
            ServicoAvulsoDao banco = new ServicoAvulsoDao();
            //Nosso dao recebe nossa instancia de modelo ServicoAvulso
            return banco.adiciona(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public boolean deleta(ServicoAvulso variaveis) {
        try {
            ServicoAvulsoDao banco = new ServicoAvulsoDao();
            return banco.deletar(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public ServicoAvulso atualiza(ServicoAvulso variaveis) {
        try {
            ServicoAvulsoDao banco = new ServicoAvulsoDao();
            return banco.atualiza(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public ServicoAvulso consulta(ServicoAvulso variaveis) {
        try {
            ServicoAvulsoDao banco = new ServicoAvulsoDao();
            return banco.consulta(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public List<ServicoAvulso> Lista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the cliente
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the cliente to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the vaga
     */
    public Vaga getVaga() {
        return vaga;
    }

    /**
     * @param vaga the vaga to set
     */
    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

}
