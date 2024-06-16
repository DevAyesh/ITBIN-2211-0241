/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlle;

import Model.UpdateForm;
import javax.swing.JOptionPane;

/**
 *
 * @author madur
 */
public class UpdateController {
    
    
    
  
    public static void UpdateForm(String inumber,String iname,String fac,String lecid){
        
        new UpdateForm().updateForm(inumber, iname, fac, lecid);
        
        
        if(inumber.equals("")){
       
       
        }
        else{
              JOptionPane.showMessageDialog(null, "Record has Updated successfully", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
       
        
    
}
}