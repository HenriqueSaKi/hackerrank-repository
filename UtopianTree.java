import java.util.Scanner;

public class UtopianTree {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int height = utopianTree(sc.nextInt());
            System.out.println(String.valueOf(height));
        }
        sc.close();

    }

    private static int utopianTree(int n) {
    // Write your code here
        if (n == 0) {
            return 1;
        }
        else {
            int sum = 1;
            for(int i = 0; i < n; i++) {
                sum = i % 2 == 0 ? sum * 2 : sum + 1;
            }
            return sum;
        }

    }
    
}
