package model;

public class RutaGastronomica extends ServicioTuristico {
    private int numeroParadas;

    public RutaGastronomica() {
        super();
    }

    public RutaGastronomica(String nombre, int duracionHoras, int numeroParadas) {
        super(nombre, duracionHoras);
        this.numeroParadas = numeroParadas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    @Override
    public String toString() {
        return "Ruta Gastronomica{" +
                super.toString() +
                "Número de Paradas=" + numeroParadas +
                '}';
    }
}
