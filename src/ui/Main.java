package ui;

import data.Datos;
import model.Tour;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Datos datos = new Datos();

        ArrayList<Tour> tours = datos.cargarTours();

        int opcion;

        do{
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Ver todos los tours");
            System.out.println("2. Filtrar tours");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    mostrarTodos(tours);
                    break;

                case 2:
                    menuFiltros(tours, sc);
                    break;

                case 3:
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 3);

        sc.close();
    }

    public static void mostrarTodos(ArrayList<Tour> tours) {
        System.out.println("\n--- LISTA DE TOURS ---");
        for (Tour t : tours) {
            System.out.println(t);
        }
    }

    public static void menuFiltros(ArrayList<Tour> tours, Scanner sc) {

        int opcionFiltro;

        do {
            System.out.println("\n==== FILTRAR TOURS ====");
            System.out.println("1. Precio mayor a 20000");
            System.out.println("2. Precio menor a 20000");
            System.out.println("3. Filtrar por lugar");
            System.out.println("4. Volver");
            System.out.print("Seleccione ");
            opcionFiltro = sc.nextInt();

            switch (opcionFiltro) {

                case 1:
                    filtrarMayor(tours);
                    break;

                case 2:
                    filtrarMenor(tours);
                    break;

                case 3:
                    filtrarPorLugar(tours, sc);
                    break;

                case 4:
                    System.out.println("Volviendo al menu principal");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (opcionFiltro != 4);
    }

    public static void filtrarMayor(ArrayList<Tour> tours) {
        System.out.println("\n--- TOURS MAYORES A $20000 ---");
        for (Tour t : tours) {
            if (t.getPrecio() > 20000) {
               System.out.println(t);
            }
        }
    }

    public static void filtrarMenor(ArrayList<Tour> tours) {
        System.out.println("\n--- TOURS MENORES A $20000 ---");
        for (Tour t : tours) {
            if (t.getPrecio() < 20000) {
                System.out.println(t);
            }
        }
    }

    public static void filtrarPorLugar(ArrayList<Tour> tours, Scanner sc) {
        System.out.println("Ingresar lugar");
        sc.nextLine();
        String lugar = sc.nextLine();

        System.out.println("\n--- TOURS EN " + lugar + " ---");

        for (Tour t : tours) {
            if (t.getLugar().equalsIgnoreCase(lugar)) {
                System.out.println(t);
            }
        }
    }
}