package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmpleadoPermanente extends Empleado {

    private LocalDate fechaIngreso;
    public EmpleadoPermanente(String nombre, String apellido, int id, int salario, Departamento departamento, String fechaIngreso, int desempeno) {
        super(nombre, apellido, id, salario, departamento, desempeno);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaIngreso = LocalDate.parse(fechaIngreso,formatter);    
    }
    
    public LocalDate getFechaIngreso(){
        return fechaIngreso;
    }
}
