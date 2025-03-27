package Tema7.Bloque1.Ejercicio4;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        Persona miguelito = new Persona("Miguelito", 2);

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("usuario.dat")))) {

            oos.writeObject(miguelito);
            System.out.println("Copiado.");

        }

    }

}
