package book.classes_and_objects.glava1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonachy {
    public static void main(String[] args) {


        int[] arr = new int[100];
        for(int j=0; j<arr.length; j++){
            arr[j] = j;
        }



        System.out.println(Arrays.toString(arr));
//        f0 = f1 = 1, f (n) = f (n–1) + f (n–2)
    }
}
