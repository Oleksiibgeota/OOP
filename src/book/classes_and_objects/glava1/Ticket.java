package book.classes_and_objects.glava1;

import java.util.Scanner;

public class Ticket {
    public Ticket(){

    }

    public Ticket(int aa, int bb, int cc, int dd, int ff, int gg)

    {

        System.out.println("enter please one number");
        Scanner scanner1 = new Scanner(System.in);
        int inputNumber = (scanner1.nextInt());
        if ((inputNumber / 100000) > 0) {


            aa = inputNumber / 100000;
            bb = inputNumber / 10000 - aa * 10;
            cc = inputNumber / 1000 - aa * 100 - bb * 10;
            dd = inputNumber / 100 - aa * 1000 - bb * 100 - cc * 10;
            ff = inputNumber / 10 - aa * 10000 - bb * 1000 - cc * 100 - dd * 10;
            gg = inputNumber / 1 - aa * 100000 - bb * 10000 - cc * 1000 - dd * 100 - ff * 10;


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
    }

}
