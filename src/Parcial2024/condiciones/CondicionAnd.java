package Parcial2024.condiciones;

import Parcial2024.Figurita;

public class CondicionAnd extends Condicion{
    private Condicion c1;
    private Condicion c2;

    @Override
    public boolean cumple(Figurita f) {
        if(c1.cumple(f) && c2.cumple(f)){
            return true;
        }
        return false;
    }
}
