package prueba;

import java.util.ArrayList;
import java.util.Collections;


class Juego7Medio {
    private ArrayList<Carta> baraja;
    private Jugador[] jugadores;

    public Juego7Medio() {
        baraja = new ArrayList<>();
        jugadores = new Jugador[3];

        // Inicializar los jugadores
        jugadores[0] = new Jugador("Jugador 1");
        jugadores[1] = new Jugador("Jugador 2");
        jugadores[2] = new Jugador("Jugador 3");

        // Crear la baraja española
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] numeros = {"As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

        for (String palo : palos) {
            for (String numero : numeros) {
                baraja.add(new Carta(numero, palo));
            }
        }

        // Mezclar las cartas
        Collections.shuffle(baraja);

        // Repartir dos cartas a cada jugador
        for (int i = 0; i < 2; i++) {
            for (Jugador jugador : jugadores) {
                jugador.recibirCarta(baraja.remove(0));
            }
        }

        // Mostrar las cartas de cada jugador
        for (Jugador jugador : jugadores) {
            jugador.mostrarMano();
        }
    }
}