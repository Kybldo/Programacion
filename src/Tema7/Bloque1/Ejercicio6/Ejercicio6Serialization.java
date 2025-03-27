package Tema7.Bloque1.Ejercicio6;

import Tema7.Bloque1.Ejercicio4.Persona;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio6Serialization {

    public static void main(String[] args) throws IOException {

        Persona persona1 = new Persona("Tobías", 7);
        Persona persona2 = new Persona("Marta", 25);
        Persona persona3 = new Persona("Fernando", 25);

        Persona[] personas = new Persona[3];

        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("Ejercicio6.dat")))) {

            oos.writeObject(personas);
            System.out.println("Copiado.");

        }

    }

}
