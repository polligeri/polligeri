package Minden.polligeri;
import java.util.Scanner;
public class DrawDiagonal {
    public static void main(String[] args) {

        // Írj egy programot, ami egy számot kér a standard input-ból és egy
// ilyen négyzetet rajzol::
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// A négyzetnek annyi sora legyen,
// mint amennyi az inputból kiolvasott szám értéke

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy számot:");

        int inputNumber = scanner.nextInt(); //Szám bevitele

        for (int i = 1; i <= inputNumber; i++) {
            if (i == 1) {
                for (int k = 1; k <= inputNumber; k++) {
                    System.out.print("%"); //Felső sor kirajzolása
                }
                System.out.println();
            }
            else if (i > 1 && i < inputNumber) {

                for (int j = 1; j <= inputNumber; j++) {
                    if (j == 1) {
                        System.out.print("%"); //bal oldali sor kirajzolása
                    }
                    else if (j> 1 && j < inputNumber) {
                        if (j == i) {
                            System.out.print("%"); //Átló kirajzolása
                        }
                        else {System.out.print(" "); //Belső tér kitöltése
                        }}
                    else if (j == inputNumber) {
                        System.out.print("%"); // Jobb oldali sor kirajzolása
                    }}

                System.out.println();
            } else if (i == inputNumber) {
                for (int k = 1; k <= inputNumber; k++) {
                    System.out.print("%"); // Alsó sor kirajzolása
                }
            }
        }
    }
}
