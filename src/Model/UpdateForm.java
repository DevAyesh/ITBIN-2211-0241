/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
 

/**
 *
 * @author madur
 */
public class UpdateForm {
    
    Statement stmt;
    
    public void updateForm(String inumber,String iname,String fac,String lecid){
        try {
            
            String number= inumber;
            String name = iname;
            String facs = fac;
            String lec = lecid;
            
            stmt=DBConnection.getStatementConnection();
            
           stmt.executeUpdate("UPDATE subject SET subid ='"+number+"',subname = '"+name+"',faculty ='"+facs+"',lectureid='"+lec+"'" );
           
            
        } catch (Exception e) {
        }
    }
    
}
