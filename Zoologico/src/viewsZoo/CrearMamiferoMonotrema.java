/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viewsZoo;

import Modelos.MamiferoMonotrema;

/**
 *
 * @author Rey
 */
public class CrearMamiferoMonotrema extends javax.swing.JDialog {
    
    ViewZoo viewZoo = new ViewZoo();

    /**
     * Creates new form CrearMamiferoMonotrema
     */
    public CrearMamiferoMonotrema(java.awt.Frame parent, boolean modal) {
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
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreDeEspecie.setText("Nombre de la especie");
        jPanel1.add(jLabelNombreDeEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 20));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, -1));

        jLabelCantidadDeAnimales.setText("Cantidad de animales");
        jPanel1.add(jLabelCantidadDeAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 20));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 40, 40));

        jLabelCantidadDeHebras.setText("Cantidad de hembras");
        jPanel1.add(jLabelCantidadDeHebras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 20));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 40, 40));

        jLabelPesoMaximo.setText("Peso Maximo");
        jPanel1.add(jLabelPesoMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, 20));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 160, -1));

        jLabelMesDeApariamiento.setText("Mes de apariamiento");
        jPanel1.add(jLabelMesDeApariamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 20));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
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

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 160, -1));

        jLabel1.setText("Color de los huevos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 20));

        jLabel2.setText("Diametro aproximado del huevo ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 160, -1));

        jLabel3.setText("Tiempo en nacer");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 20));

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 160, -1));

        jLabel4.setText("Color de los pelos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 20));

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, -1));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 70, -1));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre = jTextField1.getText();
        int cantAnimal = jSpinner1.getComponentCount();
        int cantHembras = jSpinner2.getComponentCount();
        double peso = Integer.parseInt(jTextField2.getText());
        String mesApareamiento = jTextField3.getText();
        int edad = Integer.parseInt(jTextField4.getText());
        String colorHuevos = (jTextField5.getText());
        double diametroHuevo = Integer.parseInt(jTextField6.getText());
        double tiempoNacer = Integer.parseInt(jTextField7.getText()); 
        String color = (jTextField8.getText());
        
        MamiferoMonotrema mamiferoMonotrema = new MamiferoMonotrema(colorHuevos, diametroHuevo, edad, colorHuevos, nombre, cantAnimal, cantHembras, peso, edad, edad);
       viewZoo.getZooService().agregarNuevoMamiferoMonotrema(colorHuevos, diametroHuevo, colorHuevos, edad, nombre, cantAnimal, cantHembras, peso, edad, edad);
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isDigit(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isLetter(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isDigit(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isDigit(teclaPulsada))
            evt.consume(); 
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if(!Character.isLetter(teclaPulsada))
            evt.consume(); 
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
            java.util.logging.Logger.getLogger(CrearMamiferoMonotrema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMamiferoMonotrema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMamiferoMonotrema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMamiferoMonotrema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearMamiferoMonotrema dialog = new CrearMamiferoMonotrema(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCantidadDeAnimales;
    private javax.swing.JLabel jLabelCantidadDeHebras;
    private javax.swing.JLabel jLabelEdadMaxima;
    private javax.swing.JLabel jLabelMesDeApariamiento;
    private javax.swing.JLabel jLabelNombreDeEspecie;
    private javax.swing.JLabel jLabelPesoMaximo;
    private javax.swing.JPanel jPanel1;
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