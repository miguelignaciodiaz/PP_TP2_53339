public class Sala {
    //Atributos
    private int id;
    private String nombre;

    //Constructor
    public Sala (int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    //Metodos
    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }
}
