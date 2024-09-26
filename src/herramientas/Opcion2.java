package herramientas;

import javax.swing.JOptionPane;
import clases.Departamento;

//clase Opcion2()
public class Opcion2 {

    //constantes para bueno y malo
    private static final byte BUENO = 0;
    private static final byte MALO = 1;

    /*funcion crearDepartamento() que pedira al usuario la informacion del departamento
     y luego creara una instancia de Departamento() y la retornara*/
    public static Departamento crearDepartamento(){
        String nombreDepartamento;
        int idDepartamento;
        byte indicador;

        try {
            nombreDepartamento = JOptionPane.showInputDialog("Ingreses el nombre del Departamento: ");
            idDepartamento = Integer.parseInt(JOptionPane.showInputDialog("Ingreses el ID del Departamento: "));
        
            indicador = Byte.parseByte(JOptionPane.showInputDialog("Digite el indicador:\n"
            + BUENO+" .Para bueno\n"
            + MALO +" .Para malo\n"));
            
            Departamento departamento = new Departamento(nombreDepartamento, idDepartamento, indicador);
            return departamento;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
