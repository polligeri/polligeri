package Minden.polligeri;
import java.util.Scanner;
public class OneTwoALot {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // Ha a szám kisebb vagy egyenlő 0-val, írja ki, hogy: "Nem elég"
        // Ha a szám egyenlő 1-gyel, írja ki, hogy: "Egy"
        // Ha a szám egyenlő 2-vel, írja ki, hogy: "Kettő"
        // Ha a szám nagyobb, mint 2, írja ki, hogy: "Sok"
            System.out.println("Kérem a számot!");
            Scanner scanner = new Scanner(System.in);
            double szam = scanner.nextLong();
            if (szam<= 0)
                System.out.println("Nem elég");
            if (szam ==1)
                System.out.println("Egy");
            if (szam ==2)
                System.out.println("Kettő");
            if (szam>2)
                System.out.println("Sok");
        }
    }