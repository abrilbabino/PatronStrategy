public class NotificacionVisual implements Notificacion{
    private String colorTexto;
    private int tamanioLetra;

    public NotificacionVisual(String colorTexto, int tamanioLetra){
        this.colorTexto=colorTexto;
        this.tamanioLetra=tamanioLetra;
    }

    public void setColorTexto(String colorTexto) {
        this.colorTexto = colorTexto;
    }

    public String getColorTexto() {
        return colorTexto;
    }

    public void setTamanioLetra(int tamanioLetra) {
        this.tamanioLetra = tamanioLetra;
    }

    public int getTamanioLetra() {
        return tamanioLetra;
    }

    private void mostrarEnPantalla(String mensaje) {
        System.out.println("Pantalla [" + colorTexto + ", tamaño " + tamanioLetra + "]: " + mensaje);
    }

    @Override
    public void notificar(String mensaje) {
        mostrarEnPantalla(mensaje);
    }
}
