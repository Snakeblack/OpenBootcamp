public class Main { 
    public static void main(String[] args) {
        System.out.println("Suma de 3 numeros: " + Suma.suma(1, 2, 3));

        Coche miCoche = new Coche(1);
        System.out.println("Numero de puertas: " + miCoche.getnPuertas());
    }
}