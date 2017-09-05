
package pats.pkg21.pkg3.esmayor;

import javax.swing.JOptionPane;


public class PATS213EsMayor {

    
    public static void main(String[] args) {
       
        char letra;
        //chartAt(0) te captura el primer caracter de un string
        letra = JOptionPane.showInputDialog("Ingresa una letra").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Es mayúscula" );
        }else{
            JOptionPane.showMessageDialog(null, "es minuscula");
        }
        
    }
    
}
