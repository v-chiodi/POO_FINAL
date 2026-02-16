package Recu2024MARTIN;

public class ColSecRes extends ColSec {

    @Override
    public void addElem(ElementoBiblioteca agregar, Condicion c) {
        if (c.cumple(agregar)) {
            super.addElem(agregar);
        }
    }
    //revisar a ver si esta bien
}
