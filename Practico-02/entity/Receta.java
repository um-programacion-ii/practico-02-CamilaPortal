package entity;

public class Receta {
    private Ingrediente[] ingredientes;
    private int tiempoCoccion;
    private String preparacion;

    public Receta(Ingrediente[] ingredientes, int tiempoCoccion, String preparacion){
        this.ingredientes = ingredientes;
        this.tiempoCoccion = tiempoCoccion;
        this.preparacion = preparacion;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String toString(){
        String resultado = "Ingredientes:\n";
        for (Ingrediente ingrediente : ingredientes) {
            resultado += "- " + ingrediente.getNombre() + ": " + ingrediente.getCantidad() + "\n";
        }
        resultado += "Tiempo de cocción: " + tiempoCoccion + " minutos\n";
        resultado += "Preparación: " + preparacion + "\n";
        return resultado;
    }
}
