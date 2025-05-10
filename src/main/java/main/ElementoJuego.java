package main;

import java.util.Objects;

public abstract class ElementoJuego {
    private final String representacion;

    protected ElementoJuego(String representacion) {
        this.representacion = representacion;
    }

    abstract boolean leGanaA(ElementoJuego eleccionComputadora);

    abstract boolean pierdeContraTijera();

    abstract boolean pierdeContraPapel();

    abstract boolean pierdeContraPiedra();

    @Override
    public String toString() {
        return representacion;
    }

    public boolean empataCon(ElementoJuego eleccionComputadora) {
        return Objects.equals(representacion, eleccionComputadora.representacion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(representacion);
    }
}
