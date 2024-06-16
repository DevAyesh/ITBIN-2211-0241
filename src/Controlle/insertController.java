/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlle;

import Model.AddRecord;
import Model.LectureRecord;
import javax.swing.JOptionPane;

/**
 *
 * @author madur
 */
public class insertController {
    
    public static void Form( String leciD, String nameTF, String gender, String email) {
 
   if(leciD != null){
        
            new LectureRecord().insertForm(leciD, nameTF, gender, email);

        JOptionPane.showMessageDialog(null, "Record has added successfully", "Successfull",JOptionPane.INFORMATION_MESSAGE); 
    
    
    
    
}

}
    
    public static void Sub(String subcode, String name, String subject, String lecid){
        
        if(subcode != null){
            
            new AddRecord().insertSub(subcode, name, subject, lecid);
            
            JOptionPane.showMessageDialog(null, "Record has added successfully", "Successfull",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
}
    
    

