/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import Model.Veiculo;
import javax.swing.JOptionPane;


public class VeiculoControl {
    Veiculo variaveis;
    
    public VeiculoControl(){
        variaveis = new Veiculo();
    }

    public Veiculo getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(ArrayList<String> vetor) {
        this.variaveis.setPlaca(vetor.get(0));
        this.variaveis.setCor(vetor.get(1));
        this.variaveis.setModelo(vetor.get(2));
        this.variaveis.setAvaria(vetor.get(3));
        this.variaveis.setAno(Integer.parseInt(vetor.get(4)));
        this.variaveis.setTamanho(vetor.get(5));
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
            VeiculoControl Veiculo = new VeiculoControl();
            Veiculo.setVariaveis(vetor);
            return this.variaveis.deleta(Veiculo.variaveis);
        }catch(Exception u){
            throw new RuntimeException(u);
        }
    }
        
        public Veiculo atualiza(ArrayList<String> vetor){
            try{
                VeiculoControl Veiculo = new VeiculoControl();
                Veiculo.setVariaveis(vetor);
                Veiculo.variaveis = this.variaveis.atualiza(Veiculo.variaveis);
                return Veiculo.variaveis;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
        
        public List<Veiculo> lista(){
            try{
                Veiculo Veiculo = new Veiculo();
                List<Veiculo> lista = new ArrayList();
                lista = Veiculo.Lista();
                return lista;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
        
        public Veiculo consulta(ArrayList<String> vetor){
            try{
                VeiculoControl Veiculo = new VeiculoControl();
                Veiculo.setVariaveis(vetor);
                Veiculo.variaveis = this.variaveis.consulta(Veiculo.variaveis);
                return Veiculo.variaveis;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
    
}