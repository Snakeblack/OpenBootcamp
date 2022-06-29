public class Cliente extends Persona {
    private int credito;

    public Cliente(String nombre, int edad, int telefono, int credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}
