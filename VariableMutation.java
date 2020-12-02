package Minden.polligeri;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // Növeld meg az "a" változó értékét 10-zel

        System.out.println(a+10);

        int b = 100;
        // Csökkentsd a "b" változó értékeét 7-tel

        System.out.println(b-7);

        int c = 44;
        // A c értéke legyen dupla akkora

        System.out.println(c*2);

        int d = 125;
        // Oszd el a d-t 5-tel

        System.out.println(d/5);

        int e = 8;
        // Emeld köbre az e változó értékét

        System.out.println(e*e*e);

        int f1 = 123;
        int f2 = 345;
        // Logikai (boolean) értékként írasd ki hogy f1 nagyobb-e f2-nél
        boolean egal = f1>f2;
        System.out.println(egal);


        int g1 = 350;
        int g2 = 200;
        // Mondja meg a program, hogy g2 duplája nagyobb-e g1-nél (boolean)
        boolean Egal = (g2*2)>g1;
        System.out.println(Egal);

        int h = 135798745;
        // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
        // Írasd is ki logikai (boolean) értékként

        int i1 = 10;
        int i2 = 3;
        // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél (boolean)

        int j = 1521;
        // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)
    }
}