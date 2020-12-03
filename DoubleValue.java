package Minden.polligeri;
import java.util.Arrays;
public class DoubleValue {
    public static void main(String[] args) {
        // - Készíts egy `numList` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
        // - Duplázd meg minden elem értéket a tömbben

        int [] numList = new int[] {3,4,5,6,7};
        for (int i = 0; i < numList.length ; i++) {
            numList[i] *= 2;
            System.out.println(numList[i]);
        }
        System.out.println(Arrays.toString(numList));
    }
}

