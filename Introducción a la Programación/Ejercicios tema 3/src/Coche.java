public class Coche {
    private int nPuertas;

    public Coche(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public void incrementarPuertas() {
        this.nPuertas++;
    }

    @Override
    public String toString() {
        return "Coche [Numero de puertas: " + nPuertas + "]";
    }
    
}
