/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

//Importacion de Clases
import Codigo.Metodos_Electricos;
import Codigo.Metodos_Geometricos;
import Codigo.UsuarioGlobal;
import Codigo.GeneradorExcel;
import Codigo.GeneradorPDF;

/**
 *
 * @author KendallZR
 * @see 1.1.0
 * @since 17/11/2023
 */
public class Calculo_Formulas_Electricas extends javax.swing.JFrame {
    //Instancia de metodos para la creacion de PDF y Excel
        Metodos_Geometricos geometria = new Metodos_Geometricos();
        Metodos_Electricos electricidad = new Metodos_Electricos();
    
    /**
     * Creates new form Calculo_Formulas_Electricas
     */
    public Calculo_Formulas_Electricas() {
        //Para que la ventana aparezca en el centro
        initComponents();
        this.setLocationRelativeTo(null); 
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Resistencia = new javax.swing.JButton();
        Voltaje = new javax.swing.JButton();
        Corriente = new javax.swing.JButton();
        Potencia = new javax.swing.JButton();
        PDF = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        Excel = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nomUsu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú Cálculo de Fórmulas Eléctricas");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        Resistencia.setBackground(new java.awt.Color(0, 51, 51));
        Resistencia.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        Resistencia.setForeground(new java.awt.Color(0, 0, 0));
        Resistencia.setText("Resistencia");
        Resistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Resistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResistenciaActionPerformed(evt);
            }
        });

        Voltaje.setBackground(new java.awt.Color(0, 51, 51));
        Voltaje.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        Voltaje.setForeground(new java.awt.Color(0, 0, 0));
        Voltaje.setText("Voltaje");
        Voltaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltajeActionPerformed(evt);
            }
        });

        Corriente.setBackground(new java.awt.Color(0, 51, 51));
        Corriente.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        Corriente.setForeground(new java.awt.Color(0, 0, 0));
        Corriente.setText("Intensidad de Corriente");
        Corriente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Corriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrienteActionPerformed(evt);
            }
        });

        Potencia.setBackground(new java.awt.Color(0, 51, 51));
        Potencia.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        Potencia.setForeground(new java.awt.Color(0, 0, 0));
        Potencia.setText("Potencia");
        Potencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaActionPerformed(evt);
            }
        });

        PDF.setBackground(new java.awt.Color(0, 51, 51));
        PDF.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        PDF.setForeground(new java.awt.Color(0, 0, 0));
        PDF.setText("Exportar PDF");
        PDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 51, 51));
        jButton13.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.setText("SALIR DEL SISTEMA");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        Excel.setBackground(new java.awt.Color(0, 51, 51));
        Excel.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        Excel.setForeground(new java.awt.Color(0, 0, 0));
        Excel.setText("Exportar Excel");
        Excel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcelActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 51, 51));
        jButton15.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setText("CERRAR SESIÓN");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Corriente, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltaje, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Resistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Voltaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Corriente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Potencia)
                .addGap(12, 12, 12)
                .addComponent(PDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Excel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addGap(10, 10, 10))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        nomUsu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nomUsu.setForeground(new java.awt.Color(255, 255, 255));
        nomUsu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomUsu.setText(UsuarioGlobal.getUserGlobal());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(nomUsu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nomUsu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void VoltajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltajeActionPerformed
        // TODO add your handling code here:
        //Entrar a la ventana de Voltaje
        Voltaje newFrame = new Voltaje();
        
        newFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_VoltajeActionPerformed

    /**
     * 
     * @param evt 
     */
    private void ResistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResistenciaActionPerformed
        // TODO add your handling code here:
        //Entrar a la ventana de Resistencia
        Resistencia newFrame = new Resistencia();
        
        newFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_ResistenciaActionPerformed

    /**
     * 
     * @param evt 
     */
    private void CorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrienteActionPerformed
        // TODO add your handling code here:
        //Entrar a la ventana de Intensidad de Corriente
        Intensidad_de_Corriente newFrame = new Intensidad_de_Corriente();
        
        newFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_CorrienteActionPerformed

    /**
     * 
     * @param evt 
     */
    private void PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaActionPerformed
        // TODO add your handling code here:
        //Entrar a la ventana de Potencia
        Potencia newFrame = new Potencia();
        
        newFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_PotenciaActionPerformed

    /**
     * 
     * @param evt 
     */
    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
        // TODO add your handling code here:
        //LLamado al metodo de creacion del documento PDF
        GeneradorPDF generadorPDF = new GeneradorPDF();
        generadorPDF.generarInformePDF(geometria, electricidad, 
                "informe.pdf");
    }//GEN-LAST:event_PDFActionPerformed

    /**
     * 
     * @param evt 
     */
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        //Salir del programa
        System.exit(0);
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * 
     * @param evt 
     */
    private void ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcelActionPerformed
        // TODO add your handling code here:
        //Llamado al metodo de creacion del documento Excel
        GeneradorExcel generadorExcel = new GeneradorExcel();
        generadorExcel.generarInformeExcel(geometria, electricidad, 
                "informe.xlsx");
    }//GEN-LAST:event_ExcelActionPerformed

    /**
     * 
     * @param evt 
     */
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        //Regresar a Ingreso de Sistema (CERRAR SESION)
        Ingreso_Sistema newFrame = new Ingreso_Sistema();
        
        newFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculo_Formulas_Electricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculo_Formulas_Electricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculo_Formulas_Electricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculo_Formulas_Electricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculo_Formulas_Electricas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Corriente;
    private javax.swing.JButton Excel;
    private javax.swing.JButton PDF;
    private javax.swing.JButton Potencia;
    private javax.swing.JButton Resistencia;
    private javax.swing.JButton Voltaje;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nomUsu;
    // End of variables declaration//GEN-END:variables
}