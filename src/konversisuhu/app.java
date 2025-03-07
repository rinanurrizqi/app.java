/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package konversisuhu;

/**
 *
 * @author UsEr
 */
public class app extends javax.swing.JFrame {

    /**
     * Creates new form app
     */
    public app() {
        initComponents();
        Reset();
    }
    void Reset(){
        tSuhuAsal.setText(null);
        vHasil.setText(null);
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
        jPanel1 = new javax.swing.JPanel();
        tSuhuAsal = new javax.swing.JTextField();
        tSkalaAsal = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        tSkalaTujuan = new javax.swing.JComboBox<>();
        bKonversi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        vHasil = new javax.swing.JLabel();
        bReset = new javax.swing.JButton();
        bClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konversisuhu/thermometer.png"))); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SUHU ASAL"));

        tSuhuAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSuhuAsalActionPerformed(evt);
            }
        });

        tSkalaAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Fahrenheit" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tSuhuAsal)
            .addComponent(tSkalaAsal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSuhuAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tSkalaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("KONVERSI KE"));

        tSkalaTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Fahrenheit" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tSkalaTujuan, 0, 337, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tSkalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bKonversi.setBackground(new java.awt.Color(153, 204, 255));
        bKonversi.setText("KONVERSI");
        bKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKonversiActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL"));
        jPanel3.setLayout(new java.awt.BorderLayout());

        vHasil.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        vHasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vHasil.setText("hasil");
        jPanel3.add(vHasil, java.awt.BorderLayout.CENTER);

        bReset.setBackground(new java.awt.Color(153, 255, 255));
        bReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konversisuhu/circular.png"))); // NOI18N
        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bClose.setBackground(new java.awt.Color(153, 255, 255));
        bClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konversisuhu/close.png"))); // NOI18N
        bClose.setText("CLOSE");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bKonversi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bClose, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bKonversi)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset)
                    .addComponent(bClose))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKonversiActionPerformed
        // TODO add your handling code here:
        double SuhuAsal = Double.parseDouble(tSuhuAsal.getText());
        String SkalaAsal = tSkalaAsal.getSelectedItem().toString();
        String SkalaTujuan =tSkalaTujuan.getSelectedItem().toString();
        double Hasil = 0;
        if(SkalaAsal.equals("Celcius") && SkalaTujuan.equals("Celcius")) {
        Hasil = SuhuAsal;
        
        } else if(SkalaAsal.equals("Celcius") &&SkalaTujuan.equals("Kelvin")) {
            Hasil = SuhuAsal + 273.15;
            
        } else if(SkalaAsal.equals("Celcius") && SkalaTujuan.equals("Fahrenheit")) {
            Hasil = SuhuAsal * 9/5 + 32;
            
        } else if(SkalaAsal.equals("Kelvin") && SkalaTujuan.equals("Kelvin")) {
            Hasil = SuhuAsal;
            
        } else if(SkalaAsal.equals("Kelvin") && SkalaTujuan.equals("Celcius")) {
            Hasil = SuhuAsal - 273.15;
            
        } else if(SkalaAsal.equals("Kelvin") && SkalaTujuan.equals("Fahrenheit")) {
            Hasil = (SuhuAsal - 273.15) * 9/5 + 32;
            
        } else if(SkalaAsal.equals("Fahrenheit") && SkalaTujuan.equals("Fahrenheit")) {
            Hasil = SuhuAsal;
            
        } else if(SkalaAsal.equals("Fahrenheit") && SkalaTujuan.equals("Celcius")) {
            Hasil = (SuhuAsal - 32) * 5/9;
            
        } else if(SkalaAsal.equals("Fahrenheit") && SkalaTujuan.equals("Kelvin")) {
            Hasil = (SuhuAsal - 32) * 5/9 + 273.15;
        }
        String Skala = SkalaTujuan.substring(0,1);
        vHasil.setText(String.format("%.2f", Hasil) + "\u00B0" + Skala);
    }//GEN-LAST:event_bKonversiActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void tSuhuAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSuhuAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSuhuAsalActionPerformed

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bCloseActionPerformed

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
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JButton bKonversi;
    private javax.swing.JButton bReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> tSkalaAsal;
    private javax.swing.JComboBox<String> tSkalaTujuan;
    private javax.swing.JTextField tSuhuAsal;
    private javax.swing.JLabel vHasil;
    // End of variables declaration//GEN-END:variables
}
