/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.logging.Level;

/**
 *
 * @author analo
 */
public class Auxiliar {
    
    
    /* 70% das vagas no maximo reservadas para mensalistas */
    static public int qntVagas = 0;
    static public int qntMensalistas = 0;
    
    static public boolean verificaVagas(){
        return (Auxiliar.qntMensalistas + 1) <= (Auxiliar.qntVagas * 0.7);
    }
    
    /*Criando a lista */
    static LinkedList<Cliente> fila = new LinkedList<Cliente>();

    static public void addNaFila(ArrayList<String> vetor) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        dateFormat.setLenient(false);
        Date d = null;
        GregorianCalendar x = new GregorianCalendar();
            Mensalista y = new Mensalista();
            //o cliente agora é mensalista
            y.setNome(vetor.get(0));
            y.setEndereco(vetor.get(1));
            y.setTelefone(Integer.parseInt(vetor.get(2)));
            y.setCpf(Long.parseLong(vetor.get(3)));
            y.setRg(Integer.parseInt(vetor.get(4)));
            try {
                d = dateFormat.parse(vetor.get(5));
            } catch (ParseException ex) {
               
            }
            x.setTime(d);
            y.setNascimento(x);
            y.setPeriodo(vetor.get(7));
            y.setStatus(vetor.get(8));
            y.setPagamento(vetor.get(9));
            
        Auxiliar.fila.add(y);
    }
    
    static public void iniciaVagas(){
        int i = 0;
        String z = "";
        Vaga x = new Vaga();
        for(i = 0; i < 100; i++){
            x.setNumero(i + 1);
             switch (i / 10){
                case 0:
                    z = "A" + (i+1);
                break;
                
                case 1:
                    z = "B" + ((i%10)+1);
                break;
           
                case 2:
                    z = "C" + ((i%10)+1);
                break;
                
                case 3:
                    z = "D" + ((i%10)+1);
                break;
                    
                case 4:
                    z = "E" + ((i%10)+1);
                break;
                    
                case 5:
                    z = "F" + ((i%10)+1);
                break;
                
                case 6:
                    z = "G" + ((i%10)+1);
                break;
                
                case 7:
                    z = "H" + ((i%10)+1);
                break;
                    
                case 8:
                    z = "I" + ((i%10)+1);                    
                break;
                    
                case 9:
                    z = "J" + ((i%10)+1);                                        
                break;
            }
            x.setLocalizacao(z);
            x.setStatus(false);
            if(i < 40){
                x.setPreco(2.00);
            }else if(i > 40 && i < 80){
                x.setPreco(5.00);
            }else{
                x.setPreco(8.00);
            }
            x.adiciona(x);
            Auxiliar.qntVagas++;
  
        }
    }
    
    
    
    
}
