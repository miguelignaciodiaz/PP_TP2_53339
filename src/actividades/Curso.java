package actividades;

import certificacion.Certificable;
import modelo.Estudiante;

public class Curso extends Actividad implements Certificable {

    //Atributos
    private int nivel;

    //Constructor
    public Curso(int id, String titulo, int cupoMaximo, int nivel) {
        super(id, titulo, cupoMaximo);
        this.nivel = nivel;
    }

    //Metodos
    public double calcularCostoMateriales() {
        return 0;
    }

    public String getTipo() {
        return "Curso";
    }

    @Override
    public String generarCertificado(Estudiante estudiante) {
        return "Certificado de asistencia - Alumno: "
                + estudiante.getNombre()
                + " - Curso: "
                + getTipo()
                + " - Nivel: "
                + nivel;
    }
}
