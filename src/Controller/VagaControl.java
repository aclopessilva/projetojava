/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import Model.Vaga;
import javax.swing.JOptionPane;


public class VagaControl {
    Vaga variaveis;
    
    public VagaControl(){
        variaveis = new Vaga();
    }

    public Vaga getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(ArrayList<String> vetor) {
        this.variaveis.setNumero(Integer.parseInt(vetor.get(0)));
        this.variaveis.setLocalizacao(vetor.get(1));
        this.variaveis.setStatus(Boolean.parseBoolean(vetor.get(2)));
        this.variaveis.setPreco(Double.parseDouble(vetor.get(3)));
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
            VagaControl Vaga = new VagaControl();
            Vaga.setVariaveis(vetor);
            return this.variaveis.deleta(Vaga.variaveis);
        }catch(Exception u){
            throw new RuntimeException(u);
        }
    }
        
        public Vaga atualiza(ArrayList<String> vetor){
            try{
                VagaControl Vaga = new VagaControl();
                Vaga.setVariaveis(vetor);
                Vaga.variaveis = this.variaveis.atualiza(Vaga.variaveis);
                return Vaga.variaveis;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
        
        public List<Vaga> lista(){
            try{
                Vaga Vaga = new Vaga();
                List<Vaga> lista = new ArrayList();
                lista = Vaga.Lista();
                return lista;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
        
        public Vaga consulta(ArrayList<String> vetor){
            try{
                VagaControl Vaga = new VagaControl();
                Vaga.setVariaveis(vetor);
                Vaga.variaveis = this.variaveis.consulta(Vaga.variaveis);
                return Vaga.variaveis;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
    
}