package hilos;

import modelo.Inscripcion;

public class EnvioTicketsThread extends Thread {

    private Inscripcion.TicketDeAcceso[] tickets;

    public EnvioTicketsThread (Inscripcion.TicketDeAcceso[] tickets){
        this.tickets = tickets;
    }

    @Override
    public void run(){
        System.out.println("[HILO TICKETS] Enviando tickets...");

        for (Inscripcion.TicketDeAcceso ticket : tickets){
            ticket.enviarTicket();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
