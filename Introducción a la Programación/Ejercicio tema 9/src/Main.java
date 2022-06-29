public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Manuel", 26, 625973682, 12000);

        System.out.println("Datos del cliente:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador("Juan", 30, 625846582, 2000);

        System.out.println("\nDatos del trabajador:");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }    
}