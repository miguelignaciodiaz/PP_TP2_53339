package modelo;

import actividades.Actividad;

import java.io.Serializable;
import java.time.LocalDate;

public class Inscripcion implements Serializable {

    //Atributos
    private Actividad actividad;
    private LocalDate fecha;
    private String estado;
    private Estudiante estudiante;

    //Estados
    public static final String PENDIENTE = "PENDIENTE";
    public static final String CONFIRMADA = "CONFIRMADA";

    //Constructor
    public Inscripcion (Estudiante estudiante, Actividad actividad){
        this.estudiante = estudiante;
        this.estado = PENDIENTE;
        this.fecha = LocalDate.now();
        this.actividad = actividad;
    }

    //Metodos
    public Estudiante getEstudiante(){
        return estudiante;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public void confirmar(){
        this.estado = CONFIRMADA;
    }

    public String getEstado(){
        return estado;
    }

    public TicketDeAcceso generarTicket(){

        if (estado.equals(CONFIRMADA)){
            TicketDeAcceso ticket= new TicketDeAcceso();
            return ticket;
        }
        return null;
    }

        public class TicketDeAcceso{

            private static int contador= 0;

            //Atributos
            private String idTicket;
            private LocalDate fechaEmision;

            //Constructor
            public TicketDeAcceso(){
                contador++;
                idTicket = String.format("T%03d", contador);
                this.fechaEmision = LocalDate.now();
            }

            //Metodos
            public void enviarTicket(){
                System.out.println("Enviando ticket " + idTicket);
            }
        }
}
