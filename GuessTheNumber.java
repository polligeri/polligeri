package Minden.polligeri;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {

        // Írj egy programot ami tárol egy számot és
// a felhasználónak kell kitalálnia azt.
// A felhasználó találgathat és
// minden standard input-ba beírt szám után
// a programnak ki kell írnia egyet ezek közül:
//
// A tárolt szám nagyobb
// A tárolt szám kisebb
// Eltaláltad a számot

        int numberWhatIsWant = 20;
        Scanner scanner = new Scanner(System.in);
        boolean isKnowNow = false;

        while (!isKnowNow) {
            System.out.println("Kérek egy számot:");
            int guessNumber = scanner.nextInt();

            if (guessNumber == numberWhatIsWant) {
                System.out.println("Eltaláltad a számot");
                isKnowNow = true;
            } else if (guessNumber < numberWhatIsWant) {
                System.out.println("A tárolt szám nagyobb");
            } else {
                System.out.println("A tárolt szám kisebb");
            }

        }
    }
}