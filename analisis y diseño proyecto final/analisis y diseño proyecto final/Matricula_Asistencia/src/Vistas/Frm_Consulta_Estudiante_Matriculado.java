
package Vistas;
import Modelo.dmatricula;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;



import Controladores.nmatricula;

public class Frm_Consulta_Estudiante_Matriculado extends javax.swing.JFrame {

  
    public Frm_Consulta_Estudiante_Matriculado() {
        initComponents();
         this.setLocationRelativeTo(null);
 
        
             
               mostrar ("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcodestudiante = new javax.swing.JLabel();
        txtcodperiodo = new javax.swing.JLabel();
        txtcodrepresentante = new javax.swing.JLabel();
        txtcodcurso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcodgrado = new javax.swing.JLabel();
        txtcodgrados = new javax.swing.JLabel();
        txtcodestudiantes = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matricula del Estudiante");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 790, 190));

        jLabel1.setText("Estudiante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 80, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 680, -1));

        jLabel8.setText("Seleccionar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        txtcodestudiante.setForeground(new java.awt.Color(204, 255, 255));
        txtcodestudiante.setText("jLabel3");
        jPanel1.add(txtcodestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, -1, -1));

        txtcodperiodo.setForeground(new java.awt.Color(204, 255, 255));
        txtcodperiodo.setText("jLabel4");
        jPanel1.add(txtcodperiodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        txtcodrepresentante.setForeground(new java.awt.Color(204, 255, 255));
        txtcodrepresentante.setText("jLabel5");
        jPanel1.add(txtcodrepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        txtcodcurso.setForeground(new java.awt.Color(204, 255, 255));
        txtcodcurso.setText("jLabel13");
        jPanel1.add(txtcodcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));
        jPanel1.add(txtcodgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 50, 20));

        txtcodgrados.setForeground(new java.awt.Color(204, 255, 255));
        txtcodgrados.setText("jLabel4");
        jPanel1.add(txtcodgrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, -1));

        txtcodestudiantes.setForeground(new java.awt.Color(204, 255, 255));
        txtcodestudiantes.setText("jLabel5");
        jPanel1.add(txtcodestudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Exit.png"))); // NOI18N
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoMouseClicked

        int fila =listado.rowAtPoint(evt.getPoint());

       
         Frm_Asistencias.txtcodestudiante.setText(listado.getValueAt(fila,1).toString());
         
       Frm_Asistencias.txtdni.setText(listado.getValueAt(fila,2).toString());
        
        
           Frm_Asistencias.txtnombres.setText(listado.getValueAt(fila,3).toString());
        Frm_Asistencias.txtapellidos.setText(listado.getValueAt(fila,4).toString());
        
        
       
         
        
           Frm_Asistencias.txtgrado.setText(listado.getValueAt(fila,5).toString());
           
   
           Frm_Asistencias.txtnivel.setText(listado.getValueAt(fila,6).toString());
           
   
           
       
     
Frm_Asistencias.txtcodgrado.setText(listado.getValueAt(fila,9).toString());
      

hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_listadoMouseClicked
void mostrar (String buscar){
            
        
        try  {
        
            DefaultTableModel modelo;
            nmatricula f = new nmatricula();
            
            
      
            
            modelo = f.mostrar (buscar);
            
            
    
            
            listado.setModel(modelo);
            
             }catch(Exception e){
               
    JOptionPane.showMessageDialog(rootPane,e);
       
           }
           
      }


    

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
//
//        mostrardatos(jTextField1.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped


mostrar(jTextField1.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(Frm_Consulta_Estudiante_Matriculado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Consulta_Estudiante_Matriculado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Consulta_Estudiante_Matriculado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Consulta_Estudiante_Matriculado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Consulta_Estudiante_Matriculado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable listado;
    public static javax.swing.JLabel txtcodcurso;
    public static javax.swing.JLabel txtcodestudiante;
    public static javax.swing.JLabel txtcodestudiantes;
    private javax.swing.JLabel txtcodgrado;
    public static javax.swing.JLabel txtcodgrados;
    public static javax.swing.JLabel txtcodperiodo;
    public static javax.swing.JLabel txtcodrepresentante;
    // End of variables declaration//GEN-END:variables
}
