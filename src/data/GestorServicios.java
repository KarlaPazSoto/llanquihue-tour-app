package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
    
    public List<ServicioTuristico> crearServicios() {
        List<ServicioTuristico> servicios = new ArrayList<>();
        
        // Crear dos ExcursioneseCulturales
        servicios.add(new ExcursionCultural("Excursión a Fuerte Aconcagua", 3, "Fuerte Aconcagua"));
        servicios.add(new ExcursionCultural("Recorrido histórico por Llanguihue", 4, "Patrimonio Cultural Local"));
        
        // Crear dos Paseos Lacustres
        servicios.add(new PaseoLacustre("Paseo en catamarán por Lago Llanguihue", 2, "Catamarán"));
        servicios.add(new PaseoLacustre("Navegación en bote turístico", 3, "Bote Turístico"));
        
        // Crear dos Rutas Gastronómicas
        servicios.add(new RutaGastronomica("Ruta de los sabores locales", 5, 4));
        servicios.add(new RutaGastronomica("Tour gastronómico por restaurantes tradicionales", 6, 5));
        
        return servicios;
    }
}
