package book.classes_and_objects.first;

import java.util.Scanner;

public class NStrok {
    public static void main(String[] args) {
        int i;
        Scanner srtoka = new Scanner (System.in);
        System.out.println("How much line you need ");
        i = srtoka.nextInt();
        for(int j=1; j<=i; j++) {
            if (j < i) {
                System.out.println(".");
            }
            else
                System.out.printf("." + "number " + i);
        }
    }
}
