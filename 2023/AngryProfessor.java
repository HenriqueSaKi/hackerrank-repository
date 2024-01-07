import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProfessor {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> a = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                a.add(sc.nextInt());
            }
            System.out.println(angryProfessor(k, a));
        }
        sc.close();

    }

    private static String angryProfessor(int k, List<Integer> a) {
        
        int attendees = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) <= 0) {
                attendees++;
            }
        }
        return attendees >= k ? "NO" : "YES";

    }
    
}
