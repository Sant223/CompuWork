package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//clase EmpleadoTemporal() que hereda las caracteriscas y metodos de Empleado()
public class EmpleadoTemporal extends Empleado {

    //atributos
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;

    //constructor
    public EmpleadoTemporal(String nombre, String apellido, int id, int salario, Departamento departamento, String fechaIngreso, String fechaSalida, int desempeno) {
        super(nombre, apellido, id, salario, departamento,desempeno);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaIngreso = LocalDate.parse(fechaIngreso,formatter);
        this.fechaSalida = LocalDate.parse(fechaSalida, formatter);        
    }

    //getters
    public LocalDate getFechaIngreso(){
        return fechaIngreso;
    }

    public LocalDate getFechaSalida(){
        return fechaSalida;
    }
}
