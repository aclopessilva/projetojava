/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import controller.EstacionamentoControl;
import Model.Estacionamento;
import dao.EstacionamentoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class EstacionamentoView extends javax.swing.JFrame {

    /**
     * Creates new form EstacionamentoView
     */
    public EstacionamentoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtNomeFantasia = new javax.swing.JTextField();
        jtRazaoSocial = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jtCidade = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jtInscEstadual = new javax.swing.JTextField();
        jtQtdeVagas = new javax.swing.JTextField();
        jtCnpj = new javax.swing.JTextField();
        jtEstado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbGravar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jtConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome Fantasia:");

        jLabel2.setText("Razão Social:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Cidade:");

        jLabel5.setText("Telefone:");

        jLabel7.setText("Inscrição Estadual:");

        jLabel8.setText("CNPJ:");

        jLabel9.setText("Quantidade de vagas:");

        jLabel10.setText("Inserção - ESTACIONAMENTO");

        jLabel11.setText("Estado");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jtConsulta.setText("Consulta");
        jtConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGravar)
                    .addComponent(jbCancelar)
                    .addComponent(jbAlterar)
                    .addComponent(jbVoltar)
                    .addComponent(jbExcluir)
                    .addComponent(jtConsulta))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtRazaoSocial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addComponent(jtEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtCidade, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtQtdeVagas))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtQtdeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
        // TODO add your handling code here:
       //criando ARRAY LIST 
       ArrayList<String> variaveis = new ArrayList<String>();
       //verificando se campos estão vazios
       if((jtRazaoSocial.getText().isEmpty()) || (jtNomeFantasia.getText().isEmpty()) || (jtEndereco.getText().isEmpty()) || 
          (jtTelefone.getText().isEmpty()) || (jtCidade.getText().isEmpty()) || (jtEstado.getText().isEmpty()) || 
          (jtInscEstadual.getText().isEmpty()) || (jtCnpj.getText().isEmpty()) || (jtQtdeVagas.getText().isEmpty())){
           JOptionPane.showMessageDialog(null, "Os campos não podem retornar" + "vazios");
       }else{
           variaveis.add(jtRazaoSocial.getText());
           variaveis.add(jtNomeFantasia.getText());
           variaveis.add(jtEndereco.getText());
           variaveis.add(jtTelefone.getText());
           variaveis.add(jtCidade.getText());
           variaveis.add(jtEstado.getText());
           variaveis.add(jtInscEstadual.getText());
           variaveis.add(jtCnpj.getText());
           variaveis.add(jtQtdeVagas.getText());
           EstacionamentoControl Incluir = new EstacionamentoControl();
           if(Incluir.adiciona(variaveis)){
               JOptionPane.showMessageDialog(null, "Razão Social: "+jtRazaoSocial.getText()+
                       "\nNome Fantasia: "+jtNomeFantasia.getText()+
                       "\nEndereço: "+jtEndereco.getText()+
                       "\nCidade: "+jtCidade.getText()+
                       "\nEstado: "+jtEstado.getText()+
                       "\nTelefone: "+jtTelefone.getText()+
                       "\nInscrição Estadual: "+jtInscEstadual.getText()+
                       "\nCNPJ: "+jtCnpj.getText()+
                       "\nQuantidade de vagas: "+jtQtdeVagas.getText());
           }
       }
               
        
        
        
        
    }//GEN-LAST:event_jbGravarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
     ArrayList<String> variaveis = new ArrayList<String>();
        if((jtRazaoSocial.getText().isEmpty()) || (jtNomeFantasia.getText().isEmpty()) || (jtEndereco.getText().isEmpty()) || 
                  (jtTelefone.getText().isEmpty()) || (jtCidade.getText().isEmpty()) || (jtEstado.getText().isEmpty()) || 
                  (jtInscEstadual.getText().isEmpty()) || (jtCnpj.getText().isEmpty()) || (jtQtdeVagas.getText().isEmpty())){
                   JOptionPane.showMessageDialog(null, "Os campos não podem retornar" + "vazios");
        }else{
                variaveis.add(jtRazaoSocial.getText());
                variaveis.add(jtRazaoSocial.getText());
                variaveis.add(jtNomeFantasia.getText());
                variaveis.add(jtEndereco.getText());
                variaveis.add(jtTelefone.getText());
                variaveis.add(jtCidade.getText());
                variaveis.add(jtEstado.getText());
                variaveis.add(jtInscEstadual.getText());
                variaveis.add(jtCnpj.getText());
                variaveis.add(jtQtdeVagas.getText());


                EstacionamentoControl altera= new EstacionamentoControl();
                Estacionamento x = new Estacionamento();
                x = altera.atualiza(variaveis);
                jtRazaoSocial.setText(x.getRazaoSocial());
                jtNomeFantasia.setText(x.getNomeFantasia());
                jtEndereco.setText(x.getEndereco());
                jtTelefone.setText(String.valueOf(x.getTelefone()));
                jtCidade.setText(x.getCidade());
                jtEstado.setText(x.getEstado());
                jtInscEstadual.setText(String.valueOf(x.getInscricaoEstadual()));
                jtCnpj.setText(String.valueOf(x.getCnpj()));
                jtQtdeVagas.setText(String.valueOf(x.getQntdVagas()));
        }

    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        MenuView voltar = new MenuView();
        voltar.setVisible(true);
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
      ArrayList<String> variaveis = new ArrayList<String>();
