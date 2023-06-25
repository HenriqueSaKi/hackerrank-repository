import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesByMatch {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ar = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }
        System.out.println(String.valueOf(sockMerchant(n, ar)));
        sc.close();

    }

    private static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        List<Integer> aux = new ArrayList<>();
        int numberOfPairs = 0;
        for(int i = 0; i < n; i++) {
            if(aux == null) {
                aux.add(ar.get(i));
            }
            else {
                if(aux.contains(ar.get(i))) {
                    numberOfPairs++;
                    aux.remove(ar.get(i));
                }
                else {
                    aux.add(ar.get(i));
                }
            }
        }
        return numberOfPairs;

    }
    
}
