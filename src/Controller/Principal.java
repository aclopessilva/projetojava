/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Auxiliar;
import Model.Estacionamento;
import Model.Operador;
import View.LoginView;
import controller.EstacionamentoControl;
import controller.OperadorControl;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String args[]) {
 
        EstacionamentoControl estacionamentoController = new EstacionamentoControl();

        ArrayList<String> estacionamentoVariaveis = new ArrayList<String>();
         
//        this.variaveis.setRazaoSocial(vetor.get(0));
//        this.variaveis.setNomeFantasia(vetor.get(1));
//        this.variaveis.setEndereco(vetor.get(2));
//        this.variaveis.setTelefone(Integer.parseInt(vetor.get(3)));
//        this.variaveis.setCidade(vetor.get(4));
//        this.variaveis.setEstado(vetor.get(5));
//        this.variaveis.setInscricaoEstadual(Integer.parseInt(vetor.get(6)));
//        this.variaveis.setCnpj(Integer.parseInt(vetor.get(7)));
//        this.variaveis.setQntdVagas(Integer.parseInt(vetor.get(8)));
        
        estacionamentoVariaveis.add("Estacionamento IFSP"); //nome
        estacionamentoVariaveis.add("Estacionamento IFSP");
        estacionamentoVariaveis.add("IFSP  92929");
        estacionamentoVariaveis.add("12312312");
        estacionamentoVariaveis.add("SP");
        estacionamentoVariaveis.add("SP");
        estacionamentoVariaveis.add("12312312");
        estacionamentoVariaveis.add("12312312");
        estacionamentoVariaveis.add("100"); 
        
        //Consulta na tabela se existe uma pessoa com o nome indicado ver Estacionamento ->consulta
        Estacionamento estacionamento = estacionamentoController.consulta(estacionamentoVariaveis);
        if (estacionamento == null) {  
            estacionamentoController.adiciona(estacionamentoVariaveis);
            estacionamento = estacionamentoController.consulta(estacionamentoVariaveis);
            estacionamento.setVagas(Auxiliar.iniciaVagas());
            estacionamentoController.update(estacionamento);
        }
        
        OperadorControl controller = new OperadorControl();

        ArrayList<String> variaveis = new ArrayList<String>();
        variaveis.add("Administrador"); //nome
        variaveis.add("Av. Endereco");
        variaveis.add("1199292929");
        variaveis.add("9399393");
        variaveis.add("93993939");
        variaveis.add("01/01/1980");
        variaveis.add("Diurno");
        variaveis.add("Gerente");
        variaveis.add("admin");
        variaveis.add("admin");
     //   Auxiliar.iniciaVagas();
        //Consulta na tabela se existe uma pessoa com o nome indicado ver OperadorDao.java ->consulta
        Operador a = controller.consulta(variaveis);
        if (a == null) {
            controller.adiciona(variaveis);
        }
        
        LoginView login = new LoginView();
        login.setVisible(true);
    }
}
