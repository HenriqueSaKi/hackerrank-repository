import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(String.valueOf(beautifulDays(i, j, k)));
        sc.close();

    }

    private static int beautifulDays(int i, int j, int k) {
        
        int count = 0;
        for(int x = i; x <= j; x++) {
            int aux = reverseNumber(x);
            if((x-aux) % k == 0) {
                count++;
            }
        }
        return count;
        
    }
    
    private static int reverseNumber(int x) {
        String[] aux = String.valueOf(x).split("");
        String reverse = "";
        for(int i = aux.length - 1; i >= 0; i--) {
            reverse = reverse + aux[i];
        }
        return Integer.valueOf(reverse);
    }
    
}
