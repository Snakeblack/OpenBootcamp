public class Trabajador extends Persona {
    private int salario;

    public Trabajador(String nombre, int edad, int telefono, int salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

}
