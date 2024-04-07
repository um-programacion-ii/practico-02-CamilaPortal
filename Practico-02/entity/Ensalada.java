package entity;

public class Ensalada extends Receta{
    public Ensalada(){
        super(new Ingrediente[]{new Ingrediente("Lechuga", 1), new Ingrediente("Tomate", 2), new Ingrediente("Aceite de oliva", 10)}, 10, "Lavar y cortar la lechuga y el tomate. Mezclar con aceite de oliva.");
    }
}
