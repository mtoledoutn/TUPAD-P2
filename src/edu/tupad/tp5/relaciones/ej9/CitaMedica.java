package edu.tupad.tp5.relaciones.ej9;

import java.time.LocalDate;
import java.time.LocalTime;

public class CitaMedica {
    private final LocalDate fecha;
    private final LocalTime hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(LocalDate fecha, LocalTime hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
}
