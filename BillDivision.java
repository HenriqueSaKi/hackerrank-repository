import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillDivision {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int b = sc.nextInt();
        bonAppetit(arr, k, b);        
        sc.close();

    }

    private static void bonAppetit(List<Integer> bill, int k, int b) {
    
        int sum = 0;
        for(int i = 0; i < bill.size(); i++) {
            if(i != k) {
                sum = sum + bill.get(i);
            }
        }
        int div = sum / 2;
        int diff = b - div;
        
        if (diff > 0) {
            System.out.println(String.valueOf(diff));
        }
        else {
            System.out.println("Bon Appetit");
        }

    }
    
}
