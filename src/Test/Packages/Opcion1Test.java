package Test.Packages;
import clases.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Opcion1Test {

    @Test
    void testCrearEmpleadoPermanente() {
        // Simular la creación de un empleado permanente
        Empleado empleado = new EmpleadoPermanente("Juan", "Perez", 123, 2000, null, "2023-10-10", 0);
        
        // Verificar que el empleado sea de tipo EmpleadoPermanente
        assertTrue(empleado instanceof EmpleadoPermanente);
        // Verificar que los atributos se asignen correctamente
        assertEquals("Juan", empleado.getNombre());
        assertEquals("Perez", empleado.getApellido());
        assertEquals(123, empleado.getId());
        assertEquals(2000, empleado.getSalario());
    }

    @Test
    void testCrearEmpleadoTemporal() {
        // Simular la creación de un empleado temporal
        Empleado empleado = new EmpleadoTemporal("Ana", "Lopez", 456, 1500, null, "2023-02-31", "2023-12-31", 1);

        // Verificar que el empleado sea de tipo EmpleadoTemporal
        assertTrue(empleado instanceof EmpleadoTemporal);
        // Verificar que los atributos se asignen correctamente
        assertEquals("Ana", empleado.getNombre());
        assertEquals("Lopez", empleado.getApellido());
        assertEquals(456, empleado.getId());
        assertEquals(1500, empleado.getSalario());
    }

}
