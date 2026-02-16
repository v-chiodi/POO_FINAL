package Recu2024MARTIN;

public class ColOp extends ElementoCol{

    @Override
    public int getTiempo() {
        int mayor = -1; //valor discernible

        for (ElementoBiblioteca e: elementos){
            if(mayor<e.getTiempo()){
                mayor = e.getTiempo();
            }
        }
        return mayor;
    }

    @Override
    public int getPuntaje() {
        int mayor = -1; //valor discernible

        for (ElementoBiblioteca e: elementos){
            if(mayor<e.getPuntaje()){
                mayor = e.getPuntaje();
            }
        }
        return mayor;

    }

    public ColOp() {
    }

    //getter setter constructores
}
