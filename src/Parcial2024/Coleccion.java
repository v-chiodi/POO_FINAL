package Parcial2024;

import Parcial2024.condiciones.Condicion;

import java.util.ArrayList;

public class Coleccion extends ElementoFig{
    private ArrayList<ElementoFig> elementos;
    private static double porcentaje = 0.01;
    private static double tope = 0.5;

    public Coleccion(String nombre) {
        super(nombre);
        ArrayList<ElementoFig> elementos = new ArrayList<>();
    }

    @Override
public int getPrecio() {
    int suma = 0;
    int cant = 0;
    int devolver = 0;
    for (ElementoFig ee : elementos) {
        cant += ee.getCant();
        suma += ee.getPrecio();
    }
    if ((cant * porcentaje) < tope) {
         devolver = (int) (suma - (suma * porcentaje * cant));
    } else {
         devolver = (int) (suma - (suma * tope));
    }
    return devolver;
}

    @Override
    public int getCant() {
        int cantidadDev=0;
        for (ElementoFig ee: elementos) {
            cantidadDev += ee.getCant();
        }
    return cantidadDev;
    }

    @Override
    public Figurita getMayor() {
        Figurita elMayor = null;

        for (ElementoFig ee : elementos) {
            Figurita posibleMayor = ee.getMayor();
            if (posibleMayor != null) {
                if (elMayor == null || posibleMayor.getPrecio() > elMayor.getPrecio()) {
                    elMayor = posibleMayor;
                }
            }

        }
        return elMayor;
    }
 @Override
    public ElementoFig getCopia(Condicion c) {
     // 1. Creamos el "cascarón" de esta misma colección.
     Coleccion copiaColeccion = new Coleccion(this.getNombre());

     // 2. Recorremos a nuestros hijos originales
     for (ElementoFig ee : this.elementos) {

         // Le pedimos al hijo que se copie a sí mismo aplicándole el filtro
         ElementoFig copiaHijo = ee.getCopia(c);

         // 3. Si el hijo NO devolvió null (es decir, pasó el filtro o es una subcolección con cosas)
         if (copiaHijo != null) {
             // Lo agregamos a nuestro cascarón
             copiaColeccion.addElem(copiaHijo);
         }
     }

     // 4. EL CONTROL FINAL (La regla de oro del parcial)
     // Ya terminamos de revisar a todos los hijos. ¿Quedó algo adentro de nuestra copia?
     if (copiaColeccion.elementos.isEmpty()) { // Si tu ArrayList quedó vacío
         return null; // Nos autodestruimos y devolvemos null
     }

     // 5. Si llegamos hasta acá, es porque la colección tiene al menos 1 figurita filtrada
     return copiaColeccion;
 }

 public void addElem(ElementoFig e){
        this.elementos.add(e);
}

}
