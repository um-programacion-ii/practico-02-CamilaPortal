import entity.*;
import service.CocinaService;

public class Main {
    public static void main(String[] args) {
        Ingrediente ingrediente1 = new Ingrediente("Agua", 500);
        Ingrediente ingrediente2 = new Ingrediente("Huevos", 6);
        Ingrediente ingrediente3 = new Ingrediente("Lechuga", 6);
        Ingrediente ingrediente4 = new Ingrediente("Tomate", 6);
        Ingrediente ingrediente5 = new Ingrediente("Aceite de oliva", 500);

        Utensilio utensilio1 = new Utensilio("Cuchillo", 10);
        Utensilio utensilio2 = new Utensilio("Olla", 10);
        Utensilio utensilio3 = new Utensilio("Bol", 10);

        Despensa despensa = new Despensa();

        despensa.addIngrediente(ingrediente1);
        despensa.addIngrediente(ingrediente2);
        despensa.addIngrediente(ingrediente3);
        despensa.addIngrediente(ingrediente4);
        despensa.addIngrediente(ingrediente5);

        despensa.addUtensilio(utensilio1);
        despensa.addUtensilio(utensilio2);
        despensa.addUtensilio(utensilio3);

        despensa.getUtensilio("Cuchillo", 2);

        despensa.getIngrediente("Agua", 400);
        despensa.getIngrediente("Arroz", 1);

        HuevoDuro huevoDuro = new HuevoDuro();
        Ensalada ensalada = new Ensalada();
        EnsaladaDeFrutas ensaladaDeFrutas = new EnsaladaDeFrutas();

        // Mostrar los detalles de cada receta
        System.out.println("\nReceta de Huevo Duro:");
        System.out.println(huevoDuro);

        System.out.println("\nReceta de Ensalada:");
        System.out.println(ensalada);

        System.out.println("\nReceta de Ensalada de Frutas:");
        System.out.println(ensaladaDeFrutas);

        Chef chef1 = new Chef("Juan", 1);
        CocinaService.prepararReceta(ensalada, chef1, despensa.getIngredientes(), despensa.getUtensilios());

        Chef chef2 = new Chef("Pepe", 2);
        CocinaService.prepararReceta(ensaladaDeFrutas, chef2, despensa.getIngredientes(), despensa.getUtensilios());
    }

}

