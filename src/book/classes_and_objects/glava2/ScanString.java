package book.classes_and_objects.glava2;

import java.util.Scanner;

public class ScanString {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("print three masseges");
        String mas1 = scanner1.next();
        String mas2 = scanner1.next();
        String mas3 = scanner1.next();
        int mas1Length = mas1.length();
        int mas2Length = mas2.length();
        int mas3Length = mas3.length();
        System.out.println("------------------");
        System.out.println(mas1Length);
        System.out.println(mas2Length);
        System.out.println(mas3Length);
        if (mas1Length>mas2Length){
            if(mas1Length>mas3Length){
                System.out.println("String = " + mas1 + "  have more letters");
            }
            else {
                System.out.println("String = " + mas3 + "  have more letters");
            }
        }
        else{
            if (mas2Length>mas3Length){
                System.out.println("String = " + mas2 + "  have more letters");
            }
            else{
                System.out.println("String = " + mas3 + "  have more letters");
            }
        }
        System.out.println("Good luck");
    }
    //  this programs cant equals two similar objects
}
