package main;

public class Jugada {

    public static final String PERDISTE = "¡Perdiste!";
    public static final String EMPATE = "¡Es un empate!";
    public static final String GANASTE = "¡Ganaste!";

    public String jugar(ElementoJuego eleccionUsuario, ElementoJuego eleccionComputadora) {
        String resultado = PERDISTE;

        if (eleccionUsuario.empataCon(eleccionComputadora)) {
            resultado = EMPATE;
        }

        if (eleccionUsuario.leGanaA(eleccionComputadora)) {
            resultado = GANASTE;
        }

        return resultado;
    }
}
