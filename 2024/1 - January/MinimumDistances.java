import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumDistances {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int entries = sc.nextInt();

        List<Integer> a = IntStream.range(0, entries)
            .mapToObj(i -> sc.nextInt())
            .collect(Collectors.toList());
        
        int distance = -1;
        for(int i = 0; i < a.size(); i++) {
            for(int j = i + 1; j < a.size(); j++) {
                int x = a.get(i);
                int y = a.get(j);
                if(x == y) {
                    distance = distance == -1 || distance > j - i ? 
                        j - i : distance;
                }
            }
        }
        System.out.println(distance);

        sc.close();

    }

}
