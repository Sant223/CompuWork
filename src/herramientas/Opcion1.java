package herramientas;
import javax.swing.JOptionPane;
import clases.Empleado;
import clases.EmpleadoPermanente;
import clases.EmpleadoTemporal;

//Clase Opcion1
public class Opcion1 {
    //Constantes para bueno y malo, y para empleado temporal y permanente
    private static final byte BUENO = 0;
    private static final byte MALO = 1;
    private static final byte PERMANENTE = 0;
    private static final byte TEMPORAL = 1;

    /*funcion crearEmpleado() que pedira al usuario el nombre, el id, 
    etc para seguidamente crear una instancia de Empleado() y retornarla*/
    public static Empleado crearEmpleado(){
        String nombre, apellido, fechaIngreso, fechaSalida;
        int id, salario;
        byte indicador, eleccion;

        try {
            nombre = JOptionPane.showInputDialog("Ingreses el nombre del empleado: ");
            apellido =JOptionPane.showInputDialog("Ingreses el apellido del empleado: ");
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingreses el ID del empleado: "));
            salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado: "));
            indicador = Byte.parseByte(JOptionPane.showInputDialog("Digite el indicador:\n"
            + BUENO+" .Para bueno\n"
            + MALO +" .Para malo\n"));
            
            eleccion = Byte.parseByte(JOptionPane.showInputDialog("¿El empleado es temporal o permanente?\n"
            + PERMANENTE+". Para Empleado permamente\n"
            + TEMPORAL+". Para Empleado temporal\n"));
            if(eleccion == 0){
                fechaIngreso= JOptionPane.showInputDialog("Ingrese la fecha de ingreso: (Que cumpla con el formato yyyy/MM/dd )");
                Empleado empleado= new EmpleadoPermanente(nombre, apellido, id, salario, null, fechaIngreso, indicador);
                return empleado;
            }else if(eleccion == 1){
                fechaIngreso = JOptionPane.showInputDialog("Ingrese la fecha de ingreso: (Que cumpla con el formato yyyy-MM-dd )");
                fechaSalida = JOptionPane.showInputDialog("Ingrese la fecha de salida: (Que cumpla con el formato yyyy-MM-dd )");
                Empleado empleado = new EmpleadoTemporal(nombre, apellido, id, salario, null, fechaIngreso, fechaSalida, indicador);
                return empleado;
            }else{
                JOptionPane.showMessageDialog(null,"SOLO SON PERMITIDOS 0 Y EL 1", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
