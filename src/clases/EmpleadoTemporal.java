package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class EmpleadoTemporal extends Empleado {

    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;


    public EmpleadoTemporal(String nombre, String apellido, int id, int salario, Departamento departamento, String fechaIngreso, String fechaSalida, int desempeno) {
        super(nombre, apellido, id, salario, departamento,desempeno);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaIngreso = LocalDate.parse(fechaIngreso,formatter);
        this.fechaSalida = LocalDate.parse(fechaSalida, formatter);        
    }

    public LocalDate getFechaIngreso(){
        return fechaIngreso;
    }

    public LocalDate getFechaSalida(){
        return fechaSalida;
    }
}
