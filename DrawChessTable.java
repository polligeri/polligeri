package Minden.polligeri;

public class DrawChessTable {
    public static void main(String[] args) {

        // Írj egy programot, ami egy ilyen "sakktáblát" rajzol ki:
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {

                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("%");
                    }
                }
                System.out.println();
            }

        }
    }
}
