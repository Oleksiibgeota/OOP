package book.classes_and_objects.glava2;

import java.util.Arrays;
import java.util.Scanner;

public class MatricsDeterminant {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println("print nine number for arrays");
        Scanner scan1 = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int a = scan1.nextInt();
                arr[i][j] = a;
            }
        }


        System.out.println("Do you want to report determinant ??  ( yes or no )");
        Scanner scan2 = new Scanner(System.in);
        String b = scan2.next();

        while (b.equals("yes")) {
            double c;

            System.out.println("-------");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }

            c = arr[0][0] * arr[1][1] * arr[2][2] + arr[1][0] * arr[2][1] * arr[0][2] - arr[0][2] * arr[1][1] * arr[2][0] - arr[0][1] * arr[1][0] * arr[2][2];
            System.out.println(c);
            b = "no";
        }
    }


}

