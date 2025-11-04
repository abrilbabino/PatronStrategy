public class GPS {
    private Ruta ruta;
    private Notificacion notificacion;

    public GPS(Ruta ruta, Notificacion notificacion){
        this.ruta= ruta;
        this.notificacion= notificacion;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void calcularRuta(String origen, String destino){
        ruta.calcularRuta(origen,destino);
    };

    public void notificar(String mensaje){
        notificacion.notificar(mensaje);
    };

}
