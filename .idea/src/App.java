import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main (String[] args){

    //EJERCICIO 1
        //a. Se crean uno o más eventos universitarios.
        EventoUniversitario evento1 = new EventoUniversitario("E001", "Charla sobre Inteligencia Artificial", 1500.0, false);
        EventoUniversitario evento2 = new EventoUniversitario("E002","Taller de programacion"  ,0.0, true);

        //b. Se crea una copia de cada evento creado utilizando el constructor de copia.
        EventoUniversitario copiaEvento1 = new EventoUniversitario(evento1);
        EventoUniversitario copiaEvento2 = new EventoUniversitario(evento2);

        //c. Se muestran los datos de los eventos creados y su copia
        System.out.println("EVENTOS ORIGINALES");
        evento1.mostrarDatos();
        evento2.mostrarDatos();

        System.out.println("EVENTOS COPIAS");
        copiaEvento1.mostrarDatos();
        copiaEvento2.mostrarDatos();

        //d. Se muestra el contador de eventos con la totalidad de eventos creados.
        System.out.println("Total de eventos creados: " + EventoUniversitario.getCantidadEventos());

    //EJERCICIO 2
        //a. Se construye una lista de estudiantes.
        List<Estudiante> estudiantes = new ArrayList<>();
        Estudiante estudiante1 = new Estudiante("52659","Juan");
        Estudiante estudiante2 = new Estudiante("52257","Francisco");
        Estudiante estudiante3 = new Estudiante("52994","Ignacio");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        //b. Se construyen eventos.
        EventoUniversitario evento3 = new EventoUniversitario("E006","Taller de quimica", 2000.0, false );
        EventoUniversitario evento4 = new EventoUniversitario("E012","Charla sobre la ciberseguridad", 0.0, true );

        //c. Se asigna una sala cada evento.
        Sala sala1 = new Sala(1, "Laboratorio 1");
        Sala sala2 = new Sala(2, "Laboratorio 2");

        evento3.asignarSala(sala1);
        evento4.asignarSala(sala2);

        // d. Se crean actividades propias de cada evento.
        evento3.crearActividad(1, "Introduccion a Java", 30, "Taller");

        evento4.crearActividad(2, "Programacion Orientada a Objetos", 20, "Taller");
        evento4.crearActividad(3, "Introduccion a Python", 5,"Taller" );
        evento4.crearActividad(4, "Inteligencia Artificial", 50,"Charla");

        //e. Se inscriben estudiantes en cada actividad.
        evento3.getActividades().get(0).inscribir(estudiante1);
        evento4.getActividades().get(1).inscribir(estudiante2);
        evento4.getActividades().get(0).inscribir(estudiante3);

        //f. Se muestra el resumen de datos por cada evento creado.
        evento3.mostrarDatos();
        evento4.mostrarDatos();

        //g. Se muestra el total de eventos creados.
        System.out.println("Cantidad de eventos creados: " + EventoUniversitario.getCantidadEventos());

    //EJERCICIO 3
        //a. Se registran estudiantes.
        Estudiante estudiante4 = new Estudiante("52623","Pedro");
        Estudiante estudiante5 = new Estudiante("52337","Alberto");
        Estudiante estudiante6 = new Estudiante("53394","Maria");

        estudiantes.add(estudiante4);
        estudiantes.add(estudiante5);
        estudiantes.add(estudiante6);

        //b. Se construyen eventos.
        EventoUniversitario evento5 = new EventoUniversitario("E020","Taller de matematica", 0.0, true );
        EventoUniversitario evento6 = new EventoUniversitario("E021","Taller de termodinamica", 1000.0, false );

        //c. Se asigna una sala a cada evento.
        Sala sala3 = new Sala(3, "Aula 210");
        Sala sala4 = new Sala(4, "Aula 310");

        evento5.asignarSala(sala3);
        evento6.asignarSala(sala4);

        //d. Se crean actividades para cada evento del tipo Charla y/o Taller.
        evento5.crearActividad(100, "Introduccion a la Termodinamica", 20, "Charla");
        evento5.crearActividad(150, "Introduccion a Mecanica de fluidos", 5, "Charla");
        evento6.crearActividad(200, "Algebra lineal", 10, "Taller");

        //e. Se inscriben estudiantes en cada actividad.
        evento5.getActividades().get(0).inscribir(estudiante4);
        evento5.getActividades().get(1).inscribir(estudiante5);
        evento6.getActividades().get(0).inscribir(estudiante6);

        //f. Se muestra el resumen de datos de cada evento y se recorren sus actividades mostrando su
        //identificación de forma polimórfica.
        evento5.mostrarDatos();
        evento6.mostrarDatos();

        for (Actividad actividad : evento5.getActividades()) {
            actividad.mostrarIdentificacion();
        }
        for (Actividad actividad : evento6.getActividades()) {
            actividad.mostrarIdentificacion();
        }

        //g. Se muestra el total de eventos creados.
        System.out.println("La cantidad de eventos creados: " + EventoUniversitario.getCantidadEventos());
    }
}
