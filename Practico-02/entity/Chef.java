package entity;

public class Chef {
    private String nombre;
    private int estrellasMichelin;

    public Chef(String nombre, int estrellasMichelin){
        this.nombre = nombre;
        this.estrellasMichelin = estrellasMichelin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellasMichelin() {
        return estrellasMichelin;
    }

    public void setEstrellasMichelin(int estrellasMichelin) {
        this.estrellasMichelin = estrellasMichelin;
    }
}
