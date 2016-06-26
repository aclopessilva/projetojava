/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

//import dao.ClienteDao;
import javax.persistence.DiscriminatorValue;

//import dao.AvulsoDao;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Aluno
 */
@Entity
//@DiscriminatorValue(value="Avulso")
//@PrimaryKeyJoinColumn(name="idCliente")
public class Avulso extends Cliente {
 
}
