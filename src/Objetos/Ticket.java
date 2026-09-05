package Objetos;


public class Ticket {
    private int idTicket;
    private Equipo equipo; // Referencia abstracta a Equipo (Polimorfismo)
    private String estado; // PENDIENTE, EN_PROCESO, FINALIZADO
    private String diagnostico;

    // Constructor
    public Ticket(int idTicket, Equipo equipo) {
        this.idTicket = idTicket;
        this.equipo = equipo;
        this.estado = "PENDIENTE";
        this.diagnostico = "Sin diagnóstico registrado";
    }

    // Método para cambiar el estado de la orden
    public void actualizarEstado(String nuevoEstado, String diagnostico) {
        this.estado = nuevoEstado;
        this.diagnostico = diagnostico;
    }

    // Muestra los detalles del ticket ejecutando el método polimórfico
    public void mostrarDetalleTicket() {
        System.out.println("---------------------------------");
        System.out.println("SERVIDESK - TICKET #" + idTicket);
        System.out.println("Estado Actual : " + estado);
        System.out.println("Diagnóstico   : " + diagnostico);
        equipo.mostrarFichaTecnica(); // Invocación polimórfica
    }

    // Getters y Setters
    public int getIdTicket() {
        return idTicket;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public String getEstado() {
        return estado;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
}