package Parcial2024;

import Parcial2024.condiciones.Condicion;

public class ColeccionPriv extends Coleccion {

    public ColeccionPriv(String nombre) {
        super(nombre);
    }

    @Override
    public ElementoFig getCopia(Condicion c) {
        return null;
    }
}
