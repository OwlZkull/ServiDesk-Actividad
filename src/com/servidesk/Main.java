package com.servidesk;

import Objetos.Computador;
import Objetos.Equipo;
import Objetos.Ticket;

public class Main {
    public static void main(String[] args) {
        // Demostración de Polimorfismo: Referencia tipo Equipo, Instancia tipo Computador
        Equipo pcCliente = new Computador("SN-987654321", "Dell", "Latitude 5420", 16, "Intel Core i7");

        // Instanciación del Ticket con el equipo ingresado
        Ticket ticketServicio = new Ticket(101, pcCliente);

        System.out.println(">>> INGRESO DE EQUIPO A SERVIDESK <<<\n");
        ticketServicio.mostrarDetalleTicket();

        // Simulación de avance en el servicio técnico (PENDIENTE -> EN_PROCESO)
        System.out.println("\n>>> ACTUALIZANDO ESTADO DE LA ORDEN DE SERVICIO <<<");
        ticketServicio.actualizarEstado("EN_PROCESO", "Limpieza de componentes e instalación de SSD.");

        ticketServicio.mostrarDetalleTicket();
    }
}
