package ui;

import data.GestorServicios;
import model.ServicioTuristico;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();
        List<ServicioTuristico> servicios = gestor.crearServicios();
        
        System.out.println("=== Servicios Turísticos Disponibles ===\n");
        
        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio);
        }
    }
}
