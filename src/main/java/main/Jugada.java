package main;

public class Jugada {

    public String jugar(String eleccionUsuario, String eleccionComputadora) {
        String resultado;
        if (eleccionUsuario.equals(eleccionComputadora)) {
            resultado = "¡Es un empate!";
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            resultado = "¡Ganaste!";
        } else {
            resultado = "¡Perdiste!";
        }
        return resultado;
    }
}
