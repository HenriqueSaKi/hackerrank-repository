import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakingTheRecords {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> scores = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            scores.add(sc.nextInt());
        }
        List<Integer> arr = breakingRecords(scores);
        System.out.println(String.format("%d %d", arr.get(0), arr.get(1)));
        sc.close();

    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        
        int highestNumber = scores.get(0);
        int lowestNumber = scores.get(0);
        int countHighest = 0;
        int countLowest = 0;
        
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > highestNumber) {
                highestNumber = scores.get(i);
                countHighest++;
            }
            if (scores.get(i) < lowestNumber) {
                lowestNumber = scores.get(i);
                countLowest++;
            }
        }
        result.add(countHighest);
        result.add(countLowest);
        
        return result;

    }
    
}
