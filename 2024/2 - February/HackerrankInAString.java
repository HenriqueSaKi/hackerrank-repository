import java.util.Scanner;

public class HackerrankInAString {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < q; i++) {
            String s = sc.nextLine();
            System.out.println(hackerrankInString(s));
        }

        sc.close();

    }

    private static String hackerrankInString(String s) {
        String expected = "hackerrank";
        String[] splittedHackerrank = expected.split("");
        String[] splitted = s.split("");

        String result = "";
        int position = 0;
        for(int i = 0; i < splitted.length; i++) {
            if(splittedHackerrank[position].equals(splitted[i])) {
                result = result + splitted[i];
                position++;
                if(result.equals(expected)) break;
            }
        }

        
        return expected.equals(result) ? "YES" : "NO";

    }

}
