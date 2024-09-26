package clases;

import java.util.ArrayList;

//Clase Departamento()
public class Departamento {
    //Atributos privados
    private String nombreDepartamento;
    private int idDepartamento;
    private ArrayList <Empleado> listaEmpleados;
    private String desempeno;

    //Constructor vacio
    public Departamento(){
    }

    //Constructor
    public Departamento(String nombreDepartamento, int idDepartamento, int indicador){
        this.nombreDepartamento = nombreDepartamento;
        this.idDepartamento = idDepartamento;
        this.listaEmpleados = new ArrayList<Empleado>();
        if(indicador == 0){
            this.desempeno = "Bueno";
        }else{
            this.desempeno = "Malo";
        }
    }

    //getters and setters
    public void setNombreDepartamento(String nombreDepartamento){
        this.nombreDepartamento = nombreDepartamento;
    }

    public void setIdDepartamento(int idDepartamento){
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento(){
        return nombreDepartamento;
    }

    public int getIdDepartamento(){
        return idDepartamento;
    }

    public String getDesempenoDepartamento(){
        return desempeno;
    }

    //metodo para agregar una instancia de Empleado() a la lista de empleados del departamento
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    //metodo para eliminar un empleado de la lista
    public void eliminarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }

    //metodo que mostrara los empleados en la lista
    public void mostrarEmpleados(){
        int contador= 1;
        
        for(Empleado i: listaEmpleados){

            System.out.println("Empleado numero: "+ contador
            + " \n- Nombre completo: "+i.getNombre()+" "+ i.getApellido()
            + " \n- Id: "+ i.getId()
            + " \n- Salario: "+ i.getSalario()
            + " \n------------------------");

            contador ++;
        }
    }
}
