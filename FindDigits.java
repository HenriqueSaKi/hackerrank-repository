import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i =0 ; i < t; i++) {
            int n = sc.nextInt();
            findDigits(n);
        }

        sc.close();
        
    }

    private static void findDigits(int n) {
        String[] digits = String.valueOf(n).split("");
        int numberOfDivisors = 0;
        for(int j = 0; j < digits.length; j++){
            int digit = Integer.parseInt(digits[j]);
            if(digit != 0 && n % digit == 0) {
                numberOfDivisors++;
            }
        }
        System.out.println(numberOfDivisors);
    }
    
}
