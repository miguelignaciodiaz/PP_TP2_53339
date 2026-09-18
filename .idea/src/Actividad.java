import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Actividad {
    //Atributos
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO = 2;
    private List<Inscripcion> inscripciones = new ArrayList<>();

    //Constructor
    public Actividad (int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
    }

    //Metodos
    public void inscribir (Estudiante estudiante){
        Inscripcion inscripcion = new Inscripcion (estudiante, this);
        this.inscripciones.add(inscripcion);
    }

    public List<Inscripcion> getInscripciones(){
        return Collections.unmodifiableList(inscripciones);
    }

    public String getTitulo(){
        return titulo;
    }

    public void mostrarInscripciones(){
        for (Inscripcion inscripcion : inscripciones){
            System.out.println("Estudiante: " + inscripcion.getEstudiante().getNombre()
                    + " - Legajo: " + inscripcion.getEstudiante().getLegajo()
                    + " - Fecha: " + inscripcion.getFecha()
                    + " - Estado: " + inscripcion.getEstado());
        }
    }

    public abstract double calcularCostoMateriales();

    public abstract String getTipo();

    public final void mostrarIdentificacion() {
        System.out.println("- " + getTipo() + ": " + titulo
                + " (Id=" + id + ")"
                + " - Cupo máximo: " + cupoMaximo);
    }
}
