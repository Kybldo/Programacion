package Tema7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjercicioB5 {

    public static void main(String[] args) throws IOException {

        File dictionary = new File("Diccionario");

        Path dictionaryPath = Paths.get("/users/ericm/desktop/documentos/diccionario.txt");

        if (dictionary.mkdir()) {

            System.out.println(" ");
            System.out.println("Se ha creado el directorio.");

        }

        File letterFile = new File("/Users/ericm/IdeaProjects/Programacion/Diccionario/A.txt");
        
        BufferedWriter output = new BufferedWriter(new FileWriter(letterFile));

        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(dictionaryPath)));

        for (char c = 'a'; c <= 'z'; c++){

            letterFile = new File("/Users/ericm/IdeaProjects/Programacion/Diccionario/" + c + ".txt");

            try {

                String character = String.valueOf(c);

                letterFile.createNewFile();

                while (reader.readLine() != null){

                    String line = reader.readLine();

                    if (line != null){

                        if (line.startsWith(character)){

                            output.write(line);
                            output.newLine();

                        }

                        output.flush();

                    }

                }

                if (c == 'n'){

                    letterFile = new File("/Users/ericm/IdeaProjects/Programacion/Diccionario/Ñ.txt");

                    letterFile.createNewFile();

                }

                System.out.println("Se ha rellenado el archivo " + character + ".");

            } catch (IOException e){

                e.printStackTrace();

            }

        }

    }

}