package edu.tupad.tp7;

import java.util.ArrayList;
import java.util.List;

abstract class Empleado {
    protected final String nombre;

    protected Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSueldo();
}

class EmpleadoPlanta extends Empleado {
    private final double sueldoBase;
    private final double antiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBase, double antiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + antiguedad;
    }
}

class EmpleadoTemporal extends Empleado {
    private final double horasTrabajadas;
    private final double valorHora;

    public EmpleadoTemporal(String nombre, double horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Martin", 100_000, 15_000));
        empleados.add(new EmpleadoTemporal("Juan", 120, 1_200));
        empleados.add(new EmpleadoPlanta("Lucas", 110_000, 20_000));
        empleados.add(new EmpleadoTemporal("Roberto", 90, 1_500));

        List<Empleado> planta = new ArrayList<>();
        List<Empleado> temporales = new ArrayList<>();

        for (Empleado empleado : empleados) {
            double sueldo = empleado.calcularSueldo();
            System.out.printf("%s cobra %.2f%n", empleado.getNombre(), sueldo);

            if (empleado instanceof EmpleadoPlanta) {
                planta.add(empleado);
            } else if (empleado instanceof EmpleadoTemporal) {
                temporales.add(empleado);
            }
        }
    }
}
