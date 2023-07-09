import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceEquation {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }

        List<Integer> y = permutationEquation(p);
        for(int i = 0; i < y.size(); i++) {
            System.out.println(String.valueOf(y.get(i)));
        }
        sc.close();

    }
    
    private static List<Integer> permutationEquation(List<Integer> p) {
        
        List<Integer> x = new ArrayList<>();
        for(int i = 1; i <= p.size(); i++) {
            x.add(p.indexOf(i) + 1);
        }
        
        List<Integer> y = new ArrayList<>();
        for(int i = 1; i <= x.size(); i++) {
            y.add(x.get(p.indexOf(i)));
        }
        
        return y;

    }

}
