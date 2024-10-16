package Main;
import herramientas.*;
import javax.swing.JOptionPane;
import clases.ListaDepartamentos;
import herramientas.Eleccion;
import clases.ListaEmpleados;


//clase Main
public class Main {
    //metodo main
    public static void main(String [] args){
        
        ListaDepartamentos listaDepartamento = new ListaDepartamentos();
        ListaEmpleados listaEmpleados = new ListaEmpleados();
        byte eleccion = Eleccion.eleccion();

        try {
            while(eleccion != 8 ){
                switch (eleccion) {
                    case 1:
                        listaEmpleados.anadirEmpleado(Opcion1.crearEmpleado());
                        break;
                    case 2:
                        listaDepartamento.anadirDepartamento(Opcion2.crearDepartamento());
                        break;
                    case 3:
                        Opcion3.anadirEmpleado(listaEmpleados,listaDepartamento);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "SOLO SON PERMITIDOS NUMEROS ENTRE EL 1 Y EL 8", "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                }
                eleccion = Eleccion.eleccion();
            }
        } catch ( NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "SOLO SON PERMITDOS NUMEROS ENTRE EL 1 Y EL 8", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
            
    }
}
    
    
    

    

