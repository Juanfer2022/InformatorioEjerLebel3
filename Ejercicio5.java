package com.info.infox.utiles;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio5 {
    public static void main(String[] args) {
       
        Map<String, Integer> alumnoMapeado= cargarLista().stream()
                .collect(Collectors.toMap(Alumno::getNombreyApellido, Alumno::getsuEdad));
        System.out.println(alumnoMapeado);

    }




    static class Alumno{

        private String nombre;
        private String apellido;
        private LocalDate fechaDeNacimiento;
        private int esteAnio= Year.now().getValue();

        public Alumno(String nombre, String apellido, LocalDate fecha) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaDeNacimiento = fecha;

        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public LocalDate getFechaDeNacimiento() {
            return fechaDeNacimiento;
        }

        public void setFecha(LocalDate fecha) {
            this.fechaDeNacimiento = fechaDeNacimiento;
        }

        @Override
        public String toString() {
            return "Alumno{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", fecha=" + fechaDeNacimiento +
                    '}';
        }
        public int getsuEdad(){
            return esteAnio - fechaDeNacimiento.getYear();
        }
        public String getNombreyApellido(){
            return Stream.of(apellido, nombre).collect(Collectors.joining(" "));
        }
    }

    public static List<Alumno> cargarLista() {

         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Alumno> alumno = List.of(
                new Alumno("Jose", "Inojosa",LocalDate.parse("02/12/1988", dtf)),
                new Alumno("Luis", "Pedrosa",LocalDate.parse("02/12/1987", dtf)),
                new Alumno("Pedro", "Codutti",LocalDate.parse("02/12/1986", dtf)),
                new Alumno("Carlos", "Perez",LocalDate.parse("02/12/1985", dtf)),
                new Alumno("Joselin", "Triatop",LocalDate.parse("02/12/1984", dtf))
        );

         return alumno;
    }
}
