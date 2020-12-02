package Minden.polligeri;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // majd kiírja, hogy "Páros", ha páros és
        // kiírja, hogy "Páratlan", ha páratlan.
        System.out.println("Kérem a számot!");
                Scanner bemenet = new Scanner(System.in);
                double szam = bemenet.nextLong();
                if (szam % 2 == 0 )
                    System.out.println("Ez a szám páros");
                if (szam % 2 > 0)
                    System.out.println("Ez a szám páratlan");
    }
}