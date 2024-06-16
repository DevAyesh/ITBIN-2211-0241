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
public class LectureRecord {
    Statement stmt;

public void insertForm( String leciD, String nameTF, String gender, String email) {
 try {
stmt = DBConnection.getStatementConnection();


stmt.executeUpdate("INSERT INTO lecture VALUES(' "+leciD+"','"+nameTF+"','"+gender+"','"+email+"')");



 } catch (Exception e) {
 e.printStackTrace();
 }

}


}
