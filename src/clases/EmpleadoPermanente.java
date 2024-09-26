package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//clase EmpleadoPermanente() que hereda las caracteristicas y metodos de Emppleado()
public class EmpleadoPermanente extends Empleado {

    //atributo
    private LocalDate fechaIngreso;

    //constructor
    public EmpleadoPermanente(String nombre, String apellido, int id, int salario, Departamento departamento, String fechaIngreso, int desempeno) {
        super(nombre, apellido, id, salario, departamento, desempeno);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaIngreso = LocalDate.parse(fechaIngreso,formatter);    
    }
    
    //getter
    public LocalDate getFechaIngreso(){
        return fechaIngreso;
    }
}
