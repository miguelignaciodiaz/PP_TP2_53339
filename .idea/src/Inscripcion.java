import java.time.LocalDate;

public class Inscripcion {
    //Atributos
    private Actividad actividad;
    private LocalDate fecha;
    private String estado;
    private Estudiante estudiante;

    //Constructor
    public Inscripcion (Estudiante estudiante, Actividad actividad){
        this.estudiante = estudiante;
        this.estado = "CONFIRMADA";
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

    public String getEstado(){
        return estado;
    }
}
