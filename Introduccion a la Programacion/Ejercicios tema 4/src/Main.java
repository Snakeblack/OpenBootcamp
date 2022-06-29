public class Main {
    public static void main(String[] args) {
        int numerolf = 5;
        int numeroWhile = 0;
        String estacion = "Verano";

        System.out.println("If-elseif-else:");
        if(numerolf < 0)
            System.out.println("El numero es negativo");
        else if(numerolf > 0)
            System.out.println("El numero es positivo");
        else
            System.out.println("El numero es cero");

        System.out.println("\nWhile:");
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("\nDo While:");
        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);


        System.out.println("\nFor:");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("\nSwitch:");
        switch (estacion.toLowerCase()) {
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("Estacion no valida");
                break;
        }
    }
}