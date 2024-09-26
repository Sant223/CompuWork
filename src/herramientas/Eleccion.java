package herramientas;
import javax.swing.JOptionPane;

//Clase Eleccion()
public class Eleccion {

    //Metodo constructor vacio
    public Eleccion(){
    }

    //Funcion eleccion() que recibira la eleccion del usuario y retornara el numero de su eleccion
    public static byte eleccion(){
        byte eleccion = 0;
        try {
            eleccion = Byte.parseByte(JOptionPane.showInputDialog(null, " - Digita tu eleccion deacuerdo a el numero:\n"
            + "1. Crear Empleado\n"
            + "2. Crear Departamento\n"
            + "3. Añadir empleado a departamento\n"
            + "4. Eliminar empleado de departamento\n"
            + "5. Eliminar departamento\n"
            + "6. Generar reporte de empleado\n"
            + "7. Generar reporte de departamento\n"
            + "8. Salir", "Eleccion", JOptionPane.INFORMATION_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SOLO SON PERMITIDOS NUMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return eleccion;
    }

}
