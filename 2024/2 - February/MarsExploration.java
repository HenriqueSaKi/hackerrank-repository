import java.util.Scanner;

public class MarsExploration {
    
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(marsExploration(s));

        sc.close();

    }

    private static int marsExploration(String s) {
        int count = 0;

        String[] splitted = s.split("");
        for(int i = 0; i < splitted.length; i++) {
            if(i % 3 == 0 || i % 3 == 2) {
                if(!"S".equals(splitted[i])) {
                    count++;
                }
            }
            if(i % 3 == 1) {
                if(!"O".equals(splitted[i])) {
                    count++;
                }
            }
        }

        return count;

    }
    
}
