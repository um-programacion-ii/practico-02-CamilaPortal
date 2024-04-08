package service;
import entity.Chef;
import entity.Ingrediente;
import entity.Receta;
import entity.Utensilio;

import java.util.Map;

public class CocinaService {
    public static void prepararReceta(Receta receta, Chef chef, Map<String, Ingrediente> despensaIngredientes, Map<String, Utensilio> despensaUtensilios) {
        System.out.println("\nChef " + chef.getNombre() + " preparando la siguiente receta:");
        System.out.println(receta);

        boolean ingredientesSuficientes = true;
        boolean utensiliosSuficientes = true;

        for (Ingrediente ingredienteReceta : receta.getIngredientes()) {
            Ingrediente ingredienteDespensa = despensaIngredientes.get(ingredienteReceta.getNombre());
            if (ingredienteDespensa != null && ingredienteDespensa.getCantidad() >= ingredienteReceta.getCantidad()) {
                ingredienteDespensa.sacar(ingredienteReceta.getCantidad());
            } else {
                System.out.println("No hay suficiente " + ingredienteReceta.getNombre() +
                        " en la despensa. Faltan " + (ingredienteReceta.getCantidad()) + " unidades.");
                ingredientesSuficientes = false;
                break;
            }
        }

        if (ingredientesSuficientes) {
            for (Utensilio utensilioReceta : receta.getUtensilios()) {
                Utensilio utensilioDespensa = despensaUtensilios.get(utensilioReceta.getNombre());
                if (utensilioDespensa != null && utensilioDespensa.getVidaUtil() >= utensilioReceta.getVidaUtil()) {
                    utensilioDespensa.usar(utensilioReceta.getVidaUtil()); // Descontar vida útil del utensilio utilizado
                } else {
                    System.out.println("No hay suficiente o ningún " + utensilioReceta +
                            " en la despensa.");
                    utensiliosSuficientes = false;
                    break;
                }
            }
        }

        if (ingredientesSuficientes && utensiliosSuficientes) {
            System.out.println("La receta ha sido preparada con éxito.");
            System.out.println("\nIngredientes restantes en la despensa:");
            for (Ingrediente ingrediente : despensaIngredientes.values()) {
                System.out.println("- " + ingrediente);
            }
            System.out.println("\nUtensilios restantes en la despensa:");
            for (Utensilio utensilio : despensaUtensilios.values()) {
                System.out.println("- " + utensilio);
            }
        } else {
            System.out.println("No se pudo preparar la receta debido a ingredientes o utensilios insuficientes.");
        }
    }
}
