package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Datos {

    public ArrayList<Tour> cargarTours() {

        ArrayList<Tour> listaTours = new ArrayList<>();

        String rutaArchivo = "resources/tours.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String [] datos = linea.split(";");

                if(datos.length == 3) {

                    String nombre = datos[0];
                    String lugar = datos[1];
                    int precio = Integer.parseInt(datos[2]);

                    Tour tour = new Tour(nombre, lugar, precio);

                    listaTours.add(tour);
                } else {
                    System.out.println("Línea no válida" + linea);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir precio");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        return listaTours;
    }
}
