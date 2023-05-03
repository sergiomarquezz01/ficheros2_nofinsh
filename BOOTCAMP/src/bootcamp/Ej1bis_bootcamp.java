package bootcamp;

import java.util.Scanner;

public class Ej1bis_bootcamp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String entrada = "";

        String[][] coordenadas = new String[2][2]; // array para almacenar coordenadas

        int i = 0; // contador para las coordenadas

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("F - Salir");
            entrada = s.nextLine();

            switch (entrada) {

               case "1":
                    if (i < coordenadas.length) {
                        System.out.println("Introduzca la coordenada (x,y)");
                        String coordenada = s.nextLine();

                        if (coordenada.contains(",")) {
                        	String[] puntos = coordenada.split(",");

                            coordenadas[i][0] = puntos[0].trim(); // coordenada x
                            coordenadas[i][1] = puntos[1].trim(); // coordenada y
                            i++;
                            System.out.println("Punto agregado correctamente.");
                        } else {
                            System.out.println("Coordenada no válida. Debe estar separada por una coma.");
                        }
                    } else {
                        System.out.println("No puedes agregar más puntos. El límite es 2.");
                    }
                break;

                case "F":
                    break;
                default:
                    System.out.println("Vuelva a intentarlo .");
                break;
            }

        } while (!entrada.equals("F"));

        System.out.println("Puntos introducidos:");
        for (int j = 0; j < i; j++) {
            System.out.println("(" + coordenadas[j][0] + " , " + coordenadas[j][1] + ")");
        }
        s.close();
    }
}
