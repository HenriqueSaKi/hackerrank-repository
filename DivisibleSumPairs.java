import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibleSumPairs {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> ar = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }

        int result = divisibleSumPairs(n, k, ar);
        System.out.println(String.valueOf(result));
        sc.close();
        
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int soma = ar.get(i) + ar.get(j);
                if (soma % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    
}
