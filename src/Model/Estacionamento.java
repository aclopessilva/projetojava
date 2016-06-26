/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.EstacionamentoDao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Aluno
 */
@Entity
@DiscriminatorValue(value = "Estacionamento")
public class Estacionamento {

    @Id
    private int cnpj;
    private String razaoSocial;
    private long inscricaoEstadual;
    private String nomeFantasia;
    private int qntdVagas;
    private String endereco;
    private String cidade;
    private String estado;
    private int telefone;
    @OneToMany(cascade = CascadeType.ALL)
// @JoinTable(name="COUNTRY_STATE",joinColumns={@JoinColumn(name="Country_Name")},inverseJoinColumns={@JoinColumn(name="State_Name")})  
    private Collection<Vaga> vagas = new ArrayList<Vaga>();
 
    
    
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public long getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(long inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getQntdVagas() {
        return qntdVagas;
    }

    public void setQntdVagas(int qntdVagas) {
        this.qntdVagas = qntdVagas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public boolean adiciona(Estacionamento variaveis) {
        try {
            EstacionamentoDao banco = new EstacionamentoDao();
            return banco.adiciona(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public boolean deleta(Estacionamento variaveis) {
        try {
            EstacionamentoDao banco = new EstacionamentoDao();
            return banco.deletar(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Estacionamento atualiza(Estacionamento variaveis) {
        try {
            EstacionamentoDao banco = new EstacionamentoDao();
            return banco.atualiza(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Estacionamento consulta(Estacionamento variaveis) {
        try {
            EstacionamentoDao banco = new EstacionamentoDao();
            return banco.consulta(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public List<Estacionamento> Lista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the vagas
     */
    public Collection<Vaga> getVagas() {
        return vagas;
    }

    /**
     * @param vagas the vagas to set
     */
    public void setVagas(Collection<Vaga> vagas) {
        this.vagas = vagas;
    }

}
