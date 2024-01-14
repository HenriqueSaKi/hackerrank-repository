import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleAndOrange {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); //starting point of Sam's house location.
        int t = sc.nextInt(); //ending location of Sam's house location.
        int a = sc.nextInt(); //location of the Apple tree.
        int b = sc.nextInt(); //location of the Orange tree.

        int m = sc.nextInt(); //apple distances
        int n = sc.nextInt(); //orange distances

        List<Integer> apples = getListOfDistances(sc, m);
        List<Integer> oranges = getListOfDistances(sc, n);

        countApplesAndOranges(s, t, a, b, apples, oranges);

        sc.close();

    }

    private static void countApplesAndOranges(int s, int t, int a, int b, 
        List<Integer> apples, List<Integer> oranges) {
        
        countFruits(a, s, t, apples);
        countFruits(b, s, t, oranges);
    
    }

    private static void countFruits(int treePosition, int s, int t, List<Integer> fruits) {
        int count = 0;
        for(Integer fruit: fruits) {
            int fruitPosition = treePosition + fruit;
            if(fruitPosition >= s && fruitPosition <= t) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static List<Integer> getListOfDistances(Scanner sc, int m) {
        List<Integer> aux = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            aux.add(sc.nextInt());
        }
        return aux;
    }
    
}
