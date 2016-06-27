/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.VeiculoDao;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Aluno
 */
@Entity
public class Veiculo {

    @Id
    private String placa;
    private String cor;
    private String modelo;
    private String avaria;
    private int ano;
    private String tamanho;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAvaria() {
        return avaria;
    }

    public void setAvaria(String avaria) {
        this.avaria = avaria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean adiciona(Veiculo variaveis) {
        try {
            VeiculoDao banco = new VeiculoDao();
            return banco.adiciona(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public boolean deleta(Veiculo variaveis) {
        try {
            VeiculoDao banco = new VeiculoDao();
            return banco.deletar(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Veiculo atualiza(Veiculo variaveis) {
        try {
            VeiculoDao banco = new VeiculoDao();
            return banco.atualiza(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Veiculo consulta(Veiculo variaveis) {
        try {
            VeiculoDao banco = new VeiculoDao();
            return banco.consulta(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Veiculo consultaId(String placa) {
        try {
            VeiculoDao banco = new VeiculoDao();
            return banco.consultaId(placa);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public List<Veiculo> Lista() {
        VeiculoDao banco = new VeiculoDao();
        return banco.Lista();
    }

}
