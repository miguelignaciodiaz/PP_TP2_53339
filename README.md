# TP2 - Paradigmas de Programación

## Datos del trabajo

* **Materia:** Paradigmas de Programación
* **Carrera:** Ingeniería en Sistemas de Información
* **Universidad:** Universidad Tecnológica Nacional - Facultad Regional Mendoza
* **Lenguaje:** Java 17
* **IDE:** IntelliJ IDEA

## Descripción

Este proyecto corresponde al Trabajo Práctico N.º 2 de la asignatura Paradigmas de Programación.

El trabajo integra conceptos de Programación Orientada a Objetos en Java, incluyendo manejo de excepciones, persistencia mediante serialización, interfaces, genéricos, wildcards y programación concurrente mediante hilos.

## Ejercicios implementados

### Ejercicio 1 - Excepciones y persistencia

Se implementó:

* Excepción chequeada `CupoExcedidoException`.
* Control de cupos al realizar inscripciones.
* Manejo de excepciones mediante `try-catch-finally`.
* Persistencia de objetos mediante serialización.
* Lectura de objetos serializados.
* Tratamiento de casos exitosos y casos de error.

### Ejercicio 2 - Interfaces

Se implementó:

* Interfaz `Certificable`.
* Certificados para talleres y cursos.
* Clases `Charla`, `Taller` y `Curso`.
* Inscripción de estudiantes a actividades.
* Asociación de eventos con salas y actividades.
* Visualización de los datos de los eventos.

### Ejercicio 3 - Genéricos y Wildcards

Se implementó:

* Filtrado de actividades utilizando genéricos.
* Método `filtrarActividadesPorTipo`.
* Método `calcularCostoMateriales` utilizando wildcards.
* Listas tipadas de `Charla`, `Taller` y `Curso`.
* Conteo de actividades por tipo.
* Cálculo del costo de materiales según el tipo de actividad.

### Ejercicio 4 - Clases internas y Threads

Se implementó:

* Clase interna `TicketDeAcceso` dentro de `Inscripcion`.
* Generación de tickets únicamente para inscripciones confirmadas.
* Clase `EnvioTicketsThread` para el envío de tickets.
* Ejecución concurrente mediante `Thread`.
* Continuidad de la ejecución del hilo principal mientras se envían los tickets.

## Estructura del proyecto

```text
src/
├── actividades/
│   ├── Actividad.java
│   ├── Charla.java
│   ├── Curso.java
│   └── Taller.java
│
├── certificacion/
│   └── Certificable.java
│
├── excepciones/
│   ├── CupoExcedidoException.java
│   └── Exception.java
│
├── hilos/
│   └── EnvioTicketsThread.java
│
├── modelo/
│   ├── Estudiante.java
│   ├── EventoUniversitario.java
│   ├── Inscripcion.java
│   └── Sala.java
│
└── App.java

capturas/
├── ejecucion_ej1_ej2.png
└── ejecucion_ej3_ej4.png
```

## Ejecución

El programa se ejecuta desde la clase principal:

```text
App.java
```

Al ejecutarlo se muestran por consola los resultados correspondientes a los cuatro ejercicios.

## Capturas de ejecución

Las capturas de la ejecución del programa se encuentran en la carpeta:

```text
capturas/
```

Estas muestran los resultados de los cuatro ejercicios, incluyendo el funcionamiento concurrente del hilo principal y del hilo encargado del envío de tickets.

## Tecnologías utilizadas

* Java 17
* IntelliJ IDEA
* Programación Orientada a Objetos
* Serialización de objetos
* Excepciones
* Interfaces
* Genéricos y Wildcards
* Threads
