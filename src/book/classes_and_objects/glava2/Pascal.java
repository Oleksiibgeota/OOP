package book.classes_and_objects.glava2;

import java.util.Arrays;

public class Pascal {
    public static void main(String[] args) {
        int b = 5;
        int [][] a = new int[b][];
        for( int i =1; i <a.length ; i++){
            a[i]= new int[i];

            System.out.println(Arrays.toString(a[i]));
        }
    }
}
