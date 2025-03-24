package Tema7.Bloque1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Introduce tu nombre:");

        String name = read.nextLine();

        System.out.println(" ");
        System.out.println("Introduce tu edad:");

        String age = read.nextLine();

        File usuarioFile = new File("usuario.txt");

        Files.write(Paths.get(usuarioFile.toURI()), ("Nombre: " + name + "\n").getBytes());
        Files.write(Paths.get(usuarioFile.toURI()), ("Edad: " + age).getBytes(), StandardOpenOption.APPEND);

    }

}
