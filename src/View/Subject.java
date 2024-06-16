/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controlle.DeleteController;
import Controlle.UpdateController;
import Controlle.insertController;
import Model.DBConnection;
import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author madur
 */
public class Subject extends javax.swing.JFrame {

    
    Statement stmt;
    ResultSet rs;
    /**
     * Creates new form Subject
     */
    public Subject() {
        initComponents();
        subTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        updateCourseBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        subCodeTF = new javax.swing.JTextField();
        subnameTF = new javax.swing.JTextField();
        subCmb = new javax.swing.JComboBox<>();
        lecIDTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        subID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 203));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Subject Code");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 158, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Subject");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 193, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Faculty");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        c.setBackground(new java.awt.Color(255, 255, 255));
        c.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c.setText("Lecturer ID");
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 24));

        jButton1.setBackground(new java.awt.Color(245, 196, 63));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        updateCourseBtn.setBackground(new java.awt.Color(245, 196, 63));
        updateCourseBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateCourseBtn.setText("Update");
        updateCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCourseBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateCourseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jButton3.setBackground(new java.awt.Color(245, 196, 63));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        subCodeTF.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        subCodeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCodeTFActionPerformed(evt);
            }
        });
        jPanel1.add(subCodeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 157, 394, -1));

        subnameTF.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        subnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subnameTFActionPerformed(evt);
            }
        });
        jPanel1.add(subnameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 192, 394, -1));

        subCmb.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        subCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "Science", "Management", "Engineering", "Law" }));
        subCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCmbActionPerformed(evt);
            }
        });
        jPanel1.add(subCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 270, -1));

        lecIDTF.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lecIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecIDTFActionPerformed(evt);
            }
        });
        jPanel1.add(lecIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 394, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 160, 17));
        jLabel5.setText("SUBJECT");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(249, 197, 56));

        searchBtn.setBackground(new java.awt.Color(245, 196, 63));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        subID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        subID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subIDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("Enter Subject Code");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(subID, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(subID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 88, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 19, -1, 33));

        subTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subTable.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        subTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Subject Code", "Subject", "Faculty", "Lec ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subTableMouseClicked(evt);
            }
        });
        subTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(subTable);
        if (subTable.getColumnModel().getColumnCount() > 0) {
            subTable.getColumnModel().getColumn(0).setResizable(false);
            subTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 530, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subCodeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCodeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subCodeTFActionPerformed

    private void subnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subnameTFActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
    
        try {
            
            String sub = searchBtn.getText();
            
            ResultSet rs = new DBSearch().searchSub(sub);
            
            while(rs.next()){
            
            String subcode = rs.getString("subid");
            String name = rs.getString("subname");
            String subject = rs.getString("faculty");
            String lecid = rs.getString("lectureid");
            
            subCodeTF.setText(subcode);
       subnameTF.setText(name);
            lecIDTF.setText(lecid);
            
            }
          
        } catch (Exception e) {
        }
       

        subTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    public void subload(){
        
        int r = subTable.getSelectedRow();
        
        String subCode = subTable.getValueAt(r, 0).toString();
         String subName = subTable.getValueAt(r, 1).toString();
          String faculty = subTable.getValueAt(r, 2).toString();
           String lecID = subTable.getValueAt(r, 3).toString();
           
           subCodeTF.setText(subCode);
           subnameTF.setText(subName);
           lecIDTF.setText(lecID);
           
           subCmb.removeAllItems();
           subCmb.addItem(faculty);
           subCmb.setSelectedItem(faculty);
           
           
           
        
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        
        String subcode = subCodeTF.getText();
        String name = subnameTF.getText();
        String subject = subCmb.getSelectedItem().toString();
        String lecid = lecIDTF.getText();
        System.out.println(subcode + name + subject + lecid);
        insertController.Sub(subcode, name, subject, lecid);
        
        subTable();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lecIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecIDTFActionPerformed
        // TODO add your handling code here:
        
        subTable();
    }//GEN-LAST:event_lecIDTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        String subcode = subCodeTF.getText();
        
        System.out.println(subcode);
        
        
        if(subcode != null){
            
            DeleteController.deleteIndex(subcode);
        }

subTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    private void updateCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCourseBtnActionPerformed


        String subcode = subCodeTF.getText();
        String name = subnameTF.getText();
        String subject = subCmb.getSelectedItem().toString();
        String lecid = lecIDTF.getText();
             
             
               UpdateController.UpdateForm(subcode, name, subject, lecid);
 
    
        subTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_updateCourseBtnActionPerformed

    private void subIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subIDActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        
         Subject.getFrames() [0].dispose();
        
        new Home().setVisible(true);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void subCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subCmbActionPerformed

    private void subTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subTableKeyReleased

subload();
        // TODO add your handling code here:
    }//GEN-LAST:event_subTableKeyReleased

    private void subTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subTableKeyPressed

subload();

        // TODO add your handling code here:
    }//GEN-LAST:event_subTableKeyPressed

    private void subTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subTableMouseClicked

subload();
        // TODO add your handling code here:
    }//GEN-LAST:event_subTableMouseClicked

    public void subTable(){
        
        ResultSet rs =new DBSearch().searchAllSub();
        
        try {
            
            DefaultTableModel tbModel = (DefaultTableModel)subTable.getModel();
            tbModel.setRowCount(0);
            
            while(rs.next()){
            
            String subID = rs.getString("subid");
            String subName = rs.getString("subname");
            String faculty = rs.getString("faculty");
            String lecid= rs.getString("lectureid");
            
            String tbData[] = {subID,subName,faculty,lecid};
            
            tbModel.addRow(tbData);
            
            }
            
            
        } catch (Exception e) {
        }
        
        
        
        
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
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lecIDTF;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> subCmb;
    private javax.swing.JTextField subCodeTF;
    private javax.swing.JTextField subID;
    private javax.swing.JTable subTable;
    private javax.swing.JTextField subnameTF;
    private javax.swing.JButton updateCourseBtn;
    // End of variables declaration//GEN-END:variables
}
