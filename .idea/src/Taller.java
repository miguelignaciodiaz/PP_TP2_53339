public class Taller extends Actividad {

    //Atributos
    private boolean requiereNotebook;

    //Constructor
    public Taller (int id, String titulo, int cupoMaximo, boolean requiereNotebook){
        super(id, titulo, cupoMaximo);
        this.requiereNotebook = requiereNotebook;
    }

    //Metodos
    @Override
    public double calcularCostoMateriales(){
        if (requiereNotebook){
            return 5000.0;
        } else {
            return 2000.0;
        }
    }

    @Override
    public String getTipo(){
        return "Taller";
    }
}
