/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liborio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        cmbOperaciones.setEnabled(false);
        cmdCrear.setEnabled(true);
        cmdLlenadoManual.setEnabled(false);
        cmdLlenadoAutomatico.setEnabled(false);
        cmdOperacion.setEnabled(false);
        cmdLimpiar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizResultante = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizInicial = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroFilas = new javax.swing.JTextField();
        txtNumeroColumnas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Operaciones con Matrices");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        jPanel3.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 380, 70));

        tblMatrizResultante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatrizResultante);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 320, 180));

        tblMatrizInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMatrizInicial);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 320, 180));

        cmbOperaciones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diagonal Secundaria", "Triangular Superior", "Triangular Inferior", "Traspuesta A La Ingresada", "La Letra A", "La Letra Z", "La Letra T", "La Letra V", "La Letra E", "La Letra F", "La Letra P", "La Letra I", "La Letra N", "La Letra Y", "La Letra X" }));
        jPanel2.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 170, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        cmdLlenadoManual.setText("Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, -1));

        cmdLlenadoAutomatico.setText("Automático");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 90, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        cmdOperacion.setText("Operación");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel4.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 470, 70));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Número de Columnas: ");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, 20));

        jLabel7.setText("Número de Filas: ");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        txtNumeroFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroFilasKeyTyped(evt);
            }
        });
        jPanel5.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, -1));

        txtNumeroColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroColumnasKeyTyped(evt);
            }
        });
        jPanel5.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 40, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 360, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(894, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed

        DefaultTableModel tm, tm2;
        int nf, nc;
        tm = (DefaultTableModel) tblMatrizInicial.getModel();
        tm2 = (DefaultTableModel) tblMatrizResultante.getModel();

        nf = Integer.parseInt(txtNumeroFilas.getText());
        nc = Integer.parseInt(txtNumeroColumnas.getText());

        tm.setRowCount(nf);
        tm.setColumnCount(nc);

        tm2.setRowCount(nf);
        tm2.setColumnCount(nc);
        
        cmbOperaciones.setEnabled(true);
        cmdCrear.setEnabled(false);
        cmdLlenadoManual.setEnabled(true);
        cmdLlenadoAutomatico.setEnabled(true);
        cmdOperacion.setEnabled(true);
        cmdLimpiar.setEnabled(false);
        txtNumeroFilas.setEditable(false);
        txtNumeroColumnas.setEditable(false);

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed

        int aux, nf, nc;
        
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) (Math.random() * 25 + 1);
                tblMatrizInicial.setValueAt(aux, i, j);
            }
            cmbOperaciones.setEnabled(true);
            cmdCrear.setEnabled(false);
            cmdLlenadoManual.setEnabled(false);
            cmdLlenadoAutomatico.setEnabled(false);
            cmdOperacion.setEnabled(true);
            cmdLimpiar.setEnabled(false);
            txtNumeroFilas.setEditable(false);
            txtNumeroColumnas.setEditable(false);

        }
    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed

        int op, nf, nc, cont, aux;

        op = cmbOperaciones.getSelectedIndex();
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();
        cont = 0;

        switch (op) {
            case 0:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (nc - 1 - i == j) {
                            tblMatrizResultante.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (i == 0 || i == (nf - 1) || nc - 1 - i == j) {
                            tblMatrizResultante.setValueAt(aux, i, j);
                        }
                    }

                }
                break;
            case 6:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (i == 0 || j == (nc / 2)) {
                            tblMatrizResultante.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
            case 7:

                break;
            case 8:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (i == 0 || i == (nf - 1) || j == 0 || i == (nf / 2)) {
                            tblMatrizResultante.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
            case 9:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (i == 0 || j == 0 || i == (nf / 2)) {
                            tblMatrizResultante.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
            case 10:

                break;
            case 11:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (j == (nc / 2)) {
                            tblMatrizResultante.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
            case 12:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (j == 0 || i == j || j == (nc - 1)) {
                            tblMatrizResultante.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
            case 13:

                break;
            case 14:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if ((i) == j || nc - 1 - i == j) {
                            tblMatrizResultante.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
    }//GEN-LAST:event_cmdOperacionActionPerformed
        cmbOperaciones.setEnabled(false);
        cmdCrear.setEnabled(false);
        cmdLlenadoManual.setEnabled(false);
        cmdLlenadoAutomatico.setEnabled(false);
        cmdOperacion.setEnabled(false);
        cmdLimpiar.setEnabled(true);
        txtNumeroFilas.setEditable(false);
        txtNumeroColumnas.setEditable(false);
    }
    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        int nf, nc;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tblMatrizInicial.setValueAt("", i, j);
                tblMatrizResultante.setValueAt("", i, j);
            }

        }
        cmbOperaciones.setEnabled(false);
        cmdCrear.setEnabled(true);
        cmdLlenadoManual.setEnabled(false);
        cmdLlenadoAutomatico.setEnabled(false);
        cmdOperacion.setEnabled(false);
        cmdLimpiar.setEnabled(false);
        txtNumeroFilas.setEditable(true);
        txtNumeroColumnas.setEditable(true);
        
        txtNumeroFilas.setText("");
        txtNumeroColumnas.setText("");
        txtNumeroFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);
        txtResultado.setText("");

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtNumeroFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFilasKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroFilasKeyTyped

    private void txtNumeroColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroColumnasKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroColumnasKeyTyped

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        
        int aux, nf, nc;
        
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();
        
         for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = Integer.parseInt(JOptionPane.showInputDialog("Por Favor Llene La Casilla No. : " + i + "," + j));
                tblMatrizInicial.setValueAt(aux, i, j);
            }
         }
          cmbOperaciones.setEnabled(true);
        cmdCrear.setEnabled(false);
        cmdLlenadoManual.setEnabled(false);
        cmdLlenadoAutomatico.setEnabled(false);
        cmdOperacion.setEnabled(false);
        cmdLimpiar.setEnabled(true);
        txtNumeroFilas.setEditable(false);
        txtNumeroColumnas.setEditable(false);
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMatrizInicial;
    private javax.swing.JTable tblMatrizResultante;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
