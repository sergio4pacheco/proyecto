import java.util.Random;
import java.util.Scanner;

public class App {

    static int numEqs = 4;
    static int jugEq = 9;
    static Equipo[] equipos = new Equipo[numEqs];
    static int contadorEquipos = 0;
    final static int MIN_JUGADORES = 9;
    final static int MAX_JUGADORES = 16;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        baseDatos();

        int opcion = 1;
        while (opcion != 0) {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1: // "1: Crear Equipo"
                    if (contadorEquipos < numEqs) {
                        crearEquipo();
                    } else {
                        System.out.println(
                                "lo sentimos pero ya llegamos al limite actual de equipos. \nEl limite de equipos es "
                                        + numEqs + " y actualmente hay " + contadorEquipos + " equipos.");
                    }
                    break;

                case 2:// "2: Agregar jugador a equipo"

                    agregarJugadorEquipo();
                    break;
                case 3:// "3: ver listado de equipos incriptos en el torneo"
                    verlistado();
                    break;
                default:
                    break;

                case 4: // jugar partidos
                    torneo();
                    break;
             case 5: // ver tabla de puntos
                   vertabla();
                   break;
            }
        }

        sc.close();
    }

    public static void baseDatos() {
        Equipo e1 = new Equipo("UNION Y CULTURA");
        Equipo e2 = new Equipo("UTN");
        Equipo e3 = new Equipo("ITALO");
        Equipo e4 = new Equipo("LOS PERICOS");

        e1.nuevoJugador("Daniel", "García ", "capitan", "1", "si", "si", "si");
        e1.nuevoJugador("Luis", "Martínez ", "subcapitan", "2", "si ", "si", "si");
        e1.nuevoJugador("Carlos", "González ", "jugador", "3", "si ", "si", "si");
        e1.nuevoJugador("Andrés", "Hernández ", "jugador", "4", "si ", "si", "si");
        e1.nuevoJugador("José", "Pérez ", "jugador", "5", "si ", "si", "si");
        e1.nuevoJugador("Alejandro", "Romero ", "jugador", "6", "si ", "si", "si");
        e1.nuevoJugador("Francisco", "Fernández ", "jugador", "7", "si ", "si", "si");
        e1.nuevoJugador("Miguel", "Torres ", "jugador", "8", "si ", "si", "si");
        e1.nuevoJugador("Antonio", "Flores ", "jugador", "9", "si ", "si", "si");
        e1.nuevoJugador("Manuel", "Ramírez ", "jugador", "10", "si ", "si", "si");
        e1.nuevoJugador("Javier", "Cruz ", "jugador", "11", "si ", "si", "si");
        e1.nuevoJugador("Guillermo", "Gómez ", "jugador", "12", "si ", "si", "si");
        e1.nuevoJugador("juan", "Rodríguez", "jugador", "13", "si ", "si", "si");
        e1.nuevoJugador("juan", "Cardozo", "jugador", "14", "si", "si", "si");
  

        e2.nuevoJugador("lautaro", "nolla", "jugador", "1", "si", "si", "si");
        e2.nuevoJugador("matias", "isapi", "jugador", "2", "si", "si", "si");
        e2.nuevoJugador("manuel", "medina", "jugador", "3", "si", "si", "si");
        e2.nuevoJugador("lucas", "alarcon", "jugador", "4", "si", "si", "si");
        e2.nuevoJugador("joaquin", "castellano", "jugador", "5", "si", "si", "si");
        e2.nuevoJugador("valentino", "molachino", "subcapitan", "6", "si", "si", "si");
        e2.nuevoJugador("santiago", "piersimone", "jugador", "7", "si", "si", "si");
        e2.nuevoJugador("lautaro", "becerra", "jugador", "8", "si", "si", "si");
        e2.nuevoJugador("wilfer", "florentin", "jugador", "9", "si", "si", "si");
        e2.nuevoJugador("ivo", "dabove", "capitan", "10", "si", "si", "si");
        e2.nuevoJugador("simón", "rivarola", "jugador", "11", "si", "si", "si");
        e2.nuevoJugador("tomas", "acosta", "jugador", "12", "si", "si", "si");
        e2.nuevoJugador("mirko", "mateljan", "jugador", "13", "si", "si", "si");
        e2.nuevoJugador("federico", "cabrera", "jugador", "14", "si", "si", "si");
        e2.nuevoJugador("jorge", "arrieta", "jugador", "15", "si", "si", "si");
        e2.nuevoJugador("juan", "barchetta", "jugador", "16", "si", "si", "si");

        e3.nuevoJugador("Gabriel", "Mendoza", "jugador", "1", "si", "si", "si");
        e3.nuevoJugador("Andrés", "Cruz", "jugador", "2", "si", "si", "si");
        e3.nuevoJugador("Sebastián", "Jiménez", "jugador", "3", "si", "si", "si");
        e3.nuevoJugador("Mateo", "Romero", "jugador", "4", "si", "si", "si");
        e3.nuevoJugador("Alejandro", "Vargas", "jugador", "5", "si", "si", "si");
        e3.nuevoJugador("Daniel", "Herrera", "jugador", "6", "si", "si", "si");
        e3.nuevoJugador("Santiago", "Paredes", "jugador", "7", "si", "si", "si");
        e3.nuevoJugador("Carlos", "Ramírez", "jugador", "8", "si", "si", "si");
        e3.nuevoJugador("Rafael", "González", "jugador", "9", "si", "si", "si");
        e3.nuevoJugador("José", "López", "jugador", "10", "si", "si", "si");
        e3.nuevoJugador("Juan", "Torres", "jugador", "11", "si", "si", "si");
        e3.nuevoJugador("Eduardo", "Castro", "jugador", "12", "si", "si", "si");
        e3.nuevoJugador("Fernando", "Gómez", "capitan", "13", "si", "si", "si");
        e3.nuevoJugador("Nicolás", "Silva", "subcapitan", "14", "si", "si", "si");
        e3.nuevoJugador("Luis", "Rodríguez", "jugador", "15", "si", "si", "si");
        e3.nuevoJugador("Antonio", "Martínez", "jugador", "16", "si", "si", "si");
       
         e4.nuevoJugador("Pedro","Gonzalez","jugador","1","si","si","si");
         e4.nuevoJugador("Luis","Hernandez","jugador","2","si","si","si");
         e4.nuevoJugador("Javier","Ramirez","jugador","3","si","si","si");
         e4.nuevoJugador("Carlos","Sanchez","capitan","4","si","si","si");
         e4.nuevoJugador("Alejandro","Jimenez","jugador","5","si","si","si");
         e4.nuevoJugador("Andrés","Martinez","jugador","6","si","si","si"); 
         e4.nuevoJugador("Gabriel","Castro","jugador"," 7","si","si","si");
         e4.nuevoJugador("Francisco","Ortega","jugador","8","si","si","si");
         e4.nuevoJugador("Ricardo","Dominguez","jugador","9","si","si","si");
         e4.nuevoJugador("Esteban","Flores","jugador","10","si","si","si");
         e4.nuevoJugador("Juan","Torres","jugador","11","si","si","si");
         e4.nuevoJugador("Miguel","Vargas","jugador","12","si","si","si");
         e4.nuevoJugador("Ernesto","Morales","subcapitan","13","si","si","si");
         e4.nuevoJugador("Fernando","Reyes","jugador","14","si","si","si");
         e4.nuevoJugador("Daniel","Silva","jugador","15","si","si","si");
         e4.nuevoJugador("Raúl","Herrera","jugador","16","si","si","si"); 
      

        equipos[0] = e1;
        equipos[1] = e2;
        equipos[2] = e3;
        equipos[3] = e4;
        contadorEquipos = 4;

    }

    public static void menu() {
        System.out.println("\n   [---MENU DE OPCIONES---] ");
        System.out.println("Elija una opción: ");
        System.out.println("1: Crear Equipo");
        System.out.println("2: Agregar jugador a equipo");
        System.out.println("3: ver Equipos inscriptos en el torneo");
        System.out.println("4: torneo");
        System.out.println("5: ver tabla de puntaje");
        System.out.println("0: Salir");
    }

    public static void crearEquipo() {
        

        System.out.println("BIENVENIDO " + "aqui vas a inscribir a tu equipo al torneo");
        System.out.println("Ingrese el nombre del equipo: ");
        String nombreEquipo = sc.nextLine();
        if (nombreEquipo.equals(nombreEquipo.toUpperCase())) {
            System.out.println("Indique la cantidad de jugadores del equipo: ");
            int cantidadJugadpres = sc.nextInt();
            sc.nextLine();
            if (MIN_JUGADORES <= cantidadJugadpres && cantidadJugadpres <= MAX_JUGADORES) {
                Equipo e = new Equipo(nombreEquipo.toUpperCase());

                for (int i = 0; i < cantidadJugadpres; i++) {
                    Jugador j = agregarJugador(i + 1);
                    e.nuevoJugador(j.getNombre(), j.getApellido(), j.getRol(), j.getNumerocam(), j.getDni(),
                            j.getObrasocial(), j.getAptomedico());
                }
                equipos[contadorEquipos] = e;
                contadorEquipos++;
                System.out.println("el equipo que usted inscribio es el siguiente " + (e.getNombredeequipo()));
                e.verJugadores();

            } else {
                System.out.println(
                        "El equipo tiene que tener un minimo de 9 integrantes y un maximo de 16 contando los comodines.");
            }
        } else {
            System.out.println("El nombre del equipo debe estar esrito en mayusculas ");
        }
    }

    public static Jugador agregarJugador(int i) {
        System.out.println("Ingrese el nombre del jugador " + i);
        String nombre = sc.nextLine();

        System.out.println("Ingrese el apellido del jugador " + i);
        String apellido = sc.nextLine();

        System.out.println("ingrese el rol del jugador, puede ser capitan, subcapitan y jugador");
        String rol = sc.nextLine();

        System.out.println("ingrese el numero de camiseta del jugador ");
        String numerocam = sc.nextLine();

        System.out.println("ingrese si el jugador dio la fotocopia dni");
        String Dni = sc.nextLine();

        System.out.println("ingrese si el jugador tiene obra social");
        String obrasocial = sc.nextLine();

        System.out.println("ingrese si el jugador tiene apto medico");
        String aptomedico = sc.nextLine();

        return new Jugador(nombre, apellido, rol, numerocam, Dni, obrasocial, aptomedico);
    }

    public static void agregarJugadorEquipo() {
        System.out.println("Ingrese el nombre del equipo: ");
        String nombreEquipo = sc.nextLine();
        Boolean encontrado = false;

        for (int i = 0; i < contadorEquipos && i < equipos.length; i++) {
            if (equipos[i].getNombredeequipo().equals(nombreEquipo) && equipos[i].cantidadJugadores() < 16) {
                encontrado = true;
                Jugador j = agregarJugador(equipos[i].cantidadJugadores() + 1);
                equipos[i].nuevoJugador(j.getNombre(), j.getApellido(), j.getRol(), j.getNumerocam(), j.getDni(),
                        j.getObrasocial(), j.getAptomedico());

                equipos[i].verJugadores();
                // IMPRIMIR EL EQUIPO CON LOS NUEVOS JUGADORES
                break;
            }
        }

        if (!encontrado) { // === if (encontrado == false)
            System.out.println(
                    "esta intentando agregar un jugador a un equipo inexistente, escribio mal el nombre o el equipo llego al maximo de jugadores inscriptos \nRECUERDE los nombres de los equipos van en mayusculas\nen el caso en el que no tenga equipo puede crearlo en la opcion 1 , la cual dice crear equipo");
        }
    }

    // imprimir cada equipo con sus respectivos jugadores y caracteristicas
    public static void verlistado() {

        // 3 Listamos los equipos
        for (int i = 0; i < contadorEquipos; i++) {
            System.out.println(equipos[i].getNombredeequipo());
            // Listamos los jugadores de ese equipo
            equipos[i].verJugadores();

        }
    }

    public static void torneo() {


      /*   Encuentro 1:
         uyc vs  utn

            Encuentro 2: 
        italo vs  los pericos

        Encuentro 3:
         uyc vs  italo

        Encuentro 4:
         utn vs  los pericos

        Encuentro 5:
         uyc vs  pericos

        Encuentro 6:
         utn vs  italo
*/
        System.out.println(
                "ingrese el nombre de los equipos que van jugar el partido \n !!IMPORTANTE el equipo tiene que estar inscripto previamente");
        String equipo1 = sc.nextLine();
        String equipo2 = sc.nextLine();
        Random rnd = new Random();
        int ran = rnd.nextInt(7);
        int ran2 = rnd.nextInt(7);
        int puntosequipo1, puntosequipo2;
        puntosequipo1 = puntosequipo2 = 0;
        Equipo e1 = new Equipo();
        Equipo e2 = new Equipo();
        int control = 0;

        for (int i = 0; i < contadorEquipos && i < equipos.length; i++) {
            if (equipos[i].getNombredeequipo().equals(equipo1)) {
                e1 = equipos[i];
                control++;
                if (ran > ran2) {
                    equipos[i].puntosGanados(3);
                    puntosequipo1 = 3;
                }
                if (ran < ran2) {
                    equipos[i].puntosGanados(0);
                    puntosequipo1 = 0;
                }
                if (ran == ran2) {
                    equipos[i].puntosGanados(1);
                    puntosequipo1 = 1;
                }
            }

            if (equipos[i].getNombredeequipo().equals(equipo2)) {
                e2 = equipos[i];
                control++;
                if (ran > ran2) {
                    equipos[i].puntosGanados(0); // El equipo perdió el partido
                    puntosequipo2 = 0;
                }
                if (ran < ran2) {
                    equipos[i].puntosGanados(3); // El equipo ganó el partido
                    puntosequipo2 = 3;
                }
                if (ran == ran2) {
                    equipos[i].puntosGanados(1); // El equipo empató el partido
                    puntosequipo2 = 1;
                }
            }
        }

        if (control == 2) {
            System.out.println(equipo1 + ran + "-" + ran2 + " " + equipo2);
            System.out.println(equipo1 + "|" + equipo2);
            System.out.println(puntosequipo1 + "|" + puntosequipo2);
            System.out.println(e1.getPuntosGanados() + "|" + e2.getPuntosGanados());
        } else {
            System.out.println(
                    "el equipo que marco no esta inscripto en este torneo , por favor revise que el equipo este correctamente escrito !!todos los equipos estan inscriptos con letras mayusculas¡¡");
        }
    }

public static void vertabla(){
    
    System.out.println("A continuacion se muestran los respectivos equipos con sus puntos : ");
    System.out.println( equipos [0]. getNombredeequipo() + " = " + equipos[0].getPuntosGanados());
    System.out.println( equipos [1]. getNombredeequipo() + " = " + equipos[1].getPuntosGanados());
    System.out.println( equipos [2]. getNombredeequipo() + " = " + equipos[2].getPuntosGanados());
   // System.out.println( equipos [3]. getNombredeequipo() + " = " + equipos[3].getPuntosGanados());
}
}







