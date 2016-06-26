/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.OperadorDao;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
public class Operador extends Pessoa {

    private String funcao;
    private String periodo;
    private String login;
    private String senha;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean adiciona(Operador variaveis) {
        try {
            OperadorDao banco = new OperadorDao();
            return banco.adiciona(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public boolean deleta(Operador variaveis) {
        try {
            OperadorDao banco = new OperadorDao();
            return banco.deletar(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Operador atualiza(Operador variaveis) {
        try {
            OperadorDao banco = new OperadorDao();
            return banco.atualiza(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public Operador consulta(Operador variaveis) {
        try {
            OperadorDao banco = new OperadorDao();
            return banco.consulta(variaveis);
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }

    public List<Operador> Lista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean login(String login, String senha) {
        OperadorDao banco = new OperadorDao();
        return banco.login(login, senha);
    }

}
