package prueba;

import java.util.ArrayList;

import java.util.Collections;

class Carta {
    private String numero;
    private String palo;

    public Carta(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public String getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}