package modelo;

import actividades.Actividad;
import actividades.Charla;
import actividades.Curso;
import actividades.Taller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EventoUniversitario implements Serializable {

    // Atributos
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;

    private Sala sala;
    private List<Actividad> actividades = new ArrayList<>();

    // Constructor principal
    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito){
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
    }

    // Constructor de copia
    public EventoUniversitario(EventoUniversitario otro){
        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        cantidadEventos++;
    }

    // Métodos
    public double calcularCostoEstimado(){
        if (gratuito){
            return 0.0;
        } else {
            double costoActividades = 0.0;
            for (Actividad actividad : actividades){
                costoActividades = costoActividades + actividad.calcularCostoMateriales();
            }
            return (costoBase + costoActividades) * 1.21;
        }
    }

    public void asignarSala(Sala sala){
        this.sala = sala;
    }

    public void crearActividad(int id, String titulo, int cupo, String tipoActividad) {
        Scanner scanner = new Scanner(System.in);
            switch (tipoActividad) {
                case "Charla":
                    System.out.print("Ingrese el nombre del disertante para la charla " + titulo + " :  ");
                    String disertante = scanner.nextLine();

                    Actividad charla = new Charla(id, titulo, cupo, disertante);
                    this.actividades.add(charla);
                    break;
                case "Taller":
                    System.out.print("¿Requiere notebook? (true/false): ");
                    boolean requiereNotebook = Boolean.parseBoolean(scanner.nextLine());

                    Actividad taller = new Taller(id, titulo, cupo, requiereNotebook);
                    this.actividades.add(taller);
                    break;
                case "Curso":
                    System.out.println("Ingrese el nivel");
                    int nivel = Integer.parseInt(scanner.nextLine());

                    Actividad curso = new Curso(id, titulo, cupo, nivel);
                    this.actividades.add(curso);
                    break;
                default:
                    System.out.println("Error: Tipo de actividad no reconocido");
            }
    }

    public List<Actividad> getActividades(){
        return Collections.unmodifiableList(actividades);
    }

    public <T extends Actividad> List<T> filtrarActividadesPorTipo(Class<T> tipo) {

        List<T> resultado = new ArrayList<>();

        for (Actividad actividad : actividades) {

            if (tipo.isInstance(actividad)) {
                resultado.add(tipo.cast(actividad));
            }
        }
        return resultado;
    }

    public double calcularCostoMateriales(List<? extends Actividad> actividades){

        double costoTotal = 0.0;

        for (Actividad actividad : actividades){
            costoTotal = costoTotal + actividad.calcularCostoMateriales();
        }

        return costoTotal;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id +
                " | Título: " + titulo +
                " | Costo: $" + calcularCostoEstimado() +
                " | Gratuito: " + (gratuito ? "Sí" : "No"));
                if (sala == null){
                    System.out.println("Sala: Sin sala");
                } else {
                    System.out.println("Sala: " + sala.getNombre());
                }
                for (Actividad actividad : actividades) {
                    System.out.println(" | Actividad: " + actividad.getTitulo());
                        for (Inscripcion inscripcion : actividad.getInscripciones()){
                            System.out.println(" | Estudiante: " + inscripcion.getEstudiante().getNombre());
                        }
                }
        }

    public static int getCantidadEventos(){
        return cantidadEventos;
    }

    public String getTitulo(){
        return titulo;
    }
}