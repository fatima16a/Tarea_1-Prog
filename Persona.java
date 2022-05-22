public class Persona {
    private String nombre;
    public int cuentaCorriente;

    
    public Persona(String nombre, int cuentaCorriente) {
        this.nombre = nombre;
        this.cuentaCorriente = 0;
    }

    public String getNombre() {
        return nombre;
    }
}