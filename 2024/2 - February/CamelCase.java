import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(camelcase(s));
        sc.close();

    }

    private static int camelcase(String s) {
        String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
        "U", "V", "W", "X", "Y", "Z"};
        List<String> upperCaseLetters = Arrays.asList(arr);

        int count = 1;
        for(int i = 0; i < s.length(); i++) {
            if(upperCaseLetters.contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }
        return count;
        
    }
    
}
