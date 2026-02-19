package Parcial2024.condiciones;

import Parcial2024.Figurita;

public class CondicionNot extends Condicion {
    private Condicion c1;

    @Override
    public boolean cumple(Figurita f) {
        if (!c1.cumple(f)){
            return true;
        }
        return false;
    }
}
