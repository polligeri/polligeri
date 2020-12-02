package Minden.polligeri;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // és kiírja a nagyobbat
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}