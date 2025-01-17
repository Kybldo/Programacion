package Tema3;

public class CaesarCipher {

    public static void main(String[] args) {

        String string = "AL POBRE FERNANDO, EN SUS 25 AÑOS DE EDAD, LE QUEDAN SI NO 10 TELEDIARIOS, DADO QUE SE VA A MORIR DEL ESTRÉS";

        System.out.println(encrypt(string));

        String stringEncrypted = encrypt(string);

        System.out.println(decrypt(stringEncrypted));

    }

    public static String encrypt(String string){

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < string.length(); i++){

            if (string.charAt(i) == 'A' || string.charAt(i) == 'Á'){

                newString.append("B");

            } else if (string.charAt(i) == 'B') {

                newString.append("C");

            } else if (string.charAt(i) == 'C') {

                newString.append("D");

            } else if (string.charAt(i) == 'D') {

                newString.append("E");

            } else if (string.charAt(i) == 'E' || string.charAt(i) == 'É') {

                newString.append("F");

            } else if (string.charAt(i) == 'F') {

                newString.append("G");

            } else if (string.charAt(i) == 'G') {

                newString.append("H");

            } else if (string.charAt(i) == 'H') {

                newString.append("I");

            } else if (string.charAt(i) == 'I' || string.charAt(i) == 'Í') {

                newString.append("J");

            } else if (string.charAt(i) == 'J') {

                newString.append("K");

            } else if (string.charAt(i) == 'K') {

                newString.append("L");

            } else if (string.charAt(i) == 'L') {

                newString.append("M");

            } else if (string.charAt(i) == 'M') {

                newString.append("N");

            } else if (string.charAt(i) == 'N') {

                newString.append("Ñ");

            } else if (string.charAt(i) == 'Ñ') {

                newString.append("O");

            } else if (string.charAt(i) == 'O' || string.charAt(i) == 'Ó') {

                newString.append("P");

            } else if (string.charAt(i) == 'P') {

                newString.append("Q");

            } else if (string.charAt(i) == 'Q') {

                newString.append("R");

            } else if (string.charAt(i) == 'R') {

                newString.append("S");

            } else if (string.charAt(i) == 'S') {

                newString.append("T");

            } else if (string.charAt(i) == 'T') {

                newString.append("U");

            } else if (string.charAt(i) == 'U' || string.charAt(i) == 'Ú') {

                newString.append("V");

            } else if (string.charAt(i) == 'V') {

                newString.append("W");

            } else if (string.charAt(i) == 'W') {

                newString.append("X");

            } else if (string.charAt(i) == 'X') {

                newString.append("Y");

            } else if (string.charAt(i) == 'Y') {

                newString.append("Z");

            } else if (string.charAt(i) == 'Z') {

                newString.append("A");

            } else if (string.charAt(i) == '0') {

                newString.append("1");

            } else if (string.charAt(i) == '1') {

                newString.append("2");

            } else if (string.charAt(i) == '2') {

                newString.append("3");

            } else if (string.charAt(i) == '3') {

                newString.append("4");

            } else if (string.charAt(i) == '4') {

                newString.append("5");

            } else if (string.charAt(i) == '5') {

                newString.append("6");

            } else if (string.charAt(i) == '6') {

                newString.append("7");

            } else if (string.charAt(i) == '7') {

                newString.append("8");

            } else if (string.charAt(i) == '8') {

                newString.append("9");

            } else if (string.charAt(i) == '9') {

                newString.append("0");

            }

        }

        return newString.toString();

    }

    public static String decrypt(String string){

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < string.length(); i++){

            if (string.charAt(i) == 'B'){

                newString.append("A");

            } else if (string.charAt(i) == 'C') {

                newString.append("B");

            } else if (string.charAt(i) == 'D') {

                newString.append("C");

            } else if (string.charAt(i) == 'E') {

                newString.append("D");

            } else if (string.charAt(i) == 'F') {

                newString.append("E");

            } else if (string.charAt(i) == 'G') {

                newString.append("F");

            } else if (string.charAt(i) == 'H') {

                newString.append("G");

            } else if (string.charAt(i) == 'I') {

                newString.append("H");

            } else if (string.charAt(i) == 'J') {

                newString.append("I");

            } else if (string.charAt(i) == 'K') {

                newString.append("J");

            } else if (string.charAt(i) == 'L') {

                newString.append("K");

            } else if (string.charAt(i) == 'M') {

                newString.append("L");

            } else if (string.charAt(i) == 'N') {

                newString.append("M");

            } else if (string.charAt(i) == 'Ñ') {

                newString.append("N");

            } else if (string.charAt(i) == 'O') {

                newString.append("Ñ");

            } else if (string.charAt(i) == 'P') {

                newString.append("O");

            } else if (string.charAt(i) == 'Q') {

                newString.append("P");

            } else if (string.charAt(i) == 'R') {

                newString.append("Q");

            } else if (string.charAt(i) == 'S') {

                newString.append("R");

            } else if (string.charAt(i) == 'T') {

                newString.append("S");

            } else if (string.charAt(i) == 'U') {

                newString.append("T");

            } else if (string.charAt(i) == 'V') {

                newString.append("U");

            } else if (string.charAt(i) == 'W') {

                newString.append("V");

            } else if (string.charAt(i) == 'X') {

                newString.append("W");

            } else if (string.charAt(i) == 'Y') {

                newString.append("X");

            } else if (string.charAt(i) == 'Z') {

                newString.append("Y");

            } else if (string.charAt(i) == 'A') {

                newString.append("Z");

            } else if (string.charAt(i) == '1') {

                newString.append("0");

            } else if (string.charAt(i) == '2') {

                newString.append("1");

            } else if (string.charAt(i) == '3') {

                newString.append("2");

            } else if (string.charAt(i) == '4') {

                newString.append("3");

            } else if (string.charAt(i) == '5') {

                newString.append("4");

            } else if (string.charAt(i) == '6') {

                newString.append("5");

            } else if (string.charAt(i) == '7') {

                newString.append("6");

            } else if (string.charAt(i) == '8') {

                newString.append("7");

            } else if (string.charAt(i) == '9') {

                newString.append("8");

            } else if (string.charAt(i) == '0') {

                newString.append("9");

            }

        }

        return newString.toString();

    }

}
