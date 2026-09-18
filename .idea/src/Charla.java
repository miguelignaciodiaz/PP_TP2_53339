public class Charla extends Actividad {

    //Atributos
    private String disertante;

    //Constructor
    public Charla (int id, String titulo, int cupoMaximo, String disertante){
        super(id, titulo, cupoMaximo);
        this.disertante = disertante;
    }

    //Metodos
    @Override
    public double calcularCostoMateriales(){
        return 0.0;
    }

    @Override
    public String getTipo(){
        return "Charla";
    }
}
