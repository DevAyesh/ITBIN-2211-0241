/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlle;

import Model.DBConnection;
import Model.DBDelete;
import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author madur
 */
public class DeleteController {
    
    
     public static void deleteIndex(String sub){
     
      try {
          
    String subid = null;
 
              ResultSet rs = new DBSearch().searchSub(sub);
              
           while(rs.next()){
           subid = rs.getString("subid");
           
           if(subid != null){
           
                new DBDelete().deleteIndex(sub);
           JOptionPane.showMessageDialog(null, "Record Deleted","Successfull",JOptionPane.INFORMATION_MESSAGE);
           }
           else{
           
            JOptionPane.showMessageDialog(null, "Invalid Index Number ", "Error", JOptionPane.ERROR_MESSAGE);
           }

          }
        
            DBConnection.closeCon();
          
      } catch (SQLException ex) {
          Logger.getLogger(DeleteController.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      
   
    
  }  
  
}
