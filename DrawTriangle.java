package Minden.polligeri;
import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {

        // Hozz létre egy egész szám típusú, lineCount nevű változót.
// Írj egy programot, ami egy számot kér a standard input-ból és
// elmenti azt a lineCount változóban.
// Rajzoljon egy ilyen háromszöget:
//
// *
// **
// ***
// ****
//
// A háromszögnek annyi sora legyen, mint amennyi a lineCount értéke.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int lineCount = scanner.nextInt();

        if (lineCount <= 0) {
            System.out.println("0-nál nagyobb számot kérek!");
        }

        for (int line = 1; line <= lineCount; line++) {

            for (int i = 1; i <= line; i++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
