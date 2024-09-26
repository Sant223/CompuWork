package clases;
import java.util.ArrayList;

//Clase ReporteDeDesempeno() 
public class ReporteDeDesempeno {
    //atributos
    private int id;
    private String desempeno;

    //constructor
    public ReporteDeDesempeno(){
        id = (int)(Math.random()*1000);
        desempeno = null;
    }

    //metodo que mostrara el desempeño del empleado
    public void generarReporteEmpleado(ArrayList<Empleado>listaEmpleados, Empleado empleado){
        String nombre = "", apellido = "";
        int id = 0;
        for(Empleado i: listaEmpleados){
            if(i.getId() == empleado.getId()){
                this.desempeno = i.getDesempeno(); 
                nombre = i.getNombre();
                apellido = i.getApellido();
                id = i.getId();
            }

            System.out.println("Id: "+ this.id
            +" \nEl empleado con nombre "+nombre+" "+apellido
            +" con numero de documendo "+ id+" tiene un desempeño: "+this.desempeno );
        }
    }

    //metodo que mostrara el desempeño del departamento
    public void generarReporteDepartamento(ArrayList<Departamento> listaDeparmentos, Departamento departamento){
        String nombre = "";
        int id = 0;
        for(Departamento i: listaDeparmentos){
            if(i.getIdDepartamento() == departamento.getIdDepartamento()){
                this.desempeno = i.getDesempenoDepartamento(); 
                nombre = i.getNombreDepartamento();
                id = i.getIdDepartamento();
            }

            System.out.println("Id: "+ this.id
            +" \nEl Departamento con nombre "+nombre+" "
            +" con numero de identificacion "+ id+" tiene un desempeño: "+this.desempeno );
        }
    }
}

