package Parcial2024.condiciones;

import Parcial2024.Figurita;

public class CondicionAlbum extends Condicion {
    private String tituloCoin;

    @Override
    public boolean cumple(Figurita f) {
        if(f.getAlbum().equals(tituloCoin)){
            return true;
        }
        return false;
    }
}
