/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controlle.StudentController;
import Model.DBSearch;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author madur
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
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
        imgLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        maleRdo = new javax.swing.JRadioButton();
        famaleRdo = new javax.swing.JRadioButton();
        degreeCmb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        signInBtn = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        pWTF = new javax.swing.JPasswordField();
        date_chooser = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        indexTF = new javax.swing.JTextField();
        checkBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 203));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLbl.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        imgLbl.setForeground(new java.awt.Color(250, 160, 17));
        imgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imgLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 120, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Student ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("E-mail");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 49, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 68, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Date of Birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jButton2.setBackground(new java.awt.Color(245, 196, 63));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        jButton3.setBackground(new java.awt.Color(245, 196, 63));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Degree Programme");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        maleRdo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(maleRdo);
        maleRdo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        maleRdo.setText("Male");
        jPanel1.add(maleRdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        famaleRdo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(famaleRdo);
        famaleRdo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        famaleRdo.setText("Female");
        jPanel1.add(famaleRdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        degreeCmb.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        degreeCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc Hons in Information technology", "BSc in Business Management", "BSc (Hons) QS", "BSc (Hons) in Biotechnology", "Bachelor of Education (Hons)", "Bachelor Of Law (LLB)" }));
        degreeCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeCmbActionPerformed(evt);
            }
        });
        jPanel1.add(degreeCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/w.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 118, 107));

        signInBtn.setBackground(new java.awt.Color(245, 196, 63));
        signInBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        signInBtn.setText("Sign Up");
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });
        jPanel1.add(signInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, -1));

        nameTF.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel1.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 305, -1));

        emailTF.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel1.add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 305, -1));

        pWTF.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel1.add(pWTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 305, -1));

        date_chooser.setBackground(new java.awt.Color(255, 255, 255));
        date_chooser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        date_chooser.setDateFormatString("YYYY.MM.dd");
        jPanel1.add(date_chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 172, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText(" Name With Initials");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 126, -1));

        indexTF.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel1.add(indexTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 305, -1));

        checkBox.setText("show");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });
        jPanel1.add(checkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setText("Chose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 160, 17));
        jLabel9.setText("SIGN UP");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void degreeCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeCmbActionPerformed

    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
        // TODO add your handling code here:

        String index = indexTF.getText();
        String name = nameTF.getText();
        String email = emailTF.getText();
        String password = pWTF.getText();
       SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
       String date = sdf.format(date_chooser.getDate());
       String gender ;
       String degree = degreeCmb.getSelectedItem().toString();
       if(maleRdo.isSelected()){
           gender = "Male";
           
           StudentController.Form(index, name, email, password, date,gender,degree);
           
           
       }
        if(famaleRdo.isSelected()){
           gender = "Female";
           
           StudentController.Form(index, name, email, password, date,gender,degree);
           
           
       }
       
       
       
       
        System.out.println(date);
        
    }//GEN-LAST:event_signInBtnActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Signup.getFrames() [0].dispose();
        
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        indexTF.setText("");
        nameTF.setText("");
        emailTF.setText("");
        pWTF.setText("");
        
        
       
        maleRdo.setSelected(false);
        famaleRdo.setSelected(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed


  if(checkBox.isSelected()){
            pWTF.setEchoChar((char)0);
        }
        
        else{
            pWTF.setEchoChar('*');
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif"));
                int result = fileChooser.showOpenDialog(Signup.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
        ImageIcon originalIcon = new ImageIcon(selectedFile.getPath());     
                     Image originalImage = originalIcon.getImage();
                    int labelWidth = imgLbl.getWidth();
                    int labelHeight = imgLbl.getHeight();
                    Image scaledImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                    ImageIcon scaledIcon = new ImageIcon(scaledImage);
                    imgLbl.setIcon(scaledIcon);
                    
                     
                    byte[] imageData = getByteArrayFromImage(selectedFile);
                    
                          insertImageDataIntoDatabase(imageData,indexTF.getText());
                          
                        
                }





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
    
     private byte[] getByteArrayFromImage(File file) {
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", baos);
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
       private void insertImageDataIntoDatabase(byte[] imageData, String indexNum) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
         

           Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/stms","root","");
          
           
           
           if(indexNum !=null){
              
                String sql = "INSERT INTO image(stdid,img) VALUES('"+indexNum+"',?)";
             
                PreparedStatement statement = connection.prepareStatement(sql);
    
                  statement.setBytes(1, imageData);

               statement.executeUpdate();

      
            statement.close();
            connection.close();
            
              
                  
              JOptionPane.showMessageDialog(Signup.this, "Image updated successfully.");
         
                
          }
          
         
            
           
//PreparedStatement statement = connection.prepareStatement(sql);

            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(Signup.this, "Failed to update image.");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException ex) { java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBox;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JComboBox<String> degreeCmb;
    private javax.swing.JTextField emailTF;
    private javax.swing.JRadioButton famaleRdo;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JTextField indexTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton maleRdo;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPasswordField pWTF;
    private javax.swing.JButton signInBtn;
    // End of variables declaration//GEN-END:variables
}
