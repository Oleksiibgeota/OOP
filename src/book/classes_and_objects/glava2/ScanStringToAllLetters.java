package book.classes_and_objects.glava2;

import java.util.Scanner;

public class ScanStringToAllLetters {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("print");
        String a = scan1.nextLine();
        String b = scan1.nextLine();

        char[] aa = a.toCharArray();

        System.out.println("--------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(aa[1]);
    }
}
