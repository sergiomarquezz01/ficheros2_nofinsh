package bootcamp;

import java.util.Scanner;

public class Ej1_bootcamp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String opcion;
		
		String lugar = ""; //escribo el lugar
		String x = ""; //es la latitud
		String y = ""; //es la longitud

		do {
			System.out.println("Aqui tienes el menu:");
			System.out.println("1 - Lugar:");
			System.out.println("2 - Coordenadas:");
			System.out.println("3 - Saliendo del Menu:");

			opcion = s.nextLine();

			switch (opcion) {
				case "1":
					if (!lugar.equals("") && (!x.equals("") || !y.equals(""))) {
						System.out.println("Lugar: " + lugar + " Latitud:? " + x + " Longitud:? " + y);
					} else {
						System.out.println("Lugar?:");
						lugar = s.nextLine();
					}
				break;

			case "2":
				System.out.println("Latitud?:");
				x = s.nextLine();
				System.out.println("Longitud?:");
				y = s.nextLine();
				break;

			case "3":
				System.out.println("¿Quieres salir del menu?:");
				opcion = s.nextLine();
				System.out.println("gracias por crear este maravilloso menú");
				System.exit(0);
				break;

			default:
				System.out.println("opcion incorrecta, vuelva a elegir otra opcion");
				break;
			}

		} while (!opcion.equals("3"));

		s.close();

	}

}

