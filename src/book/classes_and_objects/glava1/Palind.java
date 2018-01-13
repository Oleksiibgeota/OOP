package book.classes_and_objects.glava1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Palind {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + 3 + i;

        }
        int a = (int) Array.get(arr,3);

        System.out.println(a);
        System.out.println(Arrays.toString(arr));
        System.out.println(Array.getInt(arr,3));
    }
}
