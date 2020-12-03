package Minden.polligeri;

public class Colors {
    public static void main(String[] args) {


        String [][] szinek = new String[3][];


        String[] zold = new String[] {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] piros = new String[] {"orange red", "red", "tomato"};
        String[] pink = new String[] {"orchid", "violet", "pink", "hot pink"};
        szinek [0] = zold;
        szinek  [1] = piros;
        szinek[2] = pink;

        for (String s: szinek[1]){
            System.out.println(s);
        }
    }
}

