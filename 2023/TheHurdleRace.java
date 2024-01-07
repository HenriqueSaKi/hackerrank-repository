import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TheHurdleRace {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> height = IntStream.range(0, n)
            .mapToObj(i -> sc.nextInt())
            .collect(Collectors.toList());
        System.out.println(String.valueOf(hurdleRace(k, height)));
        sc.close();

    }

    private static int hurdleRace(int k, List<Integer> height) {

        int tallest = 0;
        for(int i = 0; i < height.size(); i++) {
            tallest = height.get(i) > tallest ? height.get(i) : tallest;
        }
        
        return tallest > k ? tallest - k : 0;

    }
    
}
