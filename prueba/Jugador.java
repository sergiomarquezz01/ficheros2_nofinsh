package prueba;

import java.util.ArrayList;

class Jugador {
    private String nombre;
    private ArrayList<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    public void mostrarMano() {
        System.out.println(nombre + ":");
        for (Carta carta : mano) {
            System.out.println(carta);
        }
        System.out.println();
    }
}