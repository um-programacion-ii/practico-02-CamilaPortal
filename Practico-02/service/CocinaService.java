package service;
import Excepciones.StockInsuficiente;
import Excepciones.VidaUtilInsuficiente;
import entity.Chef;
import entity.Ingrediente;
import entity.Receta;
import entity.Utensilio;

import java.util.Map;

public class CocinaService {
    public static void prepararReceta(Receta receta, Chef chef, Map<String, Ingrediente> despensaIngredientes, Map<String, Utensilio> despensaUtensilios) throws VidaUtilInsuficiente, StockInsuficiente {
        System.out.println("\nChef " + chef.getNombre() + " preparando la siguiente receta:");
        System.out.println(receta);

        for (Ingrediente ingredienteReceta : receta.getIngredientes()) {
            Ingrediente ingredienteDespensa = despensaIngredientes.get(ingredienteReceta.getNombre());
            if (ingredienteDespensa == null || ingredienteDespensa.getCantidad() < ingredienteReceta.getCantidad()) {
                throw new StockInsuficiente("No hay suficiente " + ingredienteReceta.getNombre() +
                        " en la despensa. Faltan " + (ingredienteReceta.getCantidad()) + " unidades.");
            }
            ingredienteDespensa.sacar(ingredienteReceta.getCantidad());
        }

        for (Utensilio utensilioReceta : receta.getUtensilios()) {
            Utensilio utensilioDespensa = despensaUtensilios.get(utensilioReceta.getNombre());
            if (utensilioDespensa == null || utensilioDespensa.getVidaUtil() < utensilioReceta.getVidaUtil()) {
                throw new VidaUtilInsuficiente("La vida útil del utensilio " + utensilioReceta.getNombre() +
                        " en la despensa no es suficiente para cocinar esta receta.");
            }
            utensilioDespensa.usar(utensilioReceta.getVidaUtil());
        }

        System.out.println("La receta ha sido preparada con éxito.");
        System.out.println("\nIngredientes restantes en la despensa:");
        for (Ingrediente ingrediente : despensaIngredientes.values()) {
            System.out.println("- " + ingrediente);
        }
        System.out.println("\nUtensilios restantes en la despensa:");
        for (Utensilio utensilio : despensaUtensilios.values()) {
            System.out.println("- " + utensilio);
        }
    }
}
