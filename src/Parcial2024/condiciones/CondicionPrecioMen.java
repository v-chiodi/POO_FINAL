package Parcial2024.condiciones;

import Parcial2024.Figurita;

public class CondicionPrecioMen extends Condicion{
    private static int precioMen=250;

    @Override
    public boolean cumple(Figurita f) {
        if(f.getPrecio()<precioMen){
            return true;
        }
        return false;
    }
}
