package Minden.polligeri;

import java.util.Scanner;

public class Factorio {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int number = data.nextInt();
        System.out.println(factorio(number));
    }

    static int factorio(int number) {
        int factorio = 1;
        for (int i = 1; i <= number; i++) {
            factorio *= i;
        }
        return factorio;
    }
}