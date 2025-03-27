package Tema7.Bloque1;

import Tema7.Bloque1.Ejercicio4.Persona;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio5 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Persona persona;

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("usuario.dat")))) {

            persona = (Persona) ois.readObject();

        }

        System.out.println(persona);

    }

}