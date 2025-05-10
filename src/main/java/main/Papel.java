package main;

public class Papel extends ElementoJuego {
    protected Papel() {
        super("Papel");
    }

    @Override
    public boolean leGanaA(ElementoJuego eleccionComputadora) {
        return eleccionComputadora.pierdeContraPapel();
    }

    @Override
    public boolean pierdeContraTijera() {
        return true;
    }

    @Override
    public boolean pierdeContraPapel() {
        return false;
    }

    @Override
    public boolean pierdeContraPiedra() {
        return false;
    }
}
