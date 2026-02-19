package Recu2024MARTIN;

import Recu2024MARTIN.filtros.Condicion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoCol extends ElementoBiblioteca {

    protected ArrayList<ElementoBiblioteca> elementos;

    @Override
    public ArrayList<String> getGeneros() {
        ArrayList<String> generosDev = new ArrayList<String>();

        for (ElementoBiblioteca e : this.elementos) {
            ArrayList<String> gAux = e.getGeneros();
            for (String g : gAux) {
                if (!generosDev.contains(g)) {
                    generosDev.add(g);
                }
            }
        }
        return generosDev;
    }

    public ArrayList<ElementoBiblioteca> getElementos() {
        ArrayList<ElementoBiblioteca> devolver = new ArrayList<>();
        devolver.addAll(elementos); //copia una lista en otra aux
        return devolver; //devuelve la aux
    }

    public void addElem(ElementoBiblioteca eAdd){
        elementos.add(eAdd);

    }

    public ElementoCol() {
        super(); //para rellenar en el constructor del padre
        this.elementos = new ArrayList<>(); //inicializa el arreglo
    }

    @Override
    public ArrayList<Libro> buscar(Condicion c, Comparator<Libro> comp) {
        ArrayList<Libro> devolverFinal = new ArrayList<>();
        for (ElementoBiblioteca e : elementos){
           ArrayList<Libro> aux = e.buscar(c,comp);
           for (Libro l : aux){
               if (!devolverFinal.contains(l)){
                   devolverFinal.add(l);
               }
           }
        }
        Collections.sort(devolverFinal,comp);
        return devolverFinal;
    }
}