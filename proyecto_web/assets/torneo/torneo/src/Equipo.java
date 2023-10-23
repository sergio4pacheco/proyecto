import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private List<Jugador> jugadores = new ArrayList<Jugador>();
    String nombredeequipo;
    int cantidad = 0;
    int puntosGanados = 0;
    final static int MIN_JUGADORES = 9;
    final static int MAX_JUGADORES = 14;

    public Equipo(String nombredeequipo) {
        this.nombredeequipo = nombredeequipo;
    }

    public String getNombredeequipo() {
        return nombredeequipo;
    }

    public void setNombredeequipo(String nombredeequipo) {
        this.nombredeequipo = nombredeequipo;
    }

    
    public int getPuntosGanados() {
        return puntosGanados;
    }

    public void setPuntosGanados(int puntosGanados) {
        this.puntosGanados = puntosGanados;
    }

    public void nuevoJugador(String nombre, String apellido, String rol, String numerocam, String dni,
            String obrasocial, String aptomedico) {
        Jugador j = new Jugador(nombre, apellido, rol, numerocam, dni, obrasocial, aptomedico);
        jugadores.add(j);
        cantidad++;
    }

    public Equipo() {
        // jugadores = new Jugador[App.jugEq];
    }

    public void puntosGanados(int puntosGanados) {
        this.puntosGanados += puntosGanados;
    }

    public void verJugadores() {

        // Listamos los jugadores de ese equipo
        for (int j = 0; j < jugadores.size(); j++) {
            System.out.println(jugadores.get(j).getNombre() + " " + jugadores.get(j).getApellido() + " "
                    + jugadores.get(j).getRol() + " camiseta n°" + jugadores.get(j).getNumerocam());

        }
        System.out.println("");
    }

    public int cantidadJugadores(){
        return jugadores.size();
    }

}
