/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

/**
 *
 * @author Usuario
 */
public class InterfazCalculadora extends javax.swing.JFrame {
    
    operaciones op = new operaciones();
    
    /**
     * Creates new form InterfazCalculadora
     */
    public InterfazCalculadora() {
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
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        oprestar = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        opigual = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        opborrar = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        opmultiplicar = new javax.swing.JButton();
        opsumar = new javax.swing.JButton();
        opdividir = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        Pantalla = new javax.swing.JLabel();
        binario = new javax.swing.JButton();
        Octagonal = new javax.swing.JButton();
        Hexagonal = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        num1.setBackground(new java.awt.Color(102, 153, 255));
        num1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setBackground(new java.awt.Color(102, 153, 255));
        num2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num4.setBackground(new java.awt.Color(102, 153, 255));
        num4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num3.setBackground(new java.awt.Color(102, 153, 255));
        num3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        oprestar.setBackground(new java.awt.Color(153, 255, 255));
        oprestar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        oprestar.setText("-");
        oprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oprestarActionPerformed(evt);
            }
        });

        num5.setBackground(new java.awt.Color(102, 153, 255));
        num5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setBackground(new java.awt.Color(102, 153, 255));
        num6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num8.setBackground(new java.awt.Color(102, 153, 255));
        num8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        opigual.setBackground(new java.awt.Color(153, 255, 255));
        opigual.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        opigual.setText("=");
        opigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opigualActionPerformed(evt);
            }
        });

        num7.setBackground(new java.awt.Color(102, 153, 255));
        num7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        opborrar.setBackground(new java.awt.Color(153, 255, 255));
        opborrar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        opborrar.setText("C");
        opborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opborrarActionPerformed(evt);
            }
        });

        num9.setBackground(new java.awt.Color(102, 153, 255));
        num9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        opmultiplicar.setBackground(new java.awt.Color(153, 255, 255));
        opmultiplicar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        opmultiplicar.setText("x");
        opmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opmultiplicarActionPerformed(evt);
            }
        });

        opsumar.setBackground(new java.awt.Color(153, 255, 255));
        opsumar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        opsumar.setText("+");
        opsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opsumarActionPerformed(evt);
            }
        });

        opdividir.setBackground(new java.awt.Color(153, 255, 255));
        opdividir.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        opdividir.setText("/");
        opdividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opdividirActionPerformed(evt);
            }
        });

        num0.setBackground(new java.awt.Color(102, 153, 255));
        num0.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        Pantalla.setBackground(new java.awt.Color(204, 204, 255));
        Pantalla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        binario.setText("BIN");
        binario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarioActionPerformed(evt);
            }
        });

        Octagonal.setText("OCT");

        Hexagonal.setText("HEX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num9))
                                    .addComponent(num0))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(opborrar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addComponent(binario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(opigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Octagonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Hexagonal)
                                        .addGap(32, 32, 32))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(opmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(num4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(opsumar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oprestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num3)
                                .addGap(71, 71, 71)
                                .addComponent(opdividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1)
                    .addComponent(num2)
                    .addComponent(num3)
                    .addComponent(opmultiplicar)
                    .addComponent(opdividir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4)
                    .addComponent(num5)
                    .addComponent(num6)
                    .addComponent(opsumar)
                    .addComponent(oprestar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num8)
                    .addComponent(num7)
                    .addComponent(opigual)
                    .addComponent(num9)
                    .addComponent(opborrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num0)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(binario)
                            .addComponent(Octagonal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hexagonal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
      op.agregarNumero(1);
      Pantalla.setText(op.getDigito());
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
      op.agregarNumero(2);
      Pantalla.setText(op.getDigito());
    }//GEN-LAST:event_num2ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
      op.agregarNumero(6);
      Pantalla.setText(op.getDigito());
    }//GEN-LAST:event_num6ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
      op.agregarNumero(0);
      Pantalla.setText(op.getDigito());
    }//GEN-LAST:event_num0ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
      op.agregarNumero(3);
      Pantalla.setText(op.getDigito());
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
      op.agregarNumero(4);
      Pantalla.setText(op.getDigito());
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
      op.agregarNumero(5);
      Pantalla.setText(op.getDigito());
    }//GEN-LAST:event_num5ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
      op.agregarNumero(7);
      Pantalla.setText(op.getDigito());
    }//GEN-LAST:event_num7ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
      op.agregarNumero(8);
      Pantalla.setText(op.getDigito());
    }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
      op.agregarNumero(9);
      Pantalla.setText(op.getDigito());
    }//GEN-LAST:event_num9ActionPerformed

    private void opmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opmultiplicarActionPerformed
        // TODO add your handling code here:
        op.multiplicacion(Pantalla.getText(),op.getConversion());
        Pantalla.setText("");
    }//GEN-LAST:event_opmultiplicarActionPerformed

    private void opdividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opdividirActionPerformed
        // TODO add your handling code here:
        op.dividir(Pantalla.getText(),op.getConversion());
        Pantalla.setText("");
    }//GEN-LAST:event_opdividirActionPerformed

    private void opsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opsumarActionPerformed
        // TODO add your handling code here:
        op.suma(Pantalla.getText(),op.getConversion());
        Pantalla.setText("");
    }//GEN-LAST:event_opsumarActionPerformed

    private void oprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oprestarActionPerformed
        // TODO add your handling code here:
        op.resta(Pantalla.getText(),op.getConversion());
        Pantalla.setText("");
    }//GEN-LAST:event_oprestarActionPerformed

    private void opborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opborrarActionPerformed
        // TODO add your handling code here:
        op.borrar(Pantalla.getText());
        Pantalla.setText(op.getClear());
    }//GEN-LAST:event_opborrarActionPerformed

    private void opigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opigualActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(""+op.resultadoOperacion(Pantalla.getText()));
        
    }//GEN-LAST:event_opigualActionPerformed

    private void binarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarioActionPerformed
        
    }//GEN-LAST:event_binarioActionPerformed


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
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hexagonal;
    private javax.swing.JButton Octagonal;
    private javax.swing.JLabel Pantalla;
    private javax.swing.JButton binario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton opborrar;
    private javax.swing.JButton opdividir;
    private javax.swing.JButton opigual;
    private javax.swing.JButton opmultiplicar;
    private javax.swing.JButton oprestar;
    private javax.swing.JButton opsumar;
    // End of variables declaration//GEN-END:variables
}
