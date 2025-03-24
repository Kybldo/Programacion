package Tema7.Bloque1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Ejercicio5 {

    public static void main(String[] args) throws IOException {

        Path byteFilePath = Path.of("usuario.dat");

        byte[] objectBytes = Files.newInputStream(byteFilePath).readAllBytes();

        System.out.println(Arrays.toString(objectBytes));

    }

}
