package clases;

public class Empleado {
    private String nombre;
    private String apellido;
    private int id;
    private int salario;
    private Departamento departamento;
    private String desempeno;

    public Empleado(String nombre, String apellido, int id, int salario, int indicador){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.salario = salario;
        if(indicador == 0){
            this.desempeno = "Bueno";
        }else{
            this.desempeno = "Malo";
        }
    }
    public Empleado(String nombre, String apellido, int id, int salario, Departamento departamento,int indicador){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
        if(indicador == 0){
            this.desempeno = "Bueno";
        }else{
            this.desempeno = "Malo";
        }
    }
    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getSalario(){
        return salario;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public String getDesempeno(){
        return desempeno;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSalario (int salario){
        this.salario = salario;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
}
