package enums.notaria;

import java.time.LocalDate;
import java.time.Period;

/**
 * Información de una persona que será usada en una notaría.
 *
 * Ejercicio para el uso de ENUM.
 */
public class Persona {
    private String nombre;
    private String estadoCivil;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String estadoCivil, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad(){
        LocalDate fechaHoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaHoy);
        return periodo.getYears();
    }
}
