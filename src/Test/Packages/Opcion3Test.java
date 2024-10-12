package Test.Packages;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import clases.Empleado;
import clases.Departamento;
import clases.ListaEmpleados;
import clases.ListaDepartamentos;
import herramientas.Opcion3;


public class Opcion3Test {

    // Prueba cuando los empleados son añadidos correctamente a los departamentos
    @Test
    public void testAnadirEmpleadoCorrectamente() {
        // Crear empleados y departamentos
        Empleado empleado1 = new Empleado("Juan", "Perez", 1, 124141, 1);
        Empleado empleado2 = new Empleado("Maria","Mayorca", 2, 1243221, 0);
        ListaEmpleados listaEmpl = new ListaEmpleados();
        listaEmpl.getLista().add(empleado1);
        listaEmpl.getLista().add(empleado2);

        Departamento dep1 = new Departamento("Finanzas", 101, (byte) 0);
        Departamento dep2 = new Departamento("Recursos Humanos", 102, (byte) 1);
        ListaDepartamentos listaDep = new ListaDepartamentos();
        listaDep.getLista().add(dep1);
        listaDep.getLista().add(dep2);

        // Decisiones para añadir empleados
        byte[] decisionesEmpleados = {0, 0};  // Añadir ambos empleados
        byte[][] decisionesDepartamentos = {
            {0, 1},  // Juan será añadido solo al departamento 1 (Finanzas)
            {1, 0}   // Maria será añadida solo al departamento 2 (Recursos Humanos)
        };

        // Llamar al método
        Opcion3.anadirEmpleado(listaEmpl, listaDep, decisionesEmpleados, decisionesDepartamentos);

        // Verificar que Juan fue añadido solo al departamento 1
        assertTrue(dep1.getLista().contains(empleado1));
        assertFalse(dep2.getLista().contains(empleado1));

        // Verificar que Maria fue añadida solo al departamento 2
        assertFalse(dep1.getLista().contains(empleado2));
        assertTrue(dep2.getLista().contains(empleado2));
    }

    // Prueba cuando no se añaden empleados (elección "NO" para todos)
    @Test
    public void testNoAnadirEmpleado() {
        // Crear empleados y departamentos
        Empleado empleado1 = new Empleado("Juan", "Perez", 1, 124141, 1);
        Empleado empleado2 = new Empleado("Maria","Mayorca", 2, 1243221, 0);
        ListaEmpleados listaEmpl = new ListaEmpleados();
        listaEmpl.getLista().add(empleado1);
        listaEmpl.getLista().add(empleado2);

        Departamento dep1 = new Departamento("Finanzas", 101, (byte) 0);
        Departamento dep2 = new Departamento("Recursos Humanos", 102, (byte) 1);
        ListaDepartamentos listaDep = new ListaDepartamentos();
        listaDep.getLista().add(dep1);
        listaDep.getLista().add(dep2);

        // Decisiones para no añadir empleados
        byte[] decisionesEmpleados = {1, 1};  // No añadir ningún empleado
        byte[][] decisionesDepartamentos = {
            {1, 1},  // No añadir al departamento 1 o 2
            {1, 1}   // No añadir al departamento 1 o 2
        };

        // Llamar al método
        Opcion3.anadirEmpleado(listaEmpl, listaDep, decisionesEmpleados, decisionesDepartamentos);

        // Verificar que ningún empleado fue añadido a ningún departamento
        assertFalse(dep1.getLista().contains(empleado1));
        assertFalse(dep1.getLista().contains(empleado2));
        assertFalse(dep2.getLista().contains(empleado1));
        assertFalse(dep2.getLista().contains(empleado2));
    }

    // Prueba cuando solo algunos empleados son añadidos a los departamentos
    @Test
    public void testAnadirAlgunosEmpleados() {
        // Crear empleados y departamentos
        Empleado empleado1 = new Empleado("Juan", "Perez", 1, 124141, 1);
        Empleado empleado2 = new Empleado("Maria","Mayorca", 2, 1243221, 0);
        ListaEmpleados listaEmpl = new ListaEmpleados();
        listaEmpl.getLista().add(empleado1);
        listaEmpl.getLista().add(empleado2);

        Departamento dep1 = new Departamento("Finanzas", 101, (byte) 0);
        Departamento dep2 = new Departamento("Recursos Humanos", 102, (byte) 1);
        ListaDepartamentos listaDep = new ListaDepartamentos();
        listaDep.getLista().add(dep1);
        listaDep.getLista().add(dep2);

        // Decisiones para añadir solo algunos empleados
        byte[] decisionesEmpleados = {0, 1};  // Añadir solo a Juan
        byte[][] decisionesDepartamentos = {
            {0, 0},  // Añadir Juan a ambos departamentos
            {1, 1}   // No añadir Maria a ningún departamento
        };

        // Llamar al método
        Opcion3.anadirEmpleado(listaEmpl, listaDep, decisionesEmpleados, decisionesDepartamentos);

        // Verificar que Juan fue añadido a ambos departamentos
        assertTrue(dep1.getLista().contains(empleado1));
        assertTrue(dep2.getLista().contains(empleado1));

        // Verificar que Maria no fue añadida a ningún departamento
        assertFalse(dep1.getLista().contains(empleado2));
        assertFalse(dep2.getLista().contains(empleado2));
    }
}