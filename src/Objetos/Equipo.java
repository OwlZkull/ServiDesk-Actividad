package Objetos;


public abstract class Equipo {
    // Atributos privados (Encapsulamiento)
    private String numeroSerie;
    private String marca;
    private String modelo;

    // Constructor
    public Equipo(String numeroSerie, String marca, String modelo) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstracto obligatorio para las subclases (Polimorfismo)
    public abstract void mostrarFichaTecnica();

    // Getters y Setters (Encapsulamiento)
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}