package book.classes_and_objects.glava1;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Input your mane:");
        String output = scan1.next();
        System.out.println("Hello " + output);

    }
}
