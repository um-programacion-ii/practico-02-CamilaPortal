package service;
import entity.Chef;
import entity.Ingrediente;
import entity.Receta;

import java.util.List;

public class CocinaService {
    public static void prepararReceta(Receta receta, Chef chef, List<Ingrediente> despensa) {
        System.out.println("\nChef " + chef.getNombre() + " preparando la siguiente receta:");
        System.out.println(receta);

        boolean ingredientesSuficientes = true;
        for (Ingrediente ingredienteReceta : receta.getIngredientes()) {
            boolean encontrado = false;
            for (Ingrediente ingredienteDespensa : despensa) {
                if (ingredienteReceta.getNombre().equalsIgnoreCase(ingredienteDespensa.getNombre()) &&
                        ingredienteDespensa.getCantidad() >= ingredienteReceta.getCantidad()) {
                    encontrado = true;
                    ingredienteDespensa.sacar(ingredienteReceta.getCantidad());
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("No hay suficiente " + ingredienteReceta.getNombre() +
                        " en la despensa. Faltan " + (ingredienteReceta.getCantidad()) + " unidades.");
                ingredientesSuficientes = false;
                break;
            }
        }

        if (ingredientesSuficientes) {
            System.out.println("La receta ha sido preparada con éxito.");
            System.out.println("Ingredientes restantes en la despensa:");
            for (Ingrediente ingrediente : despensa) {
                System.out.println("- " + ingrediente);
            }
        } else {
            System.out.println("No se pudo preparar la receta debido a ingredientes insuficientes.");
        }
    }
}
