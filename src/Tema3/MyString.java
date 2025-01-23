package Tema3;

import java.util.Objects;

public class MyString {

    public static void main(String[] args) {

        String test1 = "En ocasiones veo a Fernando, Fernando es fuerte, Fernando hace el lion killer, Fernando va a morir a los 27";

        String test2 = "Fernando";

        String test3 = "34555332211";

        System.out.println(invertToUpper(test1));

        System.out.println(countVowels(test1));

        System.out.println(longestWord(test1));

        System.out.println(xAppearsOnY(test1, test2));

        System.out.println(wordCount(test1));

        System.out.println(formatPhoneNumber(test3));

        histogram(test1);

    }

    // a) Invertir cadena y poner en mayúsculas
    public static String invertToUpper(String string){

        String newString = "";

        for (int i = string.length() -1; i >= 0; i--){

            newString = newString + string.charAt(i);

        }

        return newString.toUpperCase();

    }

    // b) Contar el número de vocales
    public static int countVowels(String string){

        String newString = string.toLowerCase();

        int counter = 0;

        for (int i = 0; i < newString.length(); i++){

            if (newString.charAt(i) == 'a' || newString.charAt(i) == 'e' || newString.charAt(i) == 'i' || newString.charAt(i) == 'o' || newString.charAt(i) == 'u'
            || newString.charAt(i) == 'á' || newString.charAt(i) == 'é' || newString.charAt(i) == 'í' || newString.charAt(i) == 'ó' || newString.charAt(i) == 'ú'){

                counter++;

            }
        }

        return counter;

    }

    // c) Devuelve la palabra con mayor longitud de una cadena
    public static String longestWord(String string){

        String newString = "";

        String[] stringArray;

        stringArray = string.split(" ");

        int longitud = 0;

        for (int i = 0; i < stringArray.length; i++){

            if (stringArray[i].length() > longitud){

                longitud = stringArray[i].length();
                newString = stringArray[i];

            }
        }

        return newString;

    }

    // d) Dice cuantas veces la segunda cadena está incluida en la primera
    //substring()
    public static int xAppearsOnY(String string1, String string2){

        int counter = 0;

        String[] stringArray;

        stringArray = string1.split(" ");

        for (int i = 0; i < stringArray.length; i++){

            if (Objects.equals(stringArray[i], string2)) counter++;

        }

        return counter;

    }

    // e) Devuelve el número de palabras de una cadena
    public static int wordCount(String string){

        int wordCount;

        String[] stringArray;

        stringArray = string.split(" ");
        wordCount = stringArray.length;

        return wordCount;

    }

    // f) Recibe y formatea un teléfono
    public static String formatPhoneNumber(String string){

        String newString;

        String chunk1 = "(+";
        String chunk2 = ")-";
        String chunk3 = "-";

        String numbers1 = string.substring(0,2);
        String numbers2 = string.substring(2,5);
        String numbers3 = string.substring(5,11);

        newString = chunk1 + numbers1 + chunk2 + numbers2 + chunk3 + numbers3;
        
        return newString;

    }

    // g) Devuelve el histograma de vocales
    public static void histogram(String string){

        String newString = string.toLowerCase();

        String frequency = "*";

        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;

        for (int i = 0; i < newString.length(); i++){

            if (newString.charAt(i) == 'a' || newString.charAt(i) == 'á'){

                aCount++;

            }

            if (newString.charAt(i) == 'e' || newString.charAt(i) == 'é'){

                eCount++;

            }

            if (newString.charAt(i) == 'i' || newString.charAt(i) == 'í'){

                iCount++;

            }

            if (newString.charAt(i) == 'o' || newString.charAt(i) == 'ó'){

                oCount++;

            }

            if (newString.charAt(i) == 'u' || newString.charAt(i) == 'ú'){

                uCount++;

            }

        }

        System.out.println(string);
        System.out.println("a " + aCount + " " + frequency.repeat(aCount));
        System.out.println("e " + eCount + " " + frequency.repeat(eCount));
        System.out.println("i " + iCount + " " + frequency.repeat(iCount));
        System.out.println("o " + oCount + " " + frequency.repeat(oCount));
        System.out.println("u " + uCount + " " + frequency.repeat(uCount));

    }
}