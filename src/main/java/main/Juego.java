package main;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    private final ElementoJuego[] opciones = {new Piedra(), new Papel(), new Tijera()};
    private final Map<String, ElementoJuego> stringToElementoJuego = Map.of(
            "piedra", new Piedra(),
            "papel", new Papel(),
            "tijera", new Tijera()
    );

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            ElementoJuego eleccionUsuario = elegirElementoUsuario(scanner);
            ElementoJuego eleccionComputadora = elegirElementoComputadora(opciones);
            // Mostrar las elecciones de ambos jugadores
            System.out.println("Tu elección: " + eleccionUsuario);
            System.out.println("Elección de la computadora: " + eleccionComputadora);

            String resultado = new Jugada().jugar(eleccionUsuario, eleccionComputadora);

            System.out.println(resultado);
            continuar = preguntarSiQueremosContinuar();
        }
        System.out.println("¡Hasta pronto!");
        scanner.close();
    }

    private ElementoJuego elegirElementoUsuario(Scanner scanner) {
        // Solicitar al usuario que ingrese su elección
        System.out.println("Elige una opción: piedra, papel o tijera");
        String eleccion = scanner.nextLine().toLowerCase();
        if (!stringToElementoJuego.containsKey(eleccion)) {
            System.out.println("Opción no válida. Intenta de nuevo.");
            return elegirElementoUsuario(scanner);
        }
        return stringToElementoJuego.get(eleccion);
    }

    private ElementoJuego elegirElementoComputadora(ElementoJuego[] opciones) {
        // Crear un objeto Random para generar la elección de la computadora
        Random random = new Random();
        // Generar la elección de la computadora
        int indice = random.nextInt(3);
        return opciones[indice];
    }

    private boolean preguntarSiQueremosContinuar() {
        System.out.println("¿Desea continuar? s/n");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        return respuesta.toLowerCase().charAt(0) == 's';
    }
}
