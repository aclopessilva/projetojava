/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ServicoAvulsoControl;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ServicoAvulsoView extends javax.swing.JFrame {

    /**
     * Creates new form ServicoView
     */
    public ServicoAvulsoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPAvulso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtPlaca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtVaga = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtValor = new javax.swing.JTextField();
        jtMulta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtTotal = new javax.swing.JTextField();
        jtHrEntrada = new javax.swing.JFormattedTextField();
        jtHrSaida = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jrbDinheiro = new javax.swing.JRadioButton();
        jrbCartao = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jbLimpar = new javax.swing.JButton();
        jbGravar = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jbImprimir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmMensalista = new javax.swing.JMenu();
        jmCadastrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hora de Entrada:");

        jLabel2.setText("Hora de Saída:");

        jLabel3.setText("Placa:");

        jtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPlacaActionPerformed(evt);
            }
        });

        jLabel12.setText("Vaga:");

        jtVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVagaActionPerformed(evt);
            }
        });

        jLabel14.setText("Cliente:");

        jLabel6.setText("Valor:");

        jtValor.setText("0");
        jtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtValorActionPerformed(evt);
            }
        });

        jtMulta.setText("0");
        jtMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMultaActionPerformed(evt);
            }
        });

        jLabel7.setText("Multa:");

        jLabel8.setText("Total:");

        jtTotal.setText("0");

        try {
            jtHrEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtHrSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtHrSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHrSaidaActionPerformed(evt);
            }
        });

        jLabel4.setText("Forma de Pagamento:");

        jrbDinheiro.setText("Dinheiro");
        jrbDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDinheiroActionPerformed(evt);
            }
        });

        jrbCartao.setText("Cartão");
        jrbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCartaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAvulsoLayout = new javax.swing.GroupLayout(jPAvulso);
        jPAvulso.setLayout(jPAvulsoLayout);
        jPAvulsoLayout.setHorizontalGroup(
            jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAvulsoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAvulsoLayout.createSequentialGroup()
                        .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbDinheiro)
                            .addComponent(jrbCartao)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPAvulsoLayout.createSequentialGroup()
                        .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPAvulsoLayout.createSequentialGroup()
                                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPAvulsoLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(112, 112, 112))
                                    .addGroup(jPAvulsoLayout.createSequentialGroup()
                                        .addComponent(jtCliente)
                                        .addGap(10, 10, 10)))
                                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(98, 98, 98)
                                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPAvulsoLayout.createSequentialGroup()
                                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jtHrEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtHrSaida)))
                            .addGroup(jPAvulsoLayout.createSequentialGroup()
                                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        jPAvulsoLayout.setVerticalGroup(
            jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAvulsoLayout.createSequentialGroup()
                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPAvulsoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPAvulsoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAvulsoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtHrEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPAvulsoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtHrSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPAvulsoLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel7))
                    .addGroup(jPAvulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPAvulsoLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel8)))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbDinheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbCartao)
                .addGap(31, 31, 31))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jbImprimir.setText("Imprimir");
        jbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExcluir)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpar)
                    .addComponent(jbGravar)
                    .addComponent(jbVoltar)
                    .addComponent(jbImprimir)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir))
                .addContainerGap())
        );

        jmMensalista.setText("Novo");

        jmCadastrar.setText("Cliente");
        jmCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarActionPerformed(evt);
            }
        });
        jmMensalista.add(jmCadastrar);

        jMenuBar1.add(jmMensalista);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPAvulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPAvulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarActionPerformed
        ClienteView m = new ClienteView();
        m.setVisible(true);
    }//GEN-LAST:event_jmCadastrarActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        MenuView mn = new MenuView();
        mn.setVisible(true);
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed

        ArrayList<String> variaveis = new ArrayList<String>();
        
        /**
         * Carregando valores 
         */
        variaveis.add(jtCliente.getText());
        variaveis.add(jtVaga.getText());
        variaveis.add(jtPlaca.getText());
        variaveis.add(jtHrEntrada.getText());
        variaveis.add(jtHrSaida.getText());
        variaveis.add(jtValor.getText());
        variaveis.add(jtMulta.getText());
        variaveis.add(jtTotal.getText());

        
        /**
         * chamando o metodo adiciona do ServicoAvulsoControl.
         */
        ServicoAvulsoControl Incluir = new ServicoAvulsoControl();
        
        /**
         * Metodo adiciona recebe nossas variaveis e
         * retorna um true/false se for inserido ,se responder true, mostramos uma alerta de sucesso.
         */
        if (Incluir.adiciona(variaveis)) {
            JOptionPane.showMessageDialog(null, "Salvado!");
        }


    }//GEN-LAST:event_jbGravarActionPerformed

    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbImprimirActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        //jcbLimpeza.setText("");
        //jcbPolimento.setText("");
        jtPlaca.setText("");
        jtHrEntrada.setText("");
        jtHrSaida.setText("");
        //jCBoxTamanho.setToolTipText("");

    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVagaActionPerformed

    private void jtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPlacaActionPerformed

    private void jtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtValorActionPerformed

    private void jtMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMultaActionPerformed

    private void jtHrSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHrSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHrSaidaActionPerformed

    private void jrbDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbDinheiroActionPerformed

    private void jrbCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbCartaoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(ServicoAvulsoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicoAvulsoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicoAvulsoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicoAvulsoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicoAvulsoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPAvulso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JMenuItem jmCadastrar;
    private javax.swing.JMenu jmMensalista;
    private javax.swing.JRadioButton jrbCartao;
    private javax.swing.JRadioButton jrbDinheiro;
    private javax.swing.JTextField jtCliente;
    private javax.swing.JFormattedTextField jtHrEntrada;
    private javax.swing.JFormattedTextField jtHrSaida;
    private javax.swing.JTextField jtMulta;
    private javax.swing.JTextField jtPlaca;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JTextField jtVaga;
    private javax.swing.JTextField jtValor;
    // End of variables declaration//GEN-END:variables
}
