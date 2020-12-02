package Minden.polligeri;

public class Cuboid {
    public static void main(String[] args) {
        // Írj egy programot, ami egy téglatest 3 oldalát tartalmazza változókban (doubles)
        // A program írja ki a felületét és térfogatát a testnek ilyen formátumban:
        //
        // Felület: 600
        // Térfogat: 1000

        double a = 5;
        double b = 50;
        double c = 4;

        double terfogat = a*b*c;
        System.out.println(terfogat);

        double felulet = 2*(a*b+a*c+b*c);
        System.out.println(felulet);


    }
}