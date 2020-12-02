package Minden.polligeri;

public class ConditionalVariableMutation {
    public static void main(String[] args) {
        /*double a = 24;
        int out = 0;
        // Ha a páros, növeld az out változó értékét 1-gyel


        System.out.println(out);




        int b = 13;
        String out2 = "";
        // Ha b 10 és 20 között van, akkor az out2 legyen "Édes!"
        // Ha b kevesebb, mint 10, out2 legyen "Kevés!"
        // Ha b több, mint 20, out2 legyen "Sok!"


        System.out.println(out2);



        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // Ha credits legalább 50,
        // és isBonus hamis, c legyen csökkentve 2-vel
        // Ha credits kisebb, mint 50,
        // és isBonus hamis, c legyen csökkentve 1-gyel
        // Ha isBonus igaz, c ne változzon


        System.out.println(c);




        int d = 8;
        int time = 120;
        String out3 = "";
        // Ha d osztható 4-gyel
        // és a time nem több, mint 200
        // out3 legyen "check"
        // Ha time nagyobb, mint 200
        // out3 legyen "Az idő lejárt!"
        // különben out3 legyen "Fuss, Forest, Fuss!"


        System.out.println(out3);*/

            int a = 3;
            // Növeld meg az "a" változó értékét 10-zel
            a += 10;

            System.out.println(a);

            int b = 100;
            // Csökkentsd a "b" változó értékeét 7-tel
            b -= 7;
            System.out.println(b);

            int c = 44;
            // A c értéke legyen dupla akkora
            c = 2 * c;
            System.out.println(c);

            int d = 125;
            // Oszd el a d-t 5-tel
            d /= 5;

            System.out.println(d);

            int e = 8;
            // Emeld köbre az e változó értékét
            e *= 8 * 8;

            System.out.println(e);

            int f1 = 123;
            int f2 = 345;
            // Logikai (boolean) értékként írasd ki hogy f1 nagyobb-e f2-nél
            System.out.println(f1 > f2);

            int g1 = 350;
            int g2 = 200;
            // Mondja meg a program, hogy g2 duplája nagyobb-e g1-nél (boolean)
            System.out.println(2 * g2 > g1);

            int h = 135798745;
            // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
            // Írasd is ki logikai (boolean) értékként
            System.out.println(h % 11 == 0);

            int i1 = 10;
            int i2 = 3;
            // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél (boolean)
            System.out.println((i1 > (i2 * i2)) && (i1 < i2 * i2 * i2));

            int j = 1521;
            // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)

            System.out.println((j % 3 == 0) || (j % 5 == 0));
        }
    }