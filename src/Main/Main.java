package Main;

import javax.swing.JOptionPane;
import clases.ListaDepartamentos;
import herramientas.Eleccion;

public class Main {
    public static void main(String [] args){
        ListaDepartamentos listaDepartamento = new ListaDepartamentos();
        byte eleccion = Eleccion.eleccion();

        try {
            while(eleccion != 8 ){
                switch (eleccion) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }
            }
        } catch ( NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "SOLO SON PERMITDOS NUMEROS ENTRE EL 1 Y EL 8", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
            
    }
}
    
    
    

    

