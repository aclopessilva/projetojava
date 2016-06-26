/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.VagaDao;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Aluno
 */
@Entity
public class Vaga {

    @Id
    @GeneratedValue // auto incremento
    private int idVaga;
    private int numero;
    private String localizacao;
    private boolean status;
    private double preco;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean adiciona(Vaga variaveis) {
        try {
            VagaDao banco = new VagaDao();
            return banco.adiciona(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public boolean deleta(Vaga variaveis) {
        try {
            VagaDao banco = new VagaDao();
            return banco.deletar(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Vaga atualiza(Vaga variaveis) {
        try {
            VagaDao banco = new VagaDao();
            return banco.atualiza(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Vaga consulta(Vaga variaveis) {
        try {
            VagaDao banco = new VagaDao();
            return banco.consulta(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }
    
    public Vaga consultaId(int idVaga) {
        try {
            VagaDao banco = new VagaDao();
            return banco.consultaId(idVaga);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public List<Vaga> Lista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the idVaga
     */
    public int getIdVaga() {
        return idVaga;
    }

    /**
     * @param idVaga the idVaga to set
     */
    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }
}
