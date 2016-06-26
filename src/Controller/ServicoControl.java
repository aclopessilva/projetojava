/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import Model.Servico;
import javax.swing.JOptionPane;


public class ServicoControl {
    Servico variaveis;
    
    public ServicoControl(){
        variaveis = new Servico();
    }

    public Servico getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(ArrayList<String> vetor) {
        this.variaveis.setEntrada(vetor.get(0));
        this.variaveis.setSaida(vetor.get(1));
        this.variaveis.setMulta(Double.parseDouble(vetor.get(2)));
        this.variaveis.setValorServico(Integer.parseInt(vetor.get(3)));
        this.variaveis.setTotal(Double.parseDouble(vetor.get(4)));
        this.variaveis.setFormaDePagamento(vetor.get(5));

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
            ServicoControl Servico = new ServicoControl();
            Servico.setVariaveis(vetor);
            return this.variaveis.deleta(Servico.variaveis);
        }catch(Exception u){
            throw new RuntimeException(u);
        }
    }
        
        public Servico atualiza(ArrayList<String> vetor){
            try{
                ServicoControl Servico = new ServicoControl();
                Servico.setVariaveis(vetor);
                Servico.variaveis = this.variaveis.atualiza(Servico.variaveis);
                return Servico.variaveis;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
        
        public List<Servico> lista(){
            try{
                Servico Servico = new Servico();
                List<Servico> lista = new ArrayList();
                lista = Servico.Lista();
                return lista;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
        
        public Servico consulta(ArrayList<String> vetor){
            try{
                ServicoControl Servico = new ServicoControl();
                Servico.setVariaveis(vetor);
                Servico.variaveis = this.variaveis.consulta(Servico.variaveis);
                return Servico.variaveis;
            }
            catch(Exception u){
                throw new RuntimeException(u);
            }
        }
    
}