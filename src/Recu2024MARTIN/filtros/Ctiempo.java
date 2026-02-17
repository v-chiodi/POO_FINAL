package Recu2024MARTIN.filtros;

import Recu2024MARTIN.ElementoBiblioteca;
import Recu2024MARTIN.Libro;

public class Ctiempo extends Condicion{
    private int tiempoReq;

    @Override
    public boolean cumple(ElementoBiblioteca l) {
        if (l.getTiempo()<tiempoReq){
            return true;
        }
        return false;
    }
}
