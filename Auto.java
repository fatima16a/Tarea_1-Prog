public class Auto {
    private String marca;
    private String matricula;
    public Persona persona;

    public Auto(String marca, String modelo, Persona persona) {
        this.marca = marca;
        this.matricula = modelo;
        this.persona = persona;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.matricula = modelo;
    }

}