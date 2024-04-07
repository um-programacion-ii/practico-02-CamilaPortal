package entity;

import interfaces.Despensable;

public class Utensilio implements Despensable {
    private String nombre;

    public Utensilio(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
