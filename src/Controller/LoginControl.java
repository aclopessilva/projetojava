/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Operador;
import controller.OperadorControl;

/**
 *
 * @author Aluno
 */
public class LoginControl {

    public boolean login(String login, String senha) {
        try {
            OperadorControl controller = new OperadorControl(); 
            return controller.login(login, senha);
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }
}
