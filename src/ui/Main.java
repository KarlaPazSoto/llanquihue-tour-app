package ui;

import data.GestorServicios;

public class Main {
    public static void main(String[] args) {
        try {
            GestorServicios gestor = new GestorServicios();
            
            gestor.mostrarTodosLosServicios();
            
            System.out.println("\n=== RESUMEN POR CATEGORÍA ===");
            System.out.println("Excursiones Culturales: " + gestor.obtenerExcursionesculturales().size());
            System.out.println("Paseos Lacustres: " + gestor.obtenerPaseosLacustres().size());
            System.out.println("Rutas Gastronómicas: " + gestor.obtenerRutasGastronomicas().size());
            
        } catch (Exception e) {
            System.err.println("Error al cargar los servicios turísticos: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
