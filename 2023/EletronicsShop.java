import java.util.Scanner;

public class EletronicsShop {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] keyboards = preencheArray(sc, n);
        int[] drives = preencheArray(sc, m);
        
        int moneySpent = getMoneySpent(keyboards, drives, b);

        System.out.println(String.valueOf(moneySpent));
        sc.close();

    }

    private static int[] preencheArray(Scanner sc, int len) {
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        
        int totalSpent = -1;
        for(int i = 0; i < keyboards.length; i++) {
            for(int j = 0; j < drives.length; j++) {
                int subtotal = keyboards[i] + drives[j];
                if(subtotal <= b) {
                    if(subtotal > totalSpent) {
                        totalSpent = subtotal;
                    }
                }
            }
        }
        
        return totalSpent;
    }
    
}