if(jtInscEstadual.getText().isEmpty()){
	JOptionPane.showMessageDialog(null, "O campo Inscrição estadual precisa está preenchido");
}else{

  	variaveis.add(jtRazaoSocial.getText());
        variaveis.add(jtNomeFantasia.getText());
        variaveis.add(jtEndereco.getText());
        variaveis.add(jtTelefone.getText());
        variaveis.add(jtCidade.getText());
        variaveis.add(jtEstado.getText());
        variaveis.add(jtInscEstadual.getText());
        variaveis.add(jtCnpj.getText());
        variaveis.add(jtQtdeVagas.getText());
	

	EstacionamentoControl excluir = new EstacionamentoControl();
	if(excluir.deleta(variaveis)){
		JOptionPane.showMessageDialog(null, "Estacionamento excluido com sucesso!!");

	}
}

    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtConsultaActionPerformed
        
        
        ArrayList<String> variaveis = new ArrayList<String>();
    if(jtNomeFantasia.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo nome fantasia precisa está preenchido");
    }else{
            variaveis.add(jtRazaoSocial.getText());
            variaveis.add(jtRazaoSocial.getText());
            variaveis.add(jtNomeFantasia.getText());
            variaveis.add(jtEndereco.getText());
            variaveis.add(jtTelefone.getText());
            variaveis.add(jtCidade.getText());
            variaveis.add(jtEstado.getText());
            variaveis.add(jtInscEstadual.getText());
            variaveis.add(jtCnpj.getText());
            variaveis.add(jtQtdeVagas.getText());

            EstacionamentoControl cons = new EstacionamentoControl();
            Estacionamento x = new Estacionamento();
            x = cons.consulta(variaveis);
            jtRazaoSocial.setText(x.getRazaoSocial());
            jtNomeFantasia.setText(x.getNomeFantasia());
            jtEndereco.setText(x.getEndereco());
            jtTelefone.setText(String.valueOf(x.getTelefone()));
                jtCidade.setText(x.getCidade());
                jtEstado.setText(x.getEstado());
                jtInscEstadual.setText(String.valueOf(x.getInscricaoEstadual()));
                jtCnpj.setText(String.valueOf(x.getCnpj()));
                 jtQtdeVagas.setText(String.valueOf(x.getQntdVagas()));
}
        
        
    }//GEN-LAST:event_jtConsultaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstacionamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstacionamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstacionamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstacionamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstacionamentoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtCnpj;
    private javax.swing.JButton jtConsulta;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtInscEstadual;
    private javax.swing.JTextField jtNomeFantasia;
    private javax.swing.JTextField jtQtdeVagas;
    private javax.swing.JTextField jtRazaoSocial;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
}
