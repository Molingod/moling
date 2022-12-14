/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classepenna;

import static javax.xml.bind.DatatypeConverter.parseString;

/**
 *
 * @author matthias.moling
 */
public class Interfaccia extends javax.swing.JFrame {

    /**
     * Creates new form Interfaccia
     */
    public Interfaccia() {
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
        apriPenna = new javax.swing.JButton();
        scrivi = new javax.swing.JButton();
        stato1 = new javax.swing.JLabel();
        parola = new javax.swing.JTextField();
        invia1 = new javax.swing.JButton();
        rifornisci = new javax.swing.JButton();
        ripara = new javax.swing.JButton();
        colore = new javax.swing.JTextField();
        invia2 = new javax.swing.JButton();
        stato2 = new javax.swing.JLabel();
        visualizza = new javax.swing.JButton();
        testo = new javax.swing.JLabel();
        esci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Penna simulator 3D");

        apriPenna.setText("Apri o chiudi penna");
        apriPenna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apriPennaActionPerformed(evt);
            }
        });

        scrivi.setText("Scrivi");
        scrivi.setEnabled(false);
        scrivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scriviActionPerformed(evt);
            }
        });

        stato1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stato1.setText("Stato: Chiusa");

        parola.setText("Inserire parola");
        parola.setEnabled(false);

        invia1.setText("Invia");
        invia1.setEnabled(false);
        invia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invia1ActionPerformed(evt);
            }
        });

        rifornisci.setText("Rifornisci");
        rifornisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rifornisciActionPerformed(evt);
            }
        });

        ripara.setText("Ripara");
        ripara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riparaActionPerformed(evt);
            }
        });

        colore.setText("Inserire colore");
        colore.setEnabled(false);
        colore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coloreActionPerformed(evt);
            }
        });

        invia2.setText("Invia");
        invia2.setEnabled(false);
        invia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invia2ActionPerformed(evt);
            }
        });

        stato2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stato2.setText("Stato: Funzionante");

        visualizza.setText("Visualizza testo");
        visualizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizzaActionPerformed(evt);
            }
        });

        testo.setText("Roba scritta.");

        esci.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        esci.setText("Esci very fast");
        esci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(esci, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apriPenna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rifornisci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ripara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(visualizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(testo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(parola, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invia1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colore, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invia2))
                            .addComponent(stato2)
                            .addComponent(stato1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apriPenna, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stato1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scrivi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invia1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rifornisci, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invia2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ripara, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stato2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visualizza, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(esci, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apriPennaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apriPennaActionPerformed
        // TODO add your handling code here:
        if (Istanziatore.penna1.isAperta()) {
            Istanziatore.penna1.setAperta(false);
            stato1.setText("Stato: Chiusa");
            scrivi.setEnabled(false);
            rifornisci.setEnabled(true);
            
            ripara.setEnabled(true);
            visualizza.setEnabled(true);
            esci.setEnabled(true);
        } else {
            Istanziatore.penna1.setAperta(true);
            stato1.setText("Stato: Aperta");
            scrivi.setEnabled(true);
            rifornisci.setEnabled(false);
            
            ripara.setEnabled(false);
            visualizza.setEnabled(false);
            esci.setEnabled(false);
        }
    }//GEN-LAST:event_apriPennaActionPerformed

    private void scriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scriviActionPerformed
        // TODO add your handling code here:
        parola.setEnabled(true);
        invia1.setEnabled(true);
    }//GEN-LAST:event_scriviActionPerformed

    private void invia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invia1ActionPerformed
        // TODO add your handling code here:
        parola.setEnabled(false);
        invia1.setEnabled(false);
        
        String parolatemp;
        parolatemp = parseString(parola.getText());
        
        Istanziatore.penna1.scrivi(parolatemp);
        
        if (Istanziatore.penna1.isFunzionante()==false)
            stato2.setText("Non funzionante!");
    }//GEN-LAST:event_invia1ActionPerformed

    private void rifornisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rifornisciActionPerformed
        // TODO add your handling code here:
        colore.setEnabled(true);
        invia2.setEnabled(true);
    }//GEN-LAST:event_rifornisciActionPerformed

    private void riparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riparaActionPerformed
        // TODO add your handling code here:
        if (Istanziatore.penna1.isFunzionante()==false) {
            Istanziatore.penna1.aggiustaPenna();
            stato2.setText("Stato: Funzionante");
        }
    }//GEN-LAST:event_riparaActionPerformed

    private void coloreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coloreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coloreActionPerformed

    private void invia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invia2ActionPerformed
        // TODO add your handling code here:
        colore.setEnabled(false);
        invia2.setEnabled(false);
        
        String coloretemp;
        coloretemp = parseString(colore.getText());
        
        Istanziatore.penna1.rifornisciInchiostro(coloretemp);
    }//GEN-LAST:event_invia2ActionPerformed

    private void visualizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizzaActionPerformed
        // TODO add your handling code here:
        testo.setText(Istanziatore.penna1.getRobaScritta());
    }//GEN-LAST:event_visualizzaActionPerformed

    private void esciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esciActionPerformed
        // TODO add your handling code here:
        Istanziatore.interfaccia.setVisible(false);
    }//GEN-LAST:event_esciActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaccia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apriPenna;
    private javax.swing.JTextField colore;
    private javax.swing.JButton esci;
    private javax.swing.JButton invia1;
    private javax.swing.JButton invia2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField parola;
    private javax.swing.JButton rifornisci;
    private javax.swing.JButton ripara;
    private javax.swing.JButton scrivi;
    private javax.swing.JLabel stato1;
    private javax.swing.JLabel stato2;
    private javax.swing.JLabel testo;
    private javax.swing.JButton visualizza;
    // End of variables declaration//GEN-END:variables
}
