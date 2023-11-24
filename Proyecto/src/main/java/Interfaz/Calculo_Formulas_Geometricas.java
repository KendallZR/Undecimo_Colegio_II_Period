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
public class Calculo_Formulas_Geometricas extends javax.swing.JFrame {
    //Intancia de metodos para la creacion de PDF y Excel
    Metodos_Geometricos geometria = new Metodos_Geometricos();
    Metodos_Electricos electricidad = new Metodos_Electricos();
    
    /**
     * Creates new form Calculo_Formulas_Geometricas
     */
    public Calculo_Formulas_Geometricas() {
        //Para que la venta aparezca en el centro
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
        Rombo = new javax.swing.JButton();
        Poligono = new javax.swing.JButton();
        Romboide = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();
        PDF = new javax.swing.JButton();
        SalirSistema = new javax.swing.JButton();
        Excel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nomUsu1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú Cálculo de Fórmulas Geométricas");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        Rombo.setBackground(new java.awt.Color(0, 51, 51));
        Rombo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        Rombo.setForeground(new java.awt.Color(0, 0, 0));
        Rombo.setText("Área del Rombo");
        Rombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RomboActionPerformed(evt);
            }
        });

        Poligono.setBackground(new java.awt.Color(0, 51, 51));
        Poligono.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        Poligono.setForeground(new java.awt.Color(0, 0, 0));
        Poligono.setText("Área del Poligono");
        Poligono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Poligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoligonoActionPerformed(evt);
            }
        });

        Romboide.setBackground(new java.awt.Color(0, 51, 51));
        Romboide.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        Romboide.setForeground(new java.awt.Color(0, 0, 0));
        Romboide.setText("Área del Romboide");
        Romboide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Romboide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RomboideActionPerformed(evt);
            }
        });

        CerrarSesion.setBackground(new java.awt.Color(0, 51, 51));
        CerrarSesion.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        CerrarSesion.setText("CERRAR SESIÓN");
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
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

        SalirSistema.setBackground(new java.awt.Color(0, 51, 51));
        SalirSistema.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        SalirSistema.setForeground(new java.awt.Color(0, 0, 0));
        SalirSistema.setText("SALIR DEL SISTEMA");
        SalirSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirSistemaActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rombo, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Romboide, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalirSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Poligono, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Rombo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Poligono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Romboide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Excel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(CerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalirSistema)
                .addGap(16, 16, 16))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        nomUsu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nomUsu1.setForeground(new java.awt.Color(255, 255, 255));
        nomUsu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomUsu1.setText(UsuarioGlobal.getUserGlobal());

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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nomUsu1)
                .addGap(371, 371, 371))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomUsu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void RomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RomboActionPerformed
        // TODO add your handling code here:
        //Entrar en la ventana del ROmbo
        Area_del_Rombo newFrame = new Area_del_Rombo();
        
        newFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_RomboActionPerformed

    /**
     * 
     * @param evt 
     */
    private void PoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoligonoActionPerformed
        // TODO add your handling code here:
        //Entrar en la ventana del Poligono
         Area_del_Poligono newFrame = new Area_del_Poligono();
        
        newFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_PoligonoActionPerformed

    /**
     * 
     * @param evt 
     */
    private void RomboideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RomboideActionPerformed
        // TODO add your handling code here:
        //Entrar en la venta del Romboide
         Area_del_Romboide newFrame = new Area_del_Romboide();
        
        newFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_RomboideActionPerformed

    /**
     * 
     * @param evt 
     */
    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // TODO add your handling code here:
        //Regresar a Ingreso de Sistema (CERRAR SESION)
        Ingreso_Sistema newFrame = new Ingreso_Sistema();
        
        newFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    /**
     * 
     * @param evt 
     */
    //Llamado al metodo de creacion del documento PDF
    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
        // TODO add your handling code here:
        GeneradorPDF generadorPDF = new GeneradorPDF();
        generadorPDF.generarInformePDF(geometria, electricidad, 
                "informe.pdf");
    }//GEN-LAST:event_PDFActionPerformed

    /**
     * 
     * @param evt 
     */
    private void SalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirSistemaActionPerformed
        // TODO add your handling code here:
        //Salir del programa
        System.exit(0);
    }//GEN-LAST:event_SalirSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculo_Formulas_Geometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculo_Formulas_Geometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculo_Formulas_Geometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculo_Formulas_Geometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculo_Formulas_Geometricas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton Excel;
    private javax.swing.JButton PDF;
    private javax.swing.JButton Poligono;
    private javax.swing.JButton Rombo;
    private javax.swing.JButton Romboide;
    private javax.swing.JButton SalirSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nomUsu1;
    // End of variables declaration//GEN-END:variables
}
