package herramientas;
import javax.swing.JOptionPane;

import clases.Empleado;
import clases.ListaEmpleados;
import clases.Departamento;
import clases.ListaDepartamentos;
public class Opcion3 {
    
    private static final byte SI = 0;
    private static final byte NO = 1;

    public static void anadirEmpleado(ListaEmpleados listaEmpl, ListaDepartamentos listaDep){
        for(Empleado e: listaEmpl.getLista()){
            byte eleccion, eleccion2;

            try {
                eleccion = Byte.parseByte(JOptionPane.showInputDialog("Desea añadir al Empleado con nombre "+ e.getNombre() 
                +"\ny con ID: " + e.getId()
                +"\n"+ SI+ ".para si"+  NO+".para no"));
            
                eleccion = Byte.parseByte(JOptionPane.showInputDialog("Desea añadir al Empleado con nombre "+ e.getNombre() 
                +"\ny con ID: " + e.getId()
                +"\n"+ SI+ ".para si"+  NO+".para no"));

                if(eleccion == SI){
                    for(Departamento d: listaDep.getLista()){

                        eleccion2 = Byte.parseByte(JOptionPane.showInputDialog("Desea añadirlo al Departamento: "
                        +d.getNombreDepartamento()+"\n"+ SI+ ".para si"+  NO+".para no"));
                        if(eleccion2== SI){
                            d.agregarEmpleado(e);
                        }
                    }
                }
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "SOLO SON PERMITDOS NUMEROS ENTRE EL 0 Y EL 1", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void anadirEmpleado(ListaEmpleados listaEmpl, ListaDepartamentos listaDep, byte[] decisionesEmpleados, byte[][] decisionesDepartamentos) {
        int i = 0;  // índice para decisiones de empleados
        for (Empleado e : listaEmpl.getLista()) {
            byte eleccion = decisionesEmpleados[i];  // Elección de si añadir empleado o no

            if (eleccion == SI) {
                int j = 0;  // índice para decisiones de departamentos por empleado
                for (Departamento d : listaDep.getLista()) {
                    byte eleccion2 = decisionesDepartamentos[i][j];  // Elección de si añadir al departamento o no
                    if (eleccion2 == SI) {
                        d.agregarEmpleado(e);
                    }
                    j++;
                }
            }
            i++;
        }
    }
}
