package book.classes_and_objects.first;

import java.util.Scanner;

public class NStrok {
    public static void main(String[] args) {
        int numberOfStrings;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much line you need ");
        numberOfStrings = scanner.nextInt();
        String line = scanner.nextLine();
        int count = 1;
        while (count <= numberOfStrings && !line.toLowerCase().equals("stop")) {
            System.out.println("Enter text:");
            line = scanner.nextLine();
            System.out.println(count + " - " + line);
            count++;
        }
    }
}
