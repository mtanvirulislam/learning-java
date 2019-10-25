package ContadorPrioridad;
import java.awt.Component;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tanvir
 */
public class mainContadorPrioridad extends javax.swing.JFrame {

    /**
     * Creates new form mainContadorPrioridad
     */
    Numero n1;
    Numero n2;
    Numero n3;
    HiloContador hc1;
    HiloContador hc2;
    HiloContador hc3;

    public mainContadorPrioridad() {
        initComponents();

        n1 = new Numero(contador1);
        n2 = new Numero(contador2);
        n3 = new Numero(contador3);
        hc1 = new HiloContador(n1, "hilo1");
        hc2 = new HiloContador(n2, "hilo2");
        hc3 = new HiloContador(n3, "hilo3");

        txt_pri_con1.setText("Pri: " + hc1.getThread().getPriority());
        txt_pri_con2.setText("Pri: " + hc2.getThread().getPriority());
        txt_pri_con3.setText("Pri: " + hc3.getThread().getPriority());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_pri_mas_con1 = new javax.swing.JButton();
        btn_iniciar_con1 = new javax.swing.JButton();
        btn_pri_menos_con1 = new javax.swing.JButton();
        btn_pri_mas_con2 = new javax.swing.JButton();
        btn_iniciar_con2 = new javax.swing.JButton();
        btn_pri_menos_con2 = new javax.swing.JButton();
        btn_pri_mas_con3 = new javax.swing.JButton();
        btn_iniciar_con3 = new javax.swing.JButton();
        btn_pri_menos_con3 = new javax.swing.JButton();
        btn_finalizar = new javax.swing.JButton();
        txt_con1 = new javax.swing.JLabel();
        txt_con2 = new javax.swing.JLabel();
        txt_con3 = new javax.swing.JLabel();
        txt_pri_con1 = new javax.swing.JLabel();
        txt_pri_con2 = new javax.swing.JLabel();
        txt_pri_con3 = new javax.swing.JLabel();
        contador1 = new javax.swing.JLabel();
        contador2 = new javax.swing.JLabel();
        contador3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contador prioridad");

        jPanel1.setBackground(java.awt.Color.yellow);
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        btn_pri_mas_con1.setText("++");
        btn_pri_mas_con1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pri_mas_con1ActionPerformed(evt);
            }
        });

        btn_iniciar_con1.setText("Iniciar");
        btn_iniciar_con1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar_con1ActionPerformed(evt);
            }
        });

        btn_pri_menos_con1.setText("--");
        btn_pri_menos_con1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pri_menos_con1ActionPerformed(evt);
            }
        });

        btn_pri_mas_con2.setText("++");
        btn_pri_mas_con2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pri_mas_con2ActionPerformed(evt);
            }
        });

        btn_iniciar_con2.setText("Iniciar");
        btn_iniciar_con2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar_con2ActionPerformed(evt);
            }
        });

        btn_pri_menos_con2.setText("--");
        btn_pri_menos_con2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pri_menos_con2ActionPerformed(evt);
            }
        });

        btn_pri_mas_con3.setText("++");
        btn_pri_mas_con3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pri_mas_con3ActionPerformed(evt);
            }
        });

        btn_iniciar_con3.setText("Iniciar");
        btn_iniciar_con3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar_con3ActionPerformed(evt);
            }
        });

        btn_pri_menos_con3.setText("--");
        btn_pri_menos_con3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pri_menos_con3ActionPerformed(evt);
            }
        });

        btn_finalizar.setText("Finalizar Todos");
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });

        txt_con1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_con1.setText("Hilo1:");

        txt_con2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_con2.setText("Hilo2:");

        txt_con3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_con3.setText("Hilo3:");

        txt_pri_con1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_pri_con1.setText("Pri:");

        txt_pri_con2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_pri_con2.setText("Pri:");

        txt_pri_con3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_pri_con3.setText("Pri:");

        contador1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        contador1.setText("0");

        contador2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        contador2.setText("0");

        contador3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        contador3.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_con2)
                        .addGap(18, 18, 18)
                        .addComponent(contador2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_con3)
                        .addGap(18, 18, 18)
                        .addComponent(contador3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_con1)
                        .addGap(18, 18, 18)
                        .addComponent(contador1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pri_con1)
                    .addComponent(txt_pri_con2)
                    .addComponent(txt_pri_con3))
                .addGap(84, 84, 84))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pri_mas_con1)
                    .addComponent(btn_pri_mas_con2)
                    .addComponent(btn_pri_mas_con3))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_iniciar_con1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iniciar_con2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iniciar_con3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pri_menos_con1)
                    .addComponent(btn_pri_menos_con2)
                    .addComponent(btn_pri_menos_con3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_iniciar_con1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pri_mas_con1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pri_menos_con1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_iniciar_con2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pri_mas_con2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pri_menos_con2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_iniciar_con3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pri_mas_con3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pri_menos_con3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_con1)
                    .addComponent(contador1)
                    .addComponent(txt_pri_con1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_con2)
                            .addComponent(contador2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(txt_pri_con2)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_con3)
                    .addComponent(contador3)
                    .addComponent(txt_pri_con3))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pri_menos_con3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pri_menos_con3ActionPerformed
        // TODO add your handling code here:
        HiloPrioridad(hc3.getThread(), txt_pri_con3, "restar");
    }//GEN-LAST:event_btn_pri_menos_con3ActionPerformed

    private void btn_iniciar_con3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar_con3ActionPerformed
        // TODO add your handling code here:
        if (n3.getIniciar() == false) {
            n3.iniciar();
            btn_iniciar_con3.setText("Parar hilo 3");
        } else if (n3.getIniciar() == true) {
            n3.parar();
            btn_iniciar_con3.setText("Continuar");
        }
    }//GEN-LAST:event_btn_iniciar_con3ActionPerformed

    private void btn_pri_mas_con3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pri_mas_con3ActionPerformed
        // TODO add your handling code here:
        HiloPrioridad(hc3.getThread(), txt_pri_con3, "sumar");
    }//GEN-LAST:event_btn_pri_mas_con3ActionPerformed

    private void btn_pri_menos_con2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pri_menos_con2ActionPerformed
        // TODO add your handling code here:
        HiloPrioridad(hc2.getThread(), txt_pri_con2, "restar");
    }//GEN-LAST:event_btn_pri_menos_con2ActionPerformed

    private void btn_iniciar_con2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar_con2ActionPerformed
        // TODO add your handling code here:
        if (n2.getIniciar() == false) {
            n2.iniciar();
            btn_iniciar_con2.setText("Parar hilo 2");
        } else if (n2.getIniciar() == true) {
            n2.parar();
            btn_iniciar_con2.setText("Continuar");
        }
    }//GEN-LAST:event_btn_iniciar_con2ActionPerformed

    private void btn_pri_mas_con2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pri_mas_con2ActionPerformed
        // TODO add your handling code here:
        HiloPrioridad(hc2.getThread(), txt_pri_con2, "sumar");
    }//GEN-LAST:event_btn_pri_mas_con2ActionPerformed

    private void btn_pri_menos_con1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pri_menos_con1ActionPerformed
        // TODO add your handling code here:
        HiloPrioridad(hc1.getThread(), txt_pri_con1, "restar");
    }//GEN-LAST:event_btn_pri_menos_con1ActionPerformed

    private void btn_iniciar_con1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar_con1ActionPerformed
        // TODO add your handling code here:
        if (n1.getIniciar() == false) {
            n1.iniciar();
            btn_iniciar_con1.setText("Parar hilo 1");
        } else if (n1.getIniciar() == true) {
            n1.parar();
            btn_iniciar_con1.setText("Continuar");
        }
    }//GEN-LAST:event_btn_iniciar_con1ActionPerformed

    private void btn_pri_mas_con1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pri_mas_con1ActionPerformed
        // TODO add your handling code here:
        HiloPrioridad(hc1.getThread(), txt_pri_con1, "sumar");
    }//GEN-LAST:event_btn_pri_mas_con1ActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        // TODO add your handling code here:
        if ((n1.getIniciar() == true) || (n2.getIniciar() == true) || (n2.getIniciar() == true)) {
            Component[] comp = jPanel1.getComponents();
            hc1.setParar(true);
            btn_iniciar_con1.setText("Finalizado !!");
            hc2.setParar(true);
            btn_iniciar_con2.setText("Finalizado !!");
            hc3.setParar(true);
            btn_iniciar_con3.setText("Finalizado !!");

            for (Component comp1 : comp) {
                if (comp1 instanceof JButton) {
                    comp1.setEnabled(false);
                }
            }

        }
    }//GEN-LAST:event_btn_finalizarActionPerformed

    void HiloPrioridad(Thread t, JLabel l, String tipo) {
        if (tipo.equals("sumar")) {
            if (t.getPriority() + 1 <= 10) {
                t.setPriority(t.getPriority() + 1);
                l.setText("Pri: " + t.getPriority());
            }
        } else if (tipo.equals("restar")) {
            if (t.getPriority() - 1 >= 1) {
                t.setPriority(t.getPriority() - 1);
                l.setText("Pri: " + t.getPriority());
            }
        }
    }

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
            java.util.logging.Logger.getLogger(mainContadorPrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainContadorPrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainContadorPrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainContadorPrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainContadorPrioridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_iniciar_con1;
    private javax.swing.JButton btn_iniciar_con2;
    private javax.swing.JButton btn_iniciar_con3;
    private javax.swing.JButton btn_pri_mas_con1;
    private javax.swing.JButton btn_pri_mas_con2;
    private javax.swing.JButton btn_pri_mas_con3;
    private javax.swing.JButton btn_pri_menos_con1;
    private javax.swing.JButton btn_pri_menos_con2;
    private javax.swing.JButton btn_pri_menos_con3;
    private javax.swing.JLabel contador1;
    private javax.swing.JLabel contador2;
    private javax.swing.JLabel contador3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_con1;
    private javax.swing.JLabel txt_con2;
    private javax.swing.JLabel txt_con3;
    private javax.swing.JLabel txt_pri_con1;
    private javax.swing.JLabel txt_pri_con2;
    private javax.swing.JLabel txt_pri_con3;
    // End of variables declaration//GEN-END:variables
}
