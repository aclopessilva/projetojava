/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Auxiliar;
import Model.Operador;
import View.LoginView;
import controller.OperadorControl;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String args[]) {

//        VeiculoView login = new VeiculoView();
//        login.setVisible(true);
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
