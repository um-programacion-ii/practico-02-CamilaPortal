package entity;

import interfaces.Despensable;
import java.util.HashMap;
import java.util.Map;

public class Despensa {
    private Map<String, Ingrediente> ingredientes;

    public Despensa(){
        this.ingredientes = new HashMap<>();
    }

    public void addIngrediente(Ingrediente newIngrediente){
        ingredientes.put(newIngrediente.getNombre(), newIngrediente);
        System.out.println("Se agregó a la despensa: " + newIngrediente.getNombre());
    }

    public void getIngrediente(String nombre, int cantidad){
        Ingrediente ingrediente = ingredientes.get(nombre);
        if (ingrediente != null) {
            ingrediente.sacar(cantidad);
        } else {
            System.out.println("No tenés " + nombre + " en la despensa");
        }
    }

    public Map<String, Ingrediente> getIngredientes() {
        return ingredientes;
    }
}
