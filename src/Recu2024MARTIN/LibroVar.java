package Recu2024MARTIN;

public class LibroVar extends Libro {
    private final int divisor=60;

    @Override
    public int getTiempo() {
        int totalTiempo = -1;
        totalTiempo = (getGeneros().size() * this.getTiempo()) / divisor;
        return totalTiempo;
    }
}
