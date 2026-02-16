package Recu2024MARTIN;

public class ColSec extends ElementoCol{

    @Override
    public int getPuntaje() {
        int suma = 0;
        for (ElementoBiblioteca e: elementos){
            suma+= e.getPuntaje();
        }
        return suma;
    }

    @Override
    public int getTiempo() {
        int suma = 0;
        for (ElementoBiblioteca e: elementos){
            suma+= e.getTiempo();
        }
        return suma;
    }
//getter setter constructores
}
