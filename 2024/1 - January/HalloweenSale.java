import java.util.Scanner;

public class HalloweenSale {
    
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(); // initial cost
        int d = sc.nextInt(); // discount
        int m = sc.nextInt(); // minimum price
        int s = sc.nextInt(); // my budget

        System.out.println(howManyGames(p, d, m, s, 0));

        sc.close();

    }

    private static int howManyGames(int p, int d, int m, int s, int count) { 
        if(count > 0) {
            int gamePrice = p - d;
            if(s >= gamePrice && gamePrice >= m) {
                count++;
                s = s - gamePrice;
                return howManyGames(gamePrice, d, m, s, count);
            }
            else if(s >= gamePrice && gamePrice <= m && s >= m) {
                count++;
                s = s - m;
                return howManyGames(p, d, m, s, count);
            }
        }
        else {
            if(s >= p) {
                count++;
                s = s - p;
                return howManyGames(p, d, m, s, count);
            }
        }
        return count;
    }

}
