/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import Model.Operador;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OperadorControl {

    Operador variaveis;

    public OperadorControl() {
        variaveis = new Operador();
    }

    public Operador getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(ArrayList<String> vetor) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        dateFormat.setLenient(false);
        Date d = null;
        GregorianCalendar x = new GregorianCalendar();
        this.variaveis.setNome(vetor.get(0));
        this.variaveis.setEndereco(vetor.get(1));
        this.variaveis.setTelefone(Integer.parseInt(vetor.get(2)));
        this.variaveis.setCpf(Long.parseLong(vetor.get(3)));
        this.variaveis.setRg(Integer.parseInt(vetor.get(4)));
        try {
            d = dateFormat.parse(vetor.get(5));
        } catch (ParseException ex) {
            Logger.getLogger(ClienteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.variaveis.setNascimento(x);
        this.variaveis.setFuncao(vetor.get(6));
        this.variaveis.setPeriodo(vetor.get(7));
        this.variaveis.setLogin(vetor.get(8));
        this.variaveis.setSenha(vetor.get(9));
    }

    public boolean adiciona(ArrayList<String> vetor) {
        try {
            setVariaveis(vetor);
            if (this.variaveis.adiciona(this.variaveis)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public boolean deleta(ArrayList<String> vetor) {
        try {
            OperadorControl Operador = new OperadorControl();
            Operador.setVariaveis(vetor);
            return this.variaveis.deleta(Operador.variaveis);
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public Operador atualiza(ArrayList<String> vetor) {
        try {
            OperadorControl Operador = new OperadorControl();
            Operador.setVariaveis(vetor);
            Operador.variaveis = this.variaveis.atualiza(Operador.variaveis);
            return Operador.variaveis;
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public List<Operador> lista() {
        try {
            Operador Operador = new Operador();
            List<Operador> lista = new ArrayList();
            lista = Operador.Lista();
            return lista;
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public Operador consulta(ArrayList<String> vetor) {
        try {
            OperadorControl Operador = new OperadorControl();
            Operador.setVariaveis(vetor);
            Operador.variaveis = this.variaveis.consulta(Operador.variaveis);
            return Operador.variaveis;
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public boolean login(String login, String senha) {
        try { 
            return  variaveis.login(login, senha);
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

}
