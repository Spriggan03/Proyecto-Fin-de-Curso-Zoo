/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viewsZoo;

import Modelos.Reptil;

/**
 *
 * @author Rey
 */
public class CrearReptil extends javax.swing.JDialog {

    /**
     * Creates new form CrearReptil
     */
    public CrearReptil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jButton2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombreDeEspecie = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabelCantidadDeAnimales = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabelCantidadDeHebras = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabelPesoMaximo = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabelMesDeApariamiento = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabelEdadMaxima = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabelLargoMaximo = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabelColorPiel = new javax.swing.JLabel();
        jLabelColorHevos = new javax.swing.JLabel();
        jLabelDiamHuevos = new javax.swing.JLabel();
        jLabelTiempoNacer = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabelPatas = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreDeEspecie.setText("Nombre de la especie");
        jPanel1.add(jLabelNombreDeEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 20));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, -1));

        jLabelCantidadDeAnimales.setText("Cantidad de animales");
        jPanel1.add(jLabelCantidadDeAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 20));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 50, 40));

        jLabelCantidadDeHebras.setText("Cantidad de hembras");
        jPanel1.add(jLabelCantidadDeHebras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 20));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 50, 40));

        jLabelPesoMaximo.setText("Peso Maximo");
        jPanel1.add(jLabelPesoMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, 20));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 160, -1));

        jLabelMesDeApariamiento.setText("Mes de apariamiento");
        jPanel1.add(jLabelMesDeApariamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 20));

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 160, -1));

        jLabelEdadMaxima.setText("Edad Maxima");
        jPanel1.add(jLabelEdadMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 120, 20));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 160, -1));

        jLabelLargoMaximo.setText("Largo maximo");
        jPanel1.add(jLabelLargoMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 20));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 160, -1));

        jLabelColorPiel.setText("Color de la piel");
        jPanel1.add(jLabelColorPiel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 20));

        jLabelColorHevos.setText("Color de los huevos");
        jPanel1.add(jLabelColorHevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, 20));

        jLabelDiamHuevos.setText("Diametro aproximado de los huevos");
        jPanel1.add(jLabelDiamHuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, 20));

        jLabelTiempoNacer.setText("Tiepo que demora en nacer");
        jPanel1.add(jLabelTiempoNacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 180, 20));

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 160, -1));

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 160, 20));

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, -1));

        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 160, -1));

        jLabelPatas.setText("Tiene patas");
        jPanel1.add(jLabelPatas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 80, 20));

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Si");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        String nombre = jTextField1.getText();
        int cantidadAnimales = jSpinner1.getComponentCount();
        int cantHembras = jSpinner2.getComponentCount();
        double peso = Integer.parseInt(jTextField2.getText());
        String mesApareamiento = jTextField3.getText();
        int edad = Integer.parseInt(jTextField4.getText());   
        double largoMaximo = Integer.parseInt(jTextField5.getText());
        String color = jTextField6.getText();
        String colorHuevos = jTextField7.getText();  
        double diametroHuevo = Integer.parseInt(jTextField8.getText());
        int tiempoNacer = Integer.parseInt(jTextField9.getText());
        boolean tienePatas = true;
        if  (jRadioButton1.isSelected())
            tienePatas  = true;
        if(jRadioButton2.isSelected())
            tienePatas = false;
        
        Reptil reptil = new Reptil(largoMaximo, color, tienePatas, colorHuevos, diametroHuevo, tiempoNacer, nombre, cantidadAnimales, cantHembras, largoMaximo, tiempoNacer, edad);
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isLetter(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isDigit(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isDigit(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isDigit(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isLetter(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isLetter(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isDigit(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isDigit(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField9KeyTyped

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
            java.util.logging.Logger.getLogger(CrearReptil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearReptil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearReptil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearReptil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearReptil dialog = new CrearReptil(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabelCantidadDeAnimales;
    private javax.swing.JLabel jLabelCantidadDeHebras;
    private javax.swing.JLabel jLabelColorHevos;
    private javax.swing.JLabel jLabelColorPiel;
    private javax.swing.JLabel jLabelDiamHuevos;
    private javax.swing.JLabel jLabelEdadMaxima;
    private javax.swing.JLabel jLabelLargoMaximo;
    private javax.swing.JLabel jLabelMesDeApariamiento;
    private javax.swing.JLabel jLabelNombreDeEspecie;
    private javax.swing.JLabel jLabelPatas;
    private javax.swing.JLabel jLabelPesoMaximo;
    private javax.swing.JLabel jLabelTiempoNacer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
