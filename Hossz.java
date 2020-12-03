package Minden.polligeri;

public class Hossz{
    public static void main(String[] args) {
        // - Készíts egy `firstArrayOfNumbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[1, 2, 3]`
        // - Készíts egy `secondArrayOfNumbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[4, 5]`
        // - Írasd ki a konzolra, hogy "A secondArrayOfNumbers hosszabb", ha
        //   `secondArrayOfNumbers` több elemet tartalmaz, mint az `firstArrayOfNumbers`
        int [] firstArrayOfNumbers = new int[] {1,2,3,4,3,9};

        int [] secondArrayOfNumbers =new int[] {5,6,7,8};

        if ( firstArrayOfNumbers.length > secondArrayOfNumbers.length ) {
            System.out.println("A firstArrayOfNumbers hosszabb." );}
        else {System.out.println("A secondArrayOfNumbers hosszabb.");}




    }
}