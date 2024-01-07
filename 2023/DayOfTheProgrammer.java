import java.util.Scanner;

public class DayOfTheProgrammer {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(dayOfProgrammer(year));
        sc.close();

    }

    public static String dayOfProgrammer(int year) {
        if (year == 1918) {
            return "26.09." + String.valueOf(year);
        }
        if (year % 400 == 0) 
            return "12.09." + String.valueOf(year);
        else 
            if (year % 4 == 0 && year <= 1900)
                return "12.09." + String.valueOf(year);
            else if (year % 4 == 0 && year % 100 != 0)
                return "12.09." + String.valueOf(year);
            else 
                return "13.09." + String.valueOf(year);
    }
    
}
