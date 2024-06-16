/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlle;

import Model.AddRecord;
import javax.swing.JOptionPane;

/**
 *
 * @author madur
 */
public class StudentController {

public static void Form(String indexTF, String nameTF, String emailTF, String pWTF,String date,String geder,String degreeCmb) {
 
   if(indexTF != null){
        
            new AddRecord().insertForm(indexTF, nameTF, emailTF, pWTF, date, geder, degreeCmb);

        JOptionPane.showMessageDialog(null, "Record has added successfully", "Successfull",JOptionPane.INFORMATION_MESSAGE); 
    
    
    
    
}

}
}