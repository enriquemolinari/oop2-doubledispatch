package main;

public class Tijera extends ElementoJuego {
    protected Tijera() {
        super("Tijera");
    }

    @Override
    public boolean leGanaA(ElementoJuego eleccionComputadora) {
        return eleccionComputadora.pierdeContraTijera();
    }

    @Override
    public boolean pierdeContraTijera() {
        return false;
    }

    @Override
    public boolean pierdeContraPapel() {
        return false;
    }

    @Override
    public boolean pierdeContraPiedra() {
        return true;
    }
}
