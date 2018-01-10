package book.classes_and_objects.glava1;

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
//        double d = 3.4;
//        System.out.println(Math.floor(d));  округление в меньшую сторону
//        System.out.println(Math.round(d));  округление
//        System.out.println(Math.ceil(d));     округление в большую сторону

    }
}
