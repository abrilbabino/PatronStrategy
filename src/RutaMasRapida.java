public class RutaMasRapida implements Ruta{
    private double velocidadPromedio;

    public RutaMasRapida(double velocidadPromedio){
        this.velocidadPromedio= velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    private double calcularTiempoEstimado(double distancia){
        return distancia/velocidadPromedio;
    }

    @Override
    public void calcularRuta(String origen, String destino) {
        double distancia = 500; // Simulación
        double tiempo = calcularTiempoEstimado(distancia);
        System.out.println("Ruta más rápida de " + origen + " a " + destino);
        System.out.println("Distancia: " + distancia + " km, tiempo estimado: " + tiempo + " h");
    }
}
