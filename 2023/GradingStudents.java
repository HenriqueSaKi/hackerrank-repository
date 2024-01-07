import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> grades = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            grades.add(sc.nextInt());
        }
        grades = gradingStudents(grades);
        for(int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
        sc.close();

    }

    private static List<Integer> gradingStudents(List<Integer> grades) {
        
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38) {
                arr.add(grades.get(i));
            }
            else {
                int diff = grades.get(i) % 5;
                if (diff > 2) {
                    arr.add(grades.get(i) + (5 - diff));
                }
                else {
                    arr.add(grades.get(i));
                }
            }
        }
        return arr;
        
    }
    
}
