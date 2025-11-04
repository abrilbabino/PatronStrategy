public class NotificacionDeVibracion implements Notificacion {
    private int intensidad;
    private int duracion;

    public NotificacionDeVibracion(int intensidad,int duracion){
        this.intensidad= intensidad;
        this.duracion= duracion;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    private void vibrar() {
        System.out.println("Vibrando con intensidad " + intensidad + " durante " + duracion + " ms");
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(mensaje);
        vibrar();
    }
}
