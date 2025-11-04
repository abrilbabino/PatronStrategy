import java.util.ArrayList;

public class RutaConPaisajes implements Ruta{
    private ArrayList<String> miradores= new ArrayList<String>();

    public void agregarMirador(String mirador){
        miradores.add(mirador);
    }

    public ArrayList<String> getMiradores() {
        return miradores;
    }

    private void mostrarPuntosDeInteres(){
        for(String s: miradores){
            System.out.println(s);
        }
    }

    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Ruta panorámica de " + origen + " a " + destino);
        System.out.println("Puntos de interes: ");
        mostrarPuntosDeInteres();
    }
}
