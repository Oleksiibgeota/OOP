package book.classes_and_objects.glava2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrCycle {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (i + 1) * (j + 1);

            }
        }
        System.out.println("-------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Do you want rotate array ( yes or no)");
        Scanner scan1 = new Scanner(System.in);
        String yesOrNo = scan1.findInLine("yes");
        System.out.println("scan1="+yesOrNo);
        if (yesOrNo.equals("yes")) {

            Scanner scan2 = new Scanner(System.in);
            int a = 2;
            int temp;
            int rotate=1;

            while(rotate !=0) {
                for (int i = 0; i < rotate; i++) {
                    temp = arr[0][0];
                    arr[0][0] = arr[0][1];
                    arr[0][1] = arr[0][2];
                    arr[0][2] = arr[1][2];
                    arr[1][2] = arr[2][2];
                    arr[2][2] = arr[2][1];
                    arr[2][1] = arr[2][0];
                    arr[2][0] = arr[1][0];
                    arr[1][0] = temp;
                    System.out.println("-------");
                    for (int t = 0; t < arr.length; t++) {
                        System.out.println(Arrays.toString(arr[t]));
                    }
//                    System.out.println("scanner="+noOrYes);

                }
                System.out.println("Can you rotate else? enter number:");

//                отсутствует контроль на ввод букв
                rotate = scan2.nextInt();

            }

        }
        else{
            return;
        }
    }
}
