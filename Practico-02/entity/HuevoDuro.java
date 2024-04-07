package entity;

public class HuevoDuro extends Receta{
    public HuevoDuro() {
        super(new Ingrediente[]{new Ingrediente("Huevo", 1), new Ingrediente("Agua", 200)}, 10, "Poner un huevo en agua hirviendo durante 10 minutos.");
    }
}
