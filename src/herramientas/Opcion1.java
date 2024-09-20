package herramientas;
import javax.swing.JOptionPane;

import clases.EmpleadoPermanente;

public class Opcion1 {
    public static void crearEmpleado(){
        String nombre, apellido;
        int id, salario;
        byte indicador, eleccion;

        nombre = JOptionPane.showInputDialog("Ingreses el nombre del empleado: ");
        apellido =JOptionPane.showInputDialog("Ingreses el apellido del empleado: ");
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingreses el ID del empleado: "));
        salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado: "));
        indicador = Byte.parseByte(JOptionPane.showInputDialog("Digite el indicador:\n"
        + "0. Para bueno\n"
        + "1. Para malo\n"));
        
        eleccion = Byte.parseByte(JOptionPane.showInputDialog("¿El empleado es temporal o permanente?\n"
        + "0. Para Empleado permamente\n"
        + "1. Para Empleado temporal\n"));

        if(eleccion == 0){
            EmpleadoPermanente empleado = new EmpleadoPermanente(nombre, apellido, id, salario, null, apellido, eleccion)
        }
    }
}
