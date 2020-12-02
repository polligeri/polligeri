package Minden.polligeri;

public class SecondsInADays {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)

        int hátralévőÓra = 24-14;
        int hátralévőPerc = 60-34;
        int hátralévőMásodperc = 60-42;

        System.out.print( hátralévőÓra );
        System.out.print( ":" +hátralévőPerc);
        System.out.print( ":" +hátralévőMásodperc);
    }
}
