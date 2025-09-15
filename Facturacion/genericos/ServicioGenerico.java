package genericos;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico<T extends identificable<ID>, ID> {
    private List<T> datos = new ArrayList<>();

    //public ServicioGenerico(List<T> datos) {
      //  this.datos = datos;
    //}
    //Buscar elemento por ID
    public T buscarPorID(ID id){
        for (T elemento : datos) {
            if (elemento.getID().equals(id)) {
                return elemento;
            }
        }
        return null;
    }

    //Guardar elemento sin duplicarse
    public void guardar(T elemento){
        if (buscarPorID(elemento.getID()) != null) {
            System.out.println("El elemento con ID " + elemento.getID() + " ya existe");
        }else{
            datos.add(elemento);
            System.out.println("Guardado: " + elemento);
        }
    }
    
    //Listar todos los elementos
    public List<T> listar(){
        return datos;
    }

    //Actualizar un elemento de datos de acuerdo al ID
    public boolean actualizar(ID id, T nuevoElemento){
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getID().equals(id)) { //get(id) obtiene el valor del elemento
                datos.set(i, nuevoElemento);
                System.out.println("ID actualizado: " + id + " con: " + nuevoElemento);
                return true;
            }
        }
        System.out.println("No se encontró el ID" + id + " para actualizar");
        return false;
    }

    //Eliminar un elemento con ID
    public boolean eliminar(ID id){
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getID().equals(id)) {
                datos.remove(i);
                System.out.println("ID eliminado: " + id);
                return true;
            }
        }
        System.out.println("No se encontró ID: " + id);
        return false;
    }
}
