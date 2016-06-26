/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import Model.Estacionamento;
import javax.swing.JOptionPane;


public class EstacionamentoControl {
    Estacionamento variaveis;
    
    public EstacionamentoControl(){
        variaveis = new Estacionamento();
    }

    public Estacionamento getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(ArrayList<String> vetor) {
        this.variaveis.setRazaoSocial(vetor.get(0));
        this.variaveis.setNomeFantasia(vetor.get(1));
        this.variaveis.setEndereco(vetor.get(2));
        this.variaveis.setTelefone(Integer.parseInt(vetor.get(3)));
        this.variaveis.setCidade(vetor.get(4));
        this.variaveis.setEstado(vetor.get(5));
        this.variaveis.setInscricaoEstadual(Integer.parseInt(vetor.get(6)));
        this.variaveis.setCnpj(Integer.parseInt(vetor.get(7)));
        this.variaveis.setQntdVagas(Integer.parseInt(vetor.get(8)));
    }
    
    public boolean adiciona(ArrayList<String> vetor){ 
        try{
            setVariaveis(vetor);
            if(this.variaveis.adiciona(this.variaveis)){
                return true;
            }else{
                return false;
            }
        }catch(Exception u){
            throw new RuntimeException(u);
        }
    }
    
        public boolean deleta(ArrayList<String> vetor){
        try{
            EstacionamentoControl estacionamento = new EstacionamentoControl();
            estacionamento.setVariaveis(vetor);
            return this.variaveis.deleta(estacionamento.variaveis);
        }catch(Exception u){
            throw new RuntimeException(u);
        }
    }
        
        public Estacionamento atualiza(ArrayList<String> vetor){
            try{
                EstacionamentoControl estacionamento = new EstacionamentoControl();
                estacionamento.setVariaveis(vetor);
                estacionamento.variaveis = this.variaveis.atualiza(estacionamento.variaveis);
                return estacionamento.variaveis;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
        
        public List<Estacionamento> lista(){
            try{
                Estacionamento estacionamento = new Estacionamento();
                List<Estacionamento> lista = new ArrayList();
                lista = estacionamento.Lista();
                return lista;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
        
        public Estacionamento consulta(ArrayList<String> vetor){
            try{
                EstacionamentoControl estacionamento = new EstacionamentoControl();
                estacionamento.setVariaveis(vetor);
                estacionamento.variaveis = this.variaveis.consulta(estacionamento.variaveis);
                return estacionamento.variaveis;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
    
}