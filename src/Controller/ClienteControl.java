/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Avulso;
import java.util.ArrayList;
import java.util.List;
import Model.Cliente;
import Model.Mensalista;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteControl {

    Cliente cliente;

    public ClienteControl() {
    }

    public Cliente getVariaveis() {
        return cliente;
    }

    public void setVariaveis(ArrayList<String> vetor) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        dateFormat.setLenient(false);
        Date d = null;
        GregorianCalendar x = new GregorianCalendar();

        //comparamos o tipo de cliente selecionado  =  avulso?
        if (vetor.get(6).equalsIgnoreCase("avulso")) {
            //cliente é a classe pai dos tipos de clientes
            //usando heranca de classes podemos dizer que o cliente é um tipo avulso
            cliente = new Avulso();
            //o cliente agora é avulso
            this.cliente.setNome(vetor.get(0));
            this.cliente.setEndereco(vetor.get(1));
            this.cliente.setTelefone(Integer.parseInt(vetor.get(2)));
            this.cliente.setCpf(Long.parseLong(vetor.get(3)));
            this.cliente.setRg(Integer.parseInt(vetor.get(4)));
            try {
                d = dateFormat.parse(vetor.get(5));
            } catch (ParseException ex) {
                Logger.getLogger(ClienteControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            x.setTime(d);
            this.cliente.setNascimento(x);

        }
        //comparamos o tipo de cliente selecionado   =  mensalista?
        if (vetor.get(6).equalsIgnoreCase("mensalista")) {
            //cliente é a classe pai dos tipos de clientes
            //usando heranca de classes podemos dizer que o cliente é um tipo mensalista
            cliente = new Mensalista();
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
                Logger.getLogger(ClienteControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            x.setTime(d);
            y.setNascimento(x);
            y.setPeriodo(vetor.get(7));
            y.setStatus(vetor.get(8));
            y.setPagamento(vetor.get(9));
            this.cliente = y;
        }

    }

    public boolean adiciona(ArrayList<String> vetor) {
        try {
            //montamos o objeto cliente se for avulso ou mensalista 
            setVariaveis(vetor);

            if (cliente != null) {
                //Chamando metodo adiciona do cliente
                if (this.cliente.adiciona(this.cliente)) {
                    return true;
                } else {
                    return false;
                }
            }

            return false;
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public boolean deleta(ArrayList<String> vetor) {
        try {
            ClienteControl Cliente = new ClienteControl();
            Cliente.setVariaveis(vetor);
            return this.cliente.deleta(this.cliente);
        } catch (Exception u) {
            throw new RuntimeException(u);
        }

    }

    public Cliente atualiza(ArrayList<String> vetor) {
        try {
            ClienteControl Cliente = new ClienteControl();
            Cliente.setVariaveis(vetor);
            Cliente.cliente = this.cliente.atualiza(this.cliente);
            return Cliente.cliente;
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public List<Cliente> lista() {
        try {
            Cliente cliente = new Cliente();
            List<Cliente> lista = new ArrayList();
//            lista = cliente.Lista();
            return lista;
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public Cliente consulta(ArrayList<String> vetor) {
        try {
            ClienteControl Cliente = new ClienteControl();
            Cliente.setVariaveis(vetor);
            Cliente.cliente = this.cliente.consulta(Cliente.cliente);
            return Cliente.cliente;
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

}
