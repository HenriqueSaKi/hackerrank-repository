import java.util.Scanner;

public class ChocolateFeast {
    
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int C = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(chocolateFeast(N, C, M));

        }

        sc.close();

    }

    private static int chocolateFeast(int n, int c, int m) {
        int quantityIGotWithMoney = (int) n/c;
        int quantityIGotWithPackage = recursiveGotWithPackage(quantityIGotWithMoney, 0, m);
        return quantityIGotWithMoney + quantityIGotWithPackage;

    }

    private static int recursiveGotWithPackage(int packages, int quantityIGotWithPackage, int m) {
        if(packages >= m) {
            quantityIGotWithPackage = quantityIGotWithPackage + (int) packages/m;
            int wonMore = (int) packages/m;
            int remainingPackages = packages % m;
            return recursiveGotWithPackage(remainingPackages + wonMore, quantityIGotWithPackage, m);
        }
        return quantityIGotWithPackage;        
    }

}
