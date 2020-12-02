package Minden.polligeri;

public class FizzBuzz {
    public static void main(String[] args) {
        // Írj egy programot, ami 1-től 100-ig kiíratja a számokat.
// De a 3 többszörösei esetén a "Fizz" szót írja ki a szám helyett
// és az 5 többszöröseinél pedig a "Buzz" szót írja ki a szám helyett.
// Ha a szám a 3-nak és 5-nek is többszöröse,
// akkor a "FizzBuzz" szót írja ki a szám helyett
        for (int i=1; i <101; i++){
            System.out.print(i + " ");
            if(i%3==0)
                System.out.print("Fizz ");
            else if(i%5==0)
                System.out.print("Buzz ");
            else if(i%3==0 && i%5==0)
                System.out.print("FizzBuzz ");

        }

    }
}
