package entity;

import java.util.ArrayList;
import java.util.List;

public class Despensa {
    private List<Ingrediente> ingredientes;

    public Despensa(){
        this.ingredientes = new ArrayList<>();
    }

    public void addIngrediente(Ingrediente newIngrediente){
        ingredientes.add(newIngrediente);
        System.out.println("Se agregó a la despensa: " + newIngrediente.getNombre());
    }

    public void getIngrediente(String nombre, int cantidad){
        for (Ingrediente i : ingredientes){
            if (i.getNombre().equalsIgnoreCase(nombre)){
                i.sacar(cantidad);
                return;
            }
        }
        System.out.println("No tenés " + nombre + " en la despensa");
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
}
