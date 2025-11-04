public class NotificacionDeVoz implements Notificacion{
    private int volumen;
    private String idioma;

    public NotificacionDeVoz(int volumen, String idioma){
        this.volumen= volumen;
        this.idioma=idioma;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    private void reproducirAudio(String mensaje) {
        System.out.println("Reproduciendo audio [" + idioma + "] a volumen " + volumen + ": " + mensaje);
    }

    @Override
    public void notificar(String mensaje) {
        reproducirAudio(mensaje);
    }
}
