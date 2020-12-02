package Minden.polligeri;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // Az első szám a lányok száma, akik jönnek a buliba
        // A második szám a fiúk száma
        //
        // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
        // Írja ki, hogy: !
        //
        // Ha több, mint 20 ember eljön, de a lányok - fiúk arány nem egyenlő
        // Írja ki, hogy:
        //
        // Ha kevesebb, mint 20 ember jön el
        // Írja ki, hogy:
        //
        // Ha egy lány sem jön el, függetlenül az emberek számától
        // Írja ki, hogy:

        Scanner scanner = new Scanner(System.in);
        int girls = scanner.nextInt();
        int boys = scanner.nextInt();

        if (girls+boys>20 && girls == boys)
            System.out.println("Ez a buli kitűnő!");
        else if (girls+boys>20 && girls != boys)
            System.out.println("Ez a buli egész jó!");
        else if(girls+boys<20)
            System.out.println("Átlagos buli...");
        else if (girls == 0)
            System.out.println("Virsli party");
    }
}