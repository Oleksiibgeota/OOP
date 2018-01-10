package point;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {
    public static void main(String[] args) {
        java.lang.String name = "Borodai Oleksii";
//        System.out.println(name);
        if (
                name.startsWith("Borodai") && name.endsWith("Oleksii")
                ) {
            System.out.println("You are welcome");
        } else {
            System.out.println("Please rewrite");
        }

        java.lang.String s = "abc".concat("def");
        System.out.println(s);
        java.lang.String ss = s.replace('c', 'A');
        System.out.println(ss);
        java.lang.String[] sss = ss.split("A");
        System.out.println(Arrays.toString(sss));
        System.out.println(sss[0]);
        System.out.println(sss[1]);
        System.out.println(ss.substring(3));
        System.out.println(ss.substring(1, 3));

        java.lang.String trim = "   asfasf dsgsdg   dsgsdg sdsdg    sdgsgd     ";
        System.out.println(trim);
        System.out.println(trim.trim());
        Point p = new Point(3, 4, 5);
        System.out.println(java.lang.String.valueOf(p));
        Pattern pp = Pattern.compile("[^\\s]");
        Matcher m = pp.matcher(" sfasfasfa sfa sfa sfas fas f");
        System.out.println(m.matches());
    }

}
