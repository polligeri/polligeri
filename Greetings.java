package Minden.polligeri;

public class Greetings {
    // - Hozz létre egy class-t `Greet` névvel és benne a main függvényt.

// - Hozz létre egy `name` nevű String változót, aminek az értéke legyen `Green Fox`.

// - Készíts egy függvényt `greet` névvel mely üdvözli a bemeneti paraméterét kiírással(void & print)
//   pl.: `Üdv, kedves Green Fox`

// - greet(`name`)

    public static void main(String[] args) {
        System.out.println(Greet("Üdv, "));

    }
    public static String Greet(String greet) {
        return greet + " Green Fox";
    }
}


