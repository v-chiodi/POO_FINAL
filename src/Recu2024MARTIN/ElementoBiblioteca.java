package Recu2024MARTIN;

import java.util.ArrayList;

public abstract class ElementoBiblioteca {

    public abstract ArrayList <String> getGeneros();
    public abstract int getPuntaje();
    public abstract int getTiempo();

    public abstract ArrayList<Libro> buscar(Condicion c);
}
