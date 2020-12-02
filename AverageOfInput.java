package Minden.polligeri;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Írj egy programot, ami 5 egész számot kér be egymás után,
        // majd kiírja a számok összegét és átlagát a következő formátumban:
        //
        // Összeg: 22, Átlag: 4.4
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();
        int userInput4 = scanner.nextInt();
        int userInput5 = scanner.nextInt();

        int osszeg = userInput1+userInput2+userInput3+userInput4+userInput5;
        int atlag = osszeg/5;
        System.out.println("Összeg: " + osszeg + ", Átlag: " + atlag);
    }
}