package Minden.polligeri;

public class EveryElement {
    public static void main(String[] args) {

        int [] numbers = new int[] {3,4,5,6,7};
        int osszeg = 0;
        for (int i =0; i < numbers.length; i++) {
            osszeg = osszeg + numbers[i];

        }System.out.print(osszeg);
    }
}

