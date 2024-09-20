package clases;
import java.util.ArrayList;
public class ListaDepartamentos {

    private ArrayList <Departamento> listaDepartamentos;

    public ListaDepartamentos(){
        listaDepartamentos = new ArrayList<>();
    }

    public void anadirDepartamento(Departamento departamento){
        listaDepartamentos.add(departamento);
    }

    public void eliminarDepartamento(Departamento departamento){
        listaDepartamentos.remove(departamento);
    }

    public boolean estaVacia(ArrayList<Departamento> listaDepartamentos){
        if(listaDepartamentos.size()== 0){
            return true;
        }else{
            return false;
        }
    }
}
