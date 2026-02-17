package Recu2024MARTIN;

import Recu2024MARTIN.filtros.Condicion;

public class ColSecRes extends ColSec {
    private Condicion c;

    @Override
    public void addElem(ElementoBiblioteca agregar) {
        if (c.cumple(agregar)) {
            super.addElem(agregar);
        }
    }
    //revisar a ver si esta bien
}
