public class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public Persona() {
      // constructor vacio
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona {\n" +
                "\tedad: " + edad + ",\n" +
                "\tnombre: " + nombre + ",\n" +
                "\ttelefono: " + telefono + "\n" +
                '}';
    }
}
