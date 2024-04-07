package entity;

public class EnsaladaDeFrutas extends Receta{
    public EnsaladaDeFrutas() {
        super(new Ingrediente[]{new Ingrediente("Manzana", 2), new Ingrediente("Banana", 2), new Ingrediente("Naranja", 2), new Ingrediente("Frutilla", 10)}, 10, "Pelar y cortar las frutas. Mezclar todas las frutas en un bol y servir.");
    }
}
