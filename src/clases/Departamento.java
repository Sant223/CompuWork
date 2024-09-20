package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Departamento {
    private String nombreDepartamento;
    private int idDepartamento;
    private ArrayList <Empleado> listaEmpleados;
    private String desempeno;

    public Departamento(){
    
    }

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

    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
        /*int idEmpleado = 0;
        try {
            idEmpleado = Integer.parseInt(JOptionPane.showInputDialog(" - Digita el documento del empleado que quieres eliminar."));
            
            
            for(Empleado i: listaEmpleados){
                if(i.getId() == idEmpleado){
                listaEmpleados.remove(i);
                }
            }    
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "SOLO SON PERMITDOS NUMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        */
    }

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
