package Tema7.Bloque1.Ejercicio6;

import Tema7.Bloque1.Ejercicio4.Persona;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio6Deserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Persona[] personasCopia;

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("Ejercicio6.dat")))) {

            personasCopia = (Persona[]) ois.readObject();

        }

        for (int i = 0; i < personasCopia.length; i++){

            System.out.println(personasCopia[i]);

        }

    }

}
