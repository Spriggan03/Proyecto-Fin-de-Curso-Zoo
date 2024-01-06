/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewsZoo;

import Modelos.Carnivoro;
import Modelos.Herbivoro;
import Modelos.Mamifero;
import javafx.scene.control.RadioButton; 

/**
 *
 * @author Rey
 */
public class CrearMamifero extends javax.swing.JDialog {

    ViewZoo viewZoo = new ViewZoo();

    /**
     * Creates new form CrearMamifero
     */
    public CrearMamifero(java.awt.Frame parent, boolean modal) {
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
        jLabelDuraionGestaion = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabelolorDeLosPelos = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabelPromComida = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabelTipoDeAlimentaccion = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreDeEspecie.setText("Nombre de la especie");
        jPanel1.add(jLabelNombreDeEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 20));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 160, -1));

        jLabelCantidadDeAnimales.setText("Cantidad de animales");
        jPanel1.add(jLabelCantidadDeAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 20));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 40, 40));

        jLabelCantidadDeHebras.setText("Cantidad de hembras");
        jPanel1.add(jLabelCantidadDeHebras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 20));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 40, 40));

        jLabelPesoMaximo.setText("Peso Maximo");
        jPanel1.add(jLabelPesoMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 30));

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 160, -1));

        jLabelMesDeApariamiento.setText("Mes de apariamiento");
        jPanel1.add(jLabelMesDeApariamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 30));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 160, -1));

        jLabelEdadMaxima.setText("Edad Maxima");
        jPanel1.add(jLabelEdadMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 30));

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
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 160, -1));

        jLabelDuraionGestaion.setText("Duracion de gestacion");
        jPanel1.add(jLabelDuraionGestaion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 30));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 160, -1));

        jLabelolorDeLosPelos.setText("Color de los pelos");
        jPanel1.add(jLabelolorDeLosPelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, 30));

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 160, -1));

        jLabelPromComida.setText("Promedio de consumo diario de comida");
        jPanel1.add(jLabelPromComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 230, 30));

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 160, -1));

        jLabelTipoDeAlimentaccion.setText("Tipo de alimentaccion");
        jPanel1.add(jLabelTipoDeAlimentaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 180, 20));

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 70, -1));

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        jLabel1.setText("Color característio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 20));

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 160, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Carnivoro");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Herbívoro");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
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
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        String nombre = jTextField1.getText();
        int cantAnimal = jSpinner1.getComponentCount();
        int cantHembras = jSpinner2.getComponentCount();
        double peso = Integer.parseInt(jTextField2.getText());
        String mesApareamiento = jTextField3.getText();
        int edad = Integer.parseInt(jTextField4.getText());
        double tiempoGestacion = Integer.parseInt(jTextField5.getText());
        String colorPelos = jTextField6.getText();
        double avgComida = Integer.parseInt(jTextField7.getText());
        String color = jTextField8.getText();
        boolean tipoDeAlimentacion = true;
        if (jRadioButton1.isSelected()) {
            tipoDeAlimentacion = true;
            Carnivoro carnivoro = new Carnivoro(avgComida, nombre, cantAnimal, cantHembras, peso, edad, edad, cantAnimal, colorPelos);
            
        }
        if (jRadioButton2.isSelected()) {
            tipoDeAlimentacion = false;
            Herbivoro hervivoro = new Herbivoro(tiempoGestacion, nombre, cantAnimal, cantHembras, peso, edad, edad, cantAnimal, colorPelos);
        }


    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isLetter(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isLetter(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isLetter(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

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
            java.util.logging.Logger.getLogger(CrearMamifero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMamifero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMamifero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMamifero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearMamifero dialog = new CrearMamifero(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCantidadDeAnimales;
    private javax.swing.JLabel jLabelCantidadDeHebras;
    private javax.swing.JLabel jLabelDuraionGestaion;
    private javax.swing.JLabel jLabelEdadMaxima;
    private javax.swing.JLabel jLabelMesDeApariamiento;
    private javax.swing.JLabel jLabelNombreDeEspecie;
    private javax.swing.JLabel jLabelPesoMaximo;
    private javax.swing.JLabel jLabelPromComida;
    private javax.swing.JLabel jLabelTipoDeAlimentaccion;
    private javax.swing.JLabel jLabelolorDeLosPelos;
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
    // End of variables declaration//GEN-END:variables
}
