package book.classes_and_objects.glava1;

import java.util.Arrays;
import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        long n = 20;
        long a = 0, b = 1;
        System.out.print(a + " " + b);
        long fib, i = 1;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
//        выполненно гуглом
        }
        int[] arr = new int[21];
        arr[0] = 0;
        arr[1] = 1;
        int k = 0;
        int l = 1;
        int fib2;

        for (int j = 2; j < arr.length; j++) {
            fib2 = arr[k] + arr[l];
            arr[l + 1] = fib2;
            k++;
            l++;

        }
        System.out.println("");
        System.out.println(Arrays.toString(arr));

        int[] fibs = new int[8];
        fibs[0] = 0;
        fibs[1] = 1;
        for (int f = 2; f < fibs.length; f++) {
            fibs[f] = fibs[f - 1] + fibs[f - 2];
        }
        System.out.println(Arrays.toString(fibs));
//-----------------------------------------------

        System.out.println("enter please one number");
        Scanner scanner1 = new Scanner(System.in);
        int inputNumber = (scanner1.nextInt());
        if ((inputNumber / 100000) > 0) {


            int aa = inputNumber / 100000;
            int bb = inputNumber / 10000 - aa * 10;
            int cc = inputNumber / 1000 - aa * 100 - bb * 10;
            int dd = inputNumber / 100 - aa * 1000 - bb * 100 - cc * 10;
            int ff = inputNumber / 10 - aa * 10000 - bb * 1000 - cc * 100 - dd * 10;
            int gg = inputNumber / 1 - aa * 100000 - bb * 10000 - cc * 1000 - dd * 100 - ff * 10;


//            System.out.println(aa);
//            System.out.println(bb);
//            System.out.println(cc);
//            System.out.println(dd);
//            System.out.println(ff);
//            System.out.println(gg);

            if (aa + bb + cc == dd + ff + gg) {
                System.out.println("You have Happy ticket");
            } else {
                System.out.println("Try again");
            }

        } else {
            System.out.println("error");
        }
//        ------------------------------------------------

        System.out.println("enter please number");
        Scanner scanner2 = new Scanner(System.in);
        int number3 = scanner2.nextInt();
        if (number3 / 1000 == 0) {
            int schst;
            int counter=0;
//            this "for" is excess but without it next prog dont work
            for (int begunok = 0; begunok < 1; begunok++) {


                int a1 = number3 / 100;
                int a2 = number3 / 10 - a1 * 10;
                int a3 = number3 - a1 * 100 - a2 * 10;
                schst = a1 * a1 + a2 * a2 + a3 * a3;

                if (schst == 1) {

                    System.out.println("happy");
                    break;
                } else {
                    for (int krug = 0; krug < 20; krug++) {
                        int c1 = schst / 100;
                        int c2 = schst / 10 - c1 * 10;
                        int c3 = schst - c1 * 100 - c2 * 10;
                        schst = c1 * c1 + c2 * c2 + c3 * c3;
                        // не прикручен
                        counter++;
                        if (schst == 1){
                            break;
                        }
                    }
                    if (schst == 1) {

                        System.out.println("Oy-Oy you insert Happy number");

                        break;


                    } else {
                        System.out.println("Try again, for example 302 329 566");
                        break;
                    }

                }
            }
        }
    }
}


