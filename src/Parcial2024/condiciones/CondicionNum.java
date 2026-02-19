package Parcial2024.condiciones;

import Parcial2024.Figurita;

public class CondicionNum extends Condicion {
    private static int numeroCum = 20;

    @Override
    public boolean cumple(Figurita f) {
        if (f.getNumFig()<numeroCum){
            return true;
        }
        return false;
    }
}
