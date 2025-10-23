package edu.tupad.tp7;

abstract class Figura {
    private final String nombre;

    protected Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();
}

class Circulo extends Figura {
    private final double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo("circulo 1", 1.0),
            new Circulo("circulo 2", 3.0),
            new Rectangulo("rectangulo 1", 2.0, 4.0),
            new Rectangulo("rectangulo 2", 5.0, 6.0)
        };

        for (Figura figura : figuras) {
            System.out.printf(
                "%s -> área = %.2f%n",
                figura.getNombre(),
                figura.calcularArea()
            );
        }
    }
}
