/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Auxiliar;
import controller.ClienteControl;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ClienteView extends javax.swing.JFrame {

    /**
     * Creates new form ClienteView
     */
    public ClienteView() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jtFormaPagamento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtPeriodo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jrbEspera = new javax.swing.JRadioButton();
        jrbAtivo = new javax.swing.JRadioButton();
        jrbDesativar = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtRg = new javax.swing.JTextField();
        jtNascimento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtEndereco = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbLimpar2 = new javax.swing.JButton();
        jbGravar2 = new javax.swing.JButton();
        jbCancelar2 = new javax.swing.JButton();
        jbVoltar2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Forma de Pagamento:");

        jLabel8.setText("Período:");

        buttonGroup1.add(jrbEspera);
        jrbEspera.setText("Em Espera");

        buttonGroup1.add(jrbAtivo);
        jrbAtivo.setText("Ativo");

        buttonGroup1.add(jrbDesativar);
        jrbDesativar.setText("Desativado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbEspera)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jrbDesativar)
                                .addGap(61, 61, 61)
                                .addComponent(jrbAtivo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAtivo)
                    .addComponent(jrbDesativar)
                    .addComponent(jrbEspera))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mensalista", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Avulso", jPanel1);

        jLabel4.setText("RG:");

        jtNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNascimentoActionPerformed(evt);
            }
        });

        jLabel7.setText("Nascimento:");

        jLabel5.setText("CPF:");

        jLabel3.setText("Telefone:");

        jLabel2.setText("Endereço:");

        jLabel1.setText("Nome:");

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbLimpar2.setText("Limpar");
        jbLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpar2ActionPerformed(evt);
            }
        });

        jbGravar2.setText("Gravar");
        jbGravar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravar2ActionPerformed(evt);
            }
        });

        jbCancelar2.setText("Cancelar");
        jbCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar2ActionPerformed(evt);
            }
        });

        jbVoltar2.setText("Voltar");
        jbVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbCancelar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbVoltar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGravar2)
                .addGap(44, 44, 44))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpar2)
                    .addComponent(jbGravar2)
                    .addComponent(jbCancelar2)
                    .addComponent(jbVoltar2))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Cadastro - Novo Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNome)
                                    .addComponent(jtEndereco)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtTelefone)
                                    .addComponent(jtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtNascimento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(141, 141, 141))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpar2ActionPerformed
        jtNome.setText("");
        jtEndereco.setText("");
        jtTelefone.setText("");
        jtNascimento.setText("");
        //jtStatus.setText("");
        jtRg.setText("");
        jtCpf.setText("");
        //jtHrInicio.setText("");
        //jtHrFim.setText("");
    }//GEN-LAST:event_jbLimpar2ActionPerformed
    /**
     * Funcao para obter o valor selecionado em um buttonGroup
     *
     * @param buttonGroup
     * @return
     */
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    private void jbGravar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravar2ActionPerformed
        // TODO add your handling code here:

        ArrayList<String> variaveis = new ArrayList<String>();
        //verificando se campos estão vazios
        if ((jtNome.getText().isEmpty()) || (jtEndereco.getText().isEmpty()) || (jtTelefone.getText().isEmpty())
                || (jtNascimento.getText().isEmpty()) || (jtRg.getText().isEmpty()) || (jtCpf.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar" + " vazios");
        } else {
            variaveis.add(jtNome.getText());
            variaveis.add(jtEndereco.getText());
            variaveis.add(jtTelefone.getText());
            variaveis.add(jtCpf.getText());
            variaveis.add(jtRg.getText());
            variaveis.add(jtNascimento.getText());
            int panel = jTabbedPane1.getSelectedIndex();
        //    int panel2 = jTabbedPane2.getSelectedIndex();
            if (panel == 1) {
                variaveis.add("avulso");
                ClienteControl controle = new ClienteControl();
            if (controle.adiciona(variaveis)) {
                JOptionPane.showMessageDialog(null, "Nome: " + jtNome.getText()
                        + "\nEndereco: " + jtEndereco.getText()
                        + "\nTelefone: " + jtTelefone.getText()
                        + "\nCPF: " + jtCpf.getText()
                        + "\nRG: " + jtRg.getText()
                        + "\nData de Nascimento: " + jtNascimento.getText()
                        + "\nTipo: " + variaveis.get(6));
            }
            }
            if (panel == 0) {
                variaveis.add("mensalista");
               
                    if(jtPeriodo.getText().isEmpty() || jtFormaPagamento.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Os campos não podem retornar" + " vazios");
                    }else{
                        variaveis.add(jtPeriodo.getText());
                        if( jrbEspera.isSelected()){
                            variaveis.add("Em espera");
                        }else if( jrbDesativar.isSelected()){
                            variaveis.add("Desativado");
                        }else if( jrbAtivo.isSelected()){
                            variaveis.add("Ativo");
                        }

                        variaveis.add(jtFormaPagamento.getText());
                        ClienteControl x = new ClienteControl();
                        if(Auxiliar.verificaVagas()){
                            x.adiciona(variaveis);
                            Auxiliar.qntMensalistas++;
                        }else{
                            Auxiliar.addNaFila(variaveis);
                        
                        }
                    }

                    
                    if(jtPeriodo.getText().isEmpty() || jtFormaPagamento.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Os campos não podem retornar" + "vazios");
                    }else{
                        variaveis.add(jtPeriodo.getText());
                        if( jrbEspera.isSelected()){
                            variaveis.add("Em espera");
                        }else if( jrbDesativar.isSelected()){
                            variaveis.add("Desativado");
                        }else if( jrbAtivo.isSelected()){
                            variaveis.add("Ativo");
                        }

                        variaveis.add(jtFormaPagamento.getText());
                        ClienteControl x = new ClienteControl();
                        x.adiciona(variaveis);
                        Auxiliar.qntMensalistas++;

                    }
                
            }
            }
            
        
    }//GEN-LAST:event_jbGravar2ActionPerformed

    private void jbCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar2ActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelar2ActionPerformed

    private void jbVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltar2ActionPerformed
        MenuView voltar = new MenuView();
        voltar.setVisible(true);
    }//GEN-LAST:event_jbVoltar2ActionPerformed

    private void jtNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNascimentoActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbCancelar2;
    private javax.swing.JButton jbGravar2;
    private javax.swing.JButton jbLimpar2;
    private javax.swing.JButton jbVoltar2;
    private javax.swing.JRadioButton jrbAtivo;
    private javax.swing.JRadioButton jrbDesativar;
    private javax.swing.JRadioButton jrbEspera;
    private javax.swing.JTextField jtCpf;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtFormaPagamento;
    private javax.swing.JTextField jtNascimento;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPeriodo;
    private javax.swing.JTextField jtRg;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
}
//teste