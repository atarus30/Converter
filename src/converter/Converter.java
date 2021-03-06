/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author amoki
 */
public class Converter extends javax.swing.JFrame {

    /**
     * Creates new form Converter
     */
    public Converter() {
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

        Panel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        TempTextField = new javax.swing.JTextField();
        CelsiusLabel = new javax.swing.JLabel();
        ConverterButton = new javax.swing.JButton();
        FahrenheitLabel = new javax.swing.JLabel();
        TempTextField1 = new javax.swing.JTextField();
        FahrenheitLabel1 = new javax.swing.JLabel();
        ConverterButton1 = new javax.swing.JButton();
        CelsiusLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new java.awt.CardLayout());

        Panel.setBackground(new java.awt.Color(204, 204, 204));
        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel.setForeground(new java.awt.Color(153, 153, 153));
        Panel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("TEMPERATURE CONVERTER");
        Panel.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 563, -1));

        TempTextField.setFont(new java.awt.Font("Lucida Fax", 0, 20)); // NOI18N
        TempTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempTextFieldActionPerformed(evt);
            }
        });
        Panel.add(TempTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 71, 200, 30));

        CelsiusLabel.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        CelsiusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CelsiusLabel.setText("CELSIUS ");
        Panel.add(CelsiusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 71, 167, -1));

        ConverterButton.setBackground(new java.awt.Color(0, 221, 137));
        ConverterButton.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        ConverterButton.setText("CONVERTS TO");
        ConverterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConverterButtonActionPerformed(evt);
            }
        });
        Panel.add(ConverterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 114, 200, 37));

        FahrenheitLabel.setBackground(new java.awt.Color(200, 198, 198));
        FahrenheitLabel.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        FahrenheitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FahrenheitLabel.setText("Fahrenheit ");
        FahrenheitLabel.setToolTipText("");
        Panel.add(FahrenheitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 167, 40));

        TempTextField1.setFont(new java.awt.Font("Lucida Fax", 0, 20)); // NOI18N
        TempTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempTextField1ActionPerformed(evt);
            }
        });
        Panel.add(TempTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 200, 30));

        FahrenheitLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        FahrenheitLabel1.setText("FAHRENHEIT  ");
        Panel.add(FahrenheitLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 160, 30));

        ConverterButton1.setBackground(new java.awt.Color(0, 204, 255));
        ConverterButton1.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        ConverterButton1.setText("CONVERTS TO");
        ConverterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConverterButton1ActionPerformed(evt);
            }
        });
        Panel.add(ConverterButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 200, 40));

        CelsiusLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        CelsiusLabel1.setText("Celsius");
        Panel.add(CelsiusLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 130, 40));

        getContentPane().add(Panel, "Converter ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TempTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempTextFieldActionPerformed
        // TODO add your handling code here:
         int temp = (int)((Double.parseDouble(TempTextField.getText()))
            * 1.8 + 32);
    FahrenheitLabel.setText(temp + "°Fahrenheit");
    }//GEN-LAST:event_TempTextFieldActionPerformed

    private void ConverterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConverterButtonActionPerformed
        // TODO add your handling code here:
        int temp = (int)((Double.parseDouble(TempTextField.getText()))
            * 1.8 + 32);
        FahrenheitLabel.setText(temp + " °Fahrenheit");

    }//GEN-LAST:event_ConverterButtonActionPerformed

    private void TempTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempTextField1ActionPerformed
        // TODO add your handling code here:
        int temp = (int)((Double.parseDouble(TempTextField1.getText())- 32)
                * 1.8);
        CelsiusLabel1.setText(temp + " °Celsius");
    }//GEN-LAST:event_TempTextField1ActionPerformed

    private void ConverterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConverterButton1ActionPerformed
        // TODO add your handling code here:
          int temp = (int)((Double.parseDouble(TempTextField1.getText())- 32)
                * 1.8);
        CelsiusLabel1.setText(temp + " °Celsius");
    }//GEN-LAST:event_ConverterButton1ActionPerformed


 private void DatePane (java.awt.event.ActionEvent evt) throws ParseException{
    String sDate1="31/12/1998";  
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
        System.out.println(sDate1+"\t"+date1); 
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
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Converter().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CelsiusLabel;
    private javax.swing.JLabel CelsiusLabel1;
    private javax.swing.JButton ConverterButton;
    private javax.swing.JButton ConverterButton1;
    private javax.swing.JLabel FahrenheitLabel;
    private javax.swing.JLabel FahrenheitLabel1;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField TempTextField;
    private javax.swing.JTextField TempTextField1;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables
}
