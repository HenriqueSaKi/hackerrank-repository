import java.util.Scanner;

public class StrongPassword {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String password = sc.nextLine();

        int count = 0;

        if(!checkIfExists("0123456789", password)) count++;        
        if(!checkIfExists("abcdefghijklmnopqrstuvwxyz", password)) count++;
        if(!checkIfExists("ABCDEFGHIJKLMNOPQRSTUVWXYZ", password)) count++;
        if(!checkIfExists("!@#$%^&*()-+", password)) count++;
        
        if(n + count < 6) {
            count = 6 - n;
        }

        System.out.println(count);
        sc.close();

    }

    private static boolean checkIfExists(String validValues, String password) {
        String[] values = validValues.split("");
        for(int i = 0; i < values.length; i++) {
            if(password.contains(values[i])) {
                return true;
            }
        }
        return false;
    }
    
}
