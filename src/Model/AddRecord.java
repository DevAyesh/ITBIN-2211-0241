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
public class AddRecord {
 Statement stmt;

public void insertForm( String indexTF, String nameTF, String emailTF, String pWTF,String date,String geder,String degreeCmb) {
 try {
stmt = DBConnection.getStatementConnection();


stmt.executeUpdate("INSERT INTO student VALUES(' "+indexTF+"','"+nameTF+"', '"+emailTF+"','"+pWTF+"','"+date+"','"+geder+"','"+degreeCmb+"')");



 } catch (Exception e) {
 e.printStackTrace();
 }

}

public void insertSub(String subcode,String subname,String subcmb,String lecid) {
    
       try {
        
           stmt= DBConnection.getStatementConnection();
       
       stmt.executeUpdate("INSERT INTO subject(subid,subname,faculty,lectureid) VALUES('"+subcode+"','"+subname+"','"+subcmb+"','"+lecid+"')");
           
           
    } catch (Exception e) {
        
    }
   
}


}
