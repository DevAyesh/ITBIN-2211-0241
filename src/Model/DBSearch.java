/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author madur
 */
public class DBSearch {
  Statement stmt;
 ResultSet rs;
public ResultSet searchLogin(String usName) {
 try {
 stmt = DBConnection.getStatementConnection();
 String name = usName;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login where uname='"+ name +"'");
 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }


public ResultSet searchSub(String sub){

    try {
        stmt = DBConnection.getStatementConnection();
        String subID = sub;
        
        rs = stmt.executeQuery("SELECT * FROM subject where subid='"+subID+"' ");
        
        
    } catch (Exception e) {
    }

return rs;
}

public ResultSet searchAllSub(){

    try {
        stmt = DBConnection.getStatementConnection();
        
        
        rs = stmt.executeQuery("SELECT * FROM subject ");
        
        
    } catch (Exception e) {
    }

return rs;
}



}


