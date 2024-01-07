import java.util.Scanner;

public class SuperReducedString {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(superReducedString(s));

        sc.close();

    }

    public static String superReducedString(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            String x = String.valueOf(s.charAt(i));
            String y = String.valueOf(s.charAt(i + 1));
            if(x.equals(y)) {
                s = s.replace(x+y, "");
                return superReducedString(s);
            }
        }
        return s.length() > 0 ? s : "Empty String";
    }

}