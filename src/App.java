import actividades.Actividad;
import actividades.Charla;
import actividades.Curso;
import actividades.Taller;
import certificacion.Certificable;
import hilos.EnvioTicketsThread;
import modelo.EventoUniversitario;
import modelo.Estudiante;
import modelo.Inscripcion;
import modelo.Sala;
import excepciones.CupoExcedidoException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main (String[] args) throws CupoExcedidoException {
        /*
        System.out.println("------TP1------");

        System.out.println("\n--- EJERCICIO 1 ---");
        //a. Se crean uno o más eventos universitarios.
        EventoUniversitario evento1 = new EventoUniversitario("E001", "Charla sobre Inteligencia Artificial", 1500.0, false);
        EventoUniversitario evento2 = new EventoUniversitario("E002", "Taller de programacion", 0.0, true);

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

        System.out.println("\n--- EJERCICIO 2 ---");

        //a. Se construye una lista de estudiantes.
        List<Estudiante> estudiantes = new ArrayList<>();
        Estudiante estudiante1 = new Estudiante("52659", "Juan");
        Estudiante estudiante2 = new Estudiante("52257", "Francisco");
        Estudiante estudiante3 = new Estudiante("52994", "Ignacio");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        //b. Se construyen eventos.
        EventoUniversitario evento3 = new EventoUniversitario("E006", "Taller de quimica", 2000.0, false);
        EventoUniversitario evento4 = new EventoUniversitario("E012", "Charla sobre la ciberseguridad", 0.0, true);

        //c. Se asigna una sala cada evento.
        Sala sala1 = new Sala(1, "Laboratorio 1");
        Sala sala2 = new Sala(2, "Laboratorio 2");

        evento3.asignarSala(sala1);
        evento4.asignarSala(sala2);

        // d. Se crean actividades propias de cada evento.
        evento3.crearActividad(1, "Introduccion a Java", 30, "Taller");

        evento4.crearActividad(2, "Programacion Orientada a Objetos", 20, "Taller");
        evento4.crearActividad(3, "Introduccion a Python", 5, "Taller");
        evento4.crearActividad(4, "Inteligencia Artificial", 50, "Charla");

        //e. Se inscriben estudiantes en cada actividad.
        try {
            evento3.getActividades().get(0).inscribir(estudiante1);
            evento4.getActividades().get(1).inscribir(estudiante2);
            evento4.getActividades().get(0).inscribir(estudiante3);
        } catch (CupoExcedidoException e) {
            System.out.println("Error al realizar las inscripciones iniciales: " + e.getMessage());
        }

        //f. Se muestra el resumen de datos por cada evento creado.
        evento3.mostrarDatos();
        evento4.mostrarDatos();

        //g. Se muestra el total de eventos creados.
        System.out.println("Cantidad de eventos creados: " + EventoUniversitario.getCantidadEventos());

        System.out.println("\n--- EJERCICIO 3 ---");

        //a. Se registran estudiantes.
        Estudiante estudiante4 = new Estudiante("52623", "Pedro");
        Estudiante estudiante5 = new Estudiante("52337", "Alberto");
        Estudiante estudiante6 = new Estudiante("53394", "Maria");

        estudiantes.add(estudiante4);
        estudiantes.add(estudiante5);
        estudiantes.add(estudiante6);

        //b. Se construyen eventos.
        EventoUniversitario evento5 = new EventoUniversitario("E020", "Taller de matematica", 0.0, true);
        EventoUniversitario evento6 = new EventoUniversitario("E021", "Taller de termodinamica", 1000.0, false);

        //c. Se asigna una sala a cada evento.
        Sala sala3 = new Sala(3, "Aula 210");
        Sala sala4 = new Sala(4, "Aula 310");

        evento5.asignarSala(sala3);
        evento6.asignarSala(sala4);

        //d. Se crean actividades para cada evento del tipo Charla y/o Taller.
        evento5.crearActividad(100, "Introduccion a la Termodinamica", 20, "Charla");
        evento5.crearActividad(150, "Introduccion a Mecanica de fluidos", 1, "Charla");
        evento6.crearActividad(200, "Algebra lineal", 10, "Taller");

        //e. Se inscriben estudiantes en cada actividad.
        try {
            evento5.getActividades().get(0).inscribir(estudiante4);
            evento5.getActividades().get(1).inscribir(estudiante5);
            evento6.getActividades().get(0).inscribir(estudiante6);
        } catch (CupoExcedidoException e) {
            System.out.println("Error al realizar las inscripciones: " + e.getMessage());
        }

        //f. Se muestra el resumen de datos de cada evento y se recorren sus actividades
        // mostrando su identificación de forma polimórfica.
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
        */

        System.out.println("------TP2------");

        System.out.println("\n--- EJERCICIO 1 ---");

        Estudiante estudianteTP2 = new Estudiante("54000", "Pedro");

        EventoUniversitario eventoTP2 = new EventoUniversitario("E030", "Taller de matematica", 0.0, true);

        Sala salaTP2 = new Sala(30, "Aula 210");

        eventoTP2.asignarSala(salaTP2);

        eventoTP2.crearActividad(300, "Introduccion a la Termodinamica", 1, "Charla");

        Actividad actividadTP2 = eventoTP2.getActividades().get(0);

        try {
            actividadTP2.inscribir(estudianteTP2); //INSCRIPCION

            FileOutputStream fos = new FileOutputStream("evento.dat"); //GUARDAR
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(eventoTP2);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("evento.dat"); //LEER
            ObjectInputStream ois = new ObjectInputStream(fis);
            EventoUniversitario evento = (EventoUniversitario) ois.readObject();
            evento.mostrarDatos();
            ois.close();
            fis.close();
        } catch (CupoExcedidoException e) {
            System.out.println("No hay cupos disponibles");
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo");
        } catch (IOException ex) {
            System.out.println("Se produjo un error de E/S");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encontró la clase necesaria para deserializar");
        } finally {
            System.out.println("El proceso ha finalizado");
        }
        try {
            actividadTP2.inscribir(estudianteTP2);
        } catch (CupoExcedidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- EJERCICIO 2 ---");

        //a. Se crean estudiantes.

        Estudiante estudiante10 = new Estudiante("48880", "Fernando");
        Estudiante estudiante11 = new Estudiante("46270", "Lucia");
        Estudiante estudiante12 = new Estudiante("48002", "Claudio");

        //b.Se crean eventos.

        EventoUniversitario evento10 = new EventoUniversitario("E100", "Taller de quimica general", 0.0, true);
        EventoUniversitario evento11 = new EventoUniversitario("E101", "Taller de programacion en Java", 10000.0, false);
        EventoUniversitario evento12 = new EventoUniversitario("E102", "Curso de base de datos", 15000.0, false);

        //c.Se asigna una sala a cada evento creado.

        Sala sala10 = new Sala(10,"Aula 15");
        Sala sala11 = new Sala(11,"Aula 25");
        Sala sala12 = new Sala(12,"Aula 35");

        evento10.asignarSala(sala10);
        evento11.asignarSala(sala11);
        evento12.asignarSala(sala12);

        //d.Se construyen actividades para cada evento creado, incorporando un nuevo tipo de
        //actividad posible Curso.

        evento10.crearActividad(500, "Computacion en la nube", 40 ,"Charla" );
        evento11.crearActividad(600, "Analisis de datos nivel avanzado", 10 ,"Curso" );
        evento12.crearActividad(700, "Electronica basica", 20 ,"Taller" );

        //e. Se inscriben alumnos en las actividades de cada evento.

        Actividad actividad10 = evento10.getActividades().get(0);
        Actividad actividad11 = evento11.getActividades().get(0);
        Actividad actividad12 = evento12.getActividades().get(0);

        actividad10.inscribir(estudiante10);
        actividad11.inscribir(estudiante11);
        actividad12.inscribir(estudiante12);

        //f. Se emiten certificados de asistencia para los alumnos que han participado
        // de talleres y/o cursos. Las charlas no son certificables.

        List <EventoUniversitario> eventos = new ArrayList<>();

        eventos.add(evento10);
        eventos.add(evento11);
        eventos.add(evento12);

        for (EventoUniversitario evento : eventos){
            for (Actividad actividad : evento.getActividades()){
                if (actividad instanceof Certificable){

                    Certificable certificado = (Certificable) actividad;

                    for (Inscripcion inscripcion : actividad.getInscripciones()){

                        Estudiante estudiante = inscripcion.getEstudiante();

                        //g. Se muestran los certificados emitidos.
                        System.out.println(certificado.generarCertificado(estudiante));
                    }
                }
            }
        }

        //h. Se muestran los datos de los eventos creados.

        for (EventoUniversitario evento : eventos){
            evento.mostrarDatos();
        }

        System.out.println("\n--- EJERCICIO 3 ---");

        //a. Se creen estudiantes.

        Estudiante estudianteEJ3a = new Estudiante("32563" , "Ignacio");
        Estudiante estudianteEJ3b = new Estudiante("99663" , "Lautaro");
        Estudiante estudianteEJ3c = new Estudiante("32965" , "Leonel");

        //b. Se creen eventos con su sala y sus actividades.

        EventoUniversitario eventoEJ3a = new EventoUniversitario("E200", "Curso de Geometria Analitica ", 2000.0, false);
        EventoUniversitario eventoEJ3b = new EventoUniversitario("E201", "Charla de Informatica ", 0.0, true);
        EventoUniversitario eventoEJ3c = new EventoUniversitario("E202", "Taller de soldadura", 5000.0, false);

        Sala salaEJ3a = new Sala(30, "Sala 30");
        Sala salaEJ3b = new Sala(31, "Sala 31");
        Sala salaEJ3c = new Sala(32, "Sala 32");

        eventoEJ3a.asignarSala(salaEJ3a);
        eventoEJ3b.asignarSala(salaEJ3b);
        eventoEJ3c.asignarSala(salaEJ3c);

        eventoEJ3a.crearActividad(1, "Geometria Analitica", 30, "Curso");
        eventoEJ3a.crearActividad(2, "Soldadura", 30, "Taller");
        eventoEJ3a.crearActividad(3, "Introduccion a la Informatica", 20, "Charla");

        eventoEJ3b.crearActividad(4, "Ciberseguridad", 40, "Charla");
        eventoEJ3b.crearActividad(5, "Java Inicial", 30, "Curso");
        eventoEJ3b.crearActividad(6, "Programacion Practica", 25, "Taller");

        eventoEJ3c.crearActividad(7, "Electricidad Basica", 30, "Curso");
        eventoEJ3c.crearActividad(8, "Soldadura", 20, "Taller");
        eventoEJ3c.crearActividad(9, "Seguridad Industrial", 40, "Charla");

        // c. Se inscriban los estudiantes en distintas actividades del evento.

        try {
            eventoEJ3a.getActividades().get(0).inscribir(estudianteEJ3a);
            eventoEJ3a.getActividades().get(1).inscribir(estudianteEJ3b);
            eventoEJ3a.getActividades().get(2).inscribir(estudianteEJ3c);
            eventoEJ3b.getActividades().get(0).inscribir(estudianteEJ3b);

        } catch (CupoExcedidoException e) {
            System.out.println("No hay cupos disponibles");
        }

        //d. Se filtre la lista de actividades de cada evento por tipo concreto:
        // Charla, Taller y Curso.

        List<Charla> charlasEJ3a = eventoEJ3a.filtrarActividadesPorTipo(Charla.class);
        List<Taller> talleresEJ3a = eventoEJ3a.filtrarActividadesPorTipo(Taller.class);
        List<Curso> cursosEJ3a = eventoEJ3a.filtrarActividadesPorTipo(Curso.class);

        List<Charla> charlasEJ3b = eventoEJ3b.filtrarActividadesPorTipo(Charla.class);
        List<Taller> talleresEJ3b = eventoEJ3b.filtrarActividadesPorTipo(Taller.class);
        List<Curso> cursosEJ3b = eventoEJ3b.filtrarActividadesPorTipo(Curso.class);

        List<Charla> charlasEJ3c = eventoEJ3c.filtrarActividadesPorTipo(Charla.class);
        List<Taller> talleresEJ3c = eventoEJ3c.filtrarActividadesPorTipo(Taller.class);
        List<Curso> cursosEJ3c = eventoEJ3c.filtrarActividadesPorTipo(Curso.class);

        //e. Se muestre por consola la cantidad de actividades de cada tipo creadas
        // para cada evento.

        System.out.println("Evento E200");
        System.out.println("Charlas: " + charlasEJ3a.size());
        System.out.println("Talleres: " + talleresEJ3a.size());
        System.out.println("Cursos: " + cursosEJ3a.size());

        System.out.println("Evento E201");
        System.out.println("Charlas: " + charlasEJ3b.size());
        System.out.println("Talleres: " + talleresEJ3b.size());
        System.out.println("Cursos: " + cursosEJ3b.size());

        System.out.println("Evento E202");
        System.out.println("Charlas: " + charlasEJ3c.size());
        System.out.println("Talleres: " + talleresEJ3c.size());
        System.out.println("Cursos: " + cursosEJ3c.size());

        //f. Se calcule y muestre el costo de materiales correspondiente
        // a cada tipo de actividad en un evento.

        double costoCharlasEJ3a = eventoEJ3a.calcularCostoMateriales(charlasEJ3a);
        double costoTalleresEJ3a = eventoEJ3a.calcularCostoMateriales(talleresEJ3a);
        double costoCursosEJ3a = eventoEJ3a.calcularCostoMateriales(cursosEJ3a);

        System.out.println("\n--- Costos Evento E200 ---");

        System.out.println("Costo materiales Charlas: $" + costoCharlasEJ3a);
        System.out.println("Costo materiales Talleres: $" + costoTalleresEJ3a);
        System.out.println("Costo materiales Cursos: $" + costoCursosEJ3a);

        double costoCharlasEJ3b = eventoEJ3b.calcularCostoMateriales(charlasEJ3b);
        double costoTalleresEJ3b = eventoEJ3b.calcularCostoMateriales(talleresEJ3b);
        double costoCursosEJ3b = eventoEJ3b.calcularCostoMateriales(cursosEJ3b);

        System.out.println("\n--- Costos Evento E201 ---");

        System.out.println("Costo materiales Charlas: $" + costoCharlasEJ3b);
        System.out.println("Costo materiales Talleres: $" + costoTalleresEJ3b);
        System.out.println("Costo materiales Cursos: $" + costoCursosEJ3b);

        double costoCharlasEJ3c = eventoEJ3c.calcularCostoMateriales(charlasEJ3c);
        double costoTalleresEJ3c = eventoEJ3c.calcularCostoMateriales(talleresEJ3c);
        double costoCursosEJ3c = eventoEJ3c.calcularCostoMateriales(cursosEJ3c);

        System.out.println("\n--- Costos Evento E202 ---");

        System.out.println("Costo materiales Charlas: $" + costoCharlasEJ3c);
        System.out.println("Costo materiales Talleres: $" + costoTalleresEJ3c);
        System.out.println("Costo materiales Cursos: $" + costoCursosEJ3c);

        System.out.println("\n--- EJERCICIO 4 ---");

        //a. Se crean estudiantes.

        Estudiante estudianteEJ4a = new Estudiante("40001", "Martin");
        Estudiante estudianteEJ4b = new Estudiante("40002", "Sofia");
        Estudiante estudianteEJ4c = new Estudiante("40003", "Carlos");

        //b. Se crean eventos universitarios cada uno con su sala y sus actividades.

        // b. Se crean eventos.

        EventoUniversitario eventoEJ4a =  new EventoUniversitario("E300", "Jornada de Programacion", 5000.0, false);
        EventoUniversitario eventoEJ4b =  new EventoUniversitario("E301", "Seminario de Ciberseguridad", 0.0, true);

        Sala salaEJ4a = new Sala(40, "Aula 401");
        Sala salaEJ4b = new Sala(41, "Aula 402");

        eventoEJ4a.asignarSala(salaEJ4a);
        eventoEJ4b.asignarSala(salaEJ4b);

        eventoEJ4a.crearActividad(10, "Java Avanzado", 30, "Curso");
        eventoEJ4a.crearActividad(11, "Programacion Practica", 20, "Taller");

        eventoEJ4b.crearActividad(12, "Seguridad en Redes", 40, "Charla");
        eventoEJ4b.crearActividad(13, "Pentesting Basico", 15, "Taller");

        //c. Se inscribe a los estudiantes en distintas actividades de cada evento.

        Actividad actividadEJ4a1 = eventoEJ4a.getActividades().get(0);
        Actividad actividadEJ4a2 = eventoEJ4a.getActividades().get(1);

        Actividad actividadEJ4b1 = eventoEJ4b.getActividades().get(0);
        Actividad actividadEJ4b2 = eventoEJ4b.getActividades().get(1);

        Inscripcion inscripcionEJ4a1 = null;
        Inscripcion inscripcionEJ4a2 = null;
        Inscripcion inscripcionEJ4b1 = null;
        Inscripcion inscripcionEJ4b2 = null;

        try{
            inscripcionEJ4a1 = actividadEJ4a1.inscribir(estudianteEJ4a);
            inscripcionEJ4a2 = actividadEJ4a2.inscribir(estudianteEJ4b);

            inscripcionEJ4b1 = actividadEJ4b1.inscribir(estudianteEJ4b);
            inscripcionEJ4b2 = actividadEJ4b2.inscribir(estudianteEJ4c);
        } catch (CupoExcedidoException e){
            System.out.println("No hay cupos disponibles");
        }

        //d. Se confirman algunas de las inscripciones de estudiantes en
        // las actividades de cada evento.

        inscripcionEJ4a1.confirmar();
        inscripcionEJ4a2.confirmar();
        inscripcionEJ4b1.confirmar();

        //e. Se genera un ticket de acceso por cada inscripción confirmada.

        Inscripcion.TicketDeAcceso ticketEJ4a1 = inscripcionEJ4a1.generarTicket();
        Inscripcion.TicketDeAcceso ticketEJ4a2 = inscripcionEJ4a2.generarTicket();
        Inscripcion.TicketDeAcceso ticketEJ4b1 = inscripcionEJ4b1.generarTicket();

        //f. Se inicia el proceso concurrente para enviar los tickets.

        Inscripcion.TicketDeAcceso[] tickets = {
                ticketEJ4a1,
                ticketEJ4a2,
                ticketEJ4b1
        };
        EnvioTicketsThread hiloTickets = new EnvioTicketsThread(tickets);
        hiloTickets.start();

        //g. Mientras el hilo de envío de tickets se ejecuta, el hilo principal
        // debe continuar mostrando por consola los datos del evento,
        // sus actividades y los estudiantes inscriptos.

        System.out.println("\n--- INFORMACIÓN DESDE MAIN ---");
        System.out.println("[MAIN] Mostrando información de los eventos...");
        eventoEJ4a.mostrarDatos();
        eventoEJ4b.mostrarDatos();
    }
}
