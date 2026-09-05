package Objetos;


public class Computador extends Equipo {
    private int memoriaRAM; // Memoria en GB
    private String procesador;

    // Constructor
    public Computador(String numeroSerie, String marca, String modelo, int memoriaRAM, String procesador) {
        super(numeroSerie, marca, modelo);
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
    }

    // Implementación polimórfica del método abstracto
    @Override
    public void mostrarFichaTecnica() {
        System.out.println("=== SERVIDESK - FICHA TÉCNICA: COMPUTADOR ===");
        System.out.println("Nº Serie    : " + getNumeroSerie());
        System.out.println("Marca       : " + getMarca());
        System.out.println("Modelo      : " + getModelo());
        System.out.println("Memoria RAM : " + memoriaRAM + " GB");
        System.out.println("Procesador  : " + procesador);
        System.out.println("============================================");
    }

    // Getters y Setters específicos
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}