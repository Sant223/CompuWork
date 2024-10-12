package Test.Packages;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import clases.Departamento;
import herramientas.Opcion2;

public class Opcion2Test {

    // Prueba cuando los datos de entrada son correctos
    @Test
    public void testCrearDepartamentoDatosCorrectos() {
        // Datos de prueba válidos
        Departamento departamento = Opcion2.crearDepartamento("Finanzas", "123", "0");

        // Verificar que el objeto departamento se creó correctamente
        assertNotNull(departamento);
        assertEquals("Finanzas", departamento.getNombreDepartamento());
        assertEquals(123, departamento.getIdDepartamento());
        assertEquals("Bueno", departamento.getDesempenoDepartamento());
    }

    // Prueba cuando el ID del departamento es inválido (no numérico)
    @Test
    public void testCrearDepartamentoIdInvalido() {
        // ID no numérico
        Departamento departamento = Opcion2.crearDepartamento("Finanzas", "abc", "0");

        // Verificar que retorna null cuando hay un error
        assertNull(departamento);
    }

    // Prueba cuando el indicador es inválido (fuera del rango esperado)
    @Test
    public void testCrearDepartamentoIndicadorInvalido() {
        // Indicador fuera del rango (ni 0 ni 1)
        Departamento departamento = Opcion2.crearDepartamento("Finanzas", "123", "5");

        // Verificar que retorna null cuando el indicador es inválido
        assertNull(departamento);
    }

    // Prueba cuando se proporciona un valor inválido para el indicador (no numérico)
    @Test
    public void testCrearDepartamentoIndicadorNoNumerico() {
        // Indicador no numérico
        Departamento departamento = Opcion2.crearDepartamento("Finanzas", "123", "abc");

        // Verificar que retorna null en caso de excepción
        assertNull(departamento);
    }

    // Prueba cuando los tres valores son inválidos
    @Test
    public void testCrearDepartamentoTodosValoresInvalidos() {
        // Todos los valores son inválidos
        Departamento departamento = Opcion2.crearDepartamento("123", "xyz", "123");

        // Verificar que retorna null cuando todos los valores son inválidos
        assertNull(departamento);
    }
}

