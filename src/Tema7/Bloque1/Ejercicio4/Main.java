package Tema7.Bloque1.Ejercicio4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        Persona miguelito = new Persona("Miguelito", 2);

        Files.newOutputStream(Path.of("usuario.dat"));

        byte[] objectBytes = miguelito.toString().getBytes();

        Path byteFilePath = Path.of("usuario.dat");

        Files.newOutputStream(byteFilePath).write(objectBytes);

    }

}
