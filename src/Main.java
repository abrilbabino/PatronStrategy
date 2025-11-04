public class Main {
    public static void main(String[] args) {
        GPS gps = new GPS(new RutaMasRapida(100),new NotificacionDeVoz(60,"Español"));

        System.out.println("------------------------GPS------------------------");
        gps.calcularRuta("Buenos Aires","Cordoba");

        gps.notificar("Gira a la derecha en 500 metros");

        RutaConPaisajes rutaConPaisajes= new RutaConPaisajes();
        rutaConPaisajes.agregarMirador("Mirador de montañas");

        System.out.println("----------------------------------------------------");

        System.out.println("------------------------GPS------------------------");
        gps.setRuta(rutaConPaisajes);
        gps.setNotificacion(new NotificacionVisual("Negro",20));

        gps.calcularRuta("Buenos Aires", "Mendoza");
        gps.notificar("Continúa recto por 2 km");

        System.out.println("----------------------------------------------------");
    }
}
