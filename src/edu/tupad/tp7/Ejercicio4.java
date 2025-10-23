package edu.tupad.tp7;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    private final String nombre;

    protected Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract String hacerSonido();
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "guau";
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "miau";
    }
}

class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "mu";
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Chicho"));
        animales.add(new Gato("Lalo"));
        animales.add(new Vaca("Lola"));

        for (Animal animal : animales) {
            System.out.println((animal.hacerSonido()));
        }
    }
}
