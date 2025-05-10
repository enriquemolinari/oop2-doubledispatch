package main;

public class Piedra extends ElementoJuego {

    protected Piedra() {
        super("Piedra");
    }

    @Override
    public boolean leGanaA(ElementoJuego eleccionComputadora) {
        return eleccionComputadora.pierdeContraPiedra();
    }

    @Override
    public boolean pierdeContraTijera() {
        return false;
    }

    @Override
    public boolean pierdeContraPapel() {
        return true;
    }

    @Override
    public boolean pierdeContraPiedra() {
        return false;
    }
}
