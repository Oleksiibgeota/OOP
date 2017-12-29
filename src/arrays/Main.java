package arrays;

import geometry.Rectangle;
import geometry.Square;
import geometry.Triangular;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for(int i=0; i < arr1.length; i++){
            arr1[i] = i;
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[20];
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));

        for(int i = arr1.length-1; i>=0; i--){
                arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }

//    public static void main(String[] args) {
//        int[][] arr1 = new int[10][10];
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                arr1[i][j]= i*j;
//            }
//        }
//        for(int i = 0; i < arr1.length; i++){
//            System.out.println(Arrays.toString(arr1[i]));
//        }
//    }

//    public static void main(String[] args) {
//        Square[] squares = new Square[20];
//        for (int i = 0; i < squares.length; i++) {
//            if (i % 2 == 0) {
//                squares[i] = new Square(i + 10);
//
//            } else if (i % 3 == 0) {
//                squares[i] = new Triangular(i + 10);
//            } else {
//                squares[i] = new Rectangle(i + 10, 2 * i);
//            }
//        }
//        System.out.println(Arrays.toString(squares));
//
//        double allArea = 0;
//        for (int i = 0; i < squares.length; i++) {
//            allArea = allArea + squares[i].area();
//        }
//        System.out.println(allArea);
//
//    }
//    public static void main(String[] args) {
//        Square[] squares = new Square[20];
//        for(int i=0;i<squares.length;i++){
//            squares[i] = new Square(i+10);
//        }
//        System.out.println(Arrays.toString(squares));
//
//        double allArea = 0;
//        for(int i=0; i<squares.length; i++){
//            allArea = allArea + squares[i].area();
//        }
//        System.out.println(allArea);
//    }
}
