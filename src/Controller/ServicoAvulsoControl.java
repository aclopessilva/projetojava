/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;
import Model.ServicoAvulso;
import Model.Vaga;
import Model.Veiculo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServicoAvulsoControl {

    ServicoAvulso variaveis;

    public ServicoAvulsoControl() {
        variaveis = new ServicoAvulso();
    }

    public ServicoAvulso getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(ArrayList<String> vetor) {

        /*
         Recupero o cliente pelo id e armazeno ele na variavel clienteModel
         */
        Cliente clienteModel = new Cliente();
        clienteModel = clienteModel.consultaId(Integer.parseInt(vetor.get(0)));
        this.variaveis.setPessoa(clienteModel);
        /*
         Recupero a Vaga pelo id e armazeno ele na variavel vagaModel
         */
        Vaga vagaModel = new Vaga();
        vagaModel = vagaModel.consultaId(Integer.parseInt(vetor.get(1)));
        this.variaveis.setVaga(vagaModel);
        /*
         Recupero o veiculo pelo id e armazeno ele na variavel veiculoModel
         */
        Veiculo veiculoModel = new Veiculo();
        veiculoModel = veiculoModel.consultaId(vetor.get(2));
        this.variaveis.setVeiculo(veiculoModel);

        
        
        //Pegando dia atual
        String data = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

        this.variaveis.setEntrada(data + " " + vetor.get(3));
        this.variaveis.setSaida(data + " " + vetor.get(4));

        this.variaveis.setValorServico(Integer.parseInt(vetor.get(5)));
        this.variaveis.setMulta(Double.parseDouble(vetor.get(6)));
        this.variaveis.setTotal(Double.parseDouble(vetor.get(7)));
        this.variaveis.setFormaDePagamento( vetor.get(8) );

        System.out.println(this.variaveis);

    }

    public boolean adiciona(ArrayList<String> vetor) {
        
        try {
            // popula nosso modelo ServicoAvulso com os valores passados pelo view
            setVariaveis(vetor);
            
            //nosso objeto do tipo modelo ServicoAvulso possui um metodo adiciona
            //o metodo adiciona recebe o modelo  e retorna true se consegue adicionar.
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
            ServicoAvulsoControl ServicoAvulso = new ServicoAvulsoControl();
            ServicoAvulso.setVariaveis(vetor);
            return this.variaveis.deleta(ServicoAvulso.variaveis);
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public ServicoAvulso atualiza(ArrayList<String> vetor) {
        try {
            ServicoAvulsoControl ServicoAvulso = new ServicoAvulsoControl();
            ServicoAvulso.setVariaveis(vetor);
            ServicoAvulso.variaveis = this.variaveis.atualiza(ServicoAvulso.variaveis);
            return ServicoAvulso.variaveis;
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public List<ServicoAvulso> lista() {
        try {
            ServicoAvulso ServicoAvulso = new ServicoAvulso();
            List<ServicoAvulso> lista = new ArrayList();
            lista = ServicoAvulso.Lista();
            return lista;
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

    public ServicoAvulso consulta(ArrayList<String> vetor) {
        try {
            ServicoAvulsoControl ServicoAvulso = new ServicoAvulsoControl();
            ServicoAvulso.setVariaveis(vetor);
            ServicoAvulso.variaveis = this.variaveis.consulta(ServicoAvulso.variaveis);
            return ServicoAvulso.variaveis;
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }

}
