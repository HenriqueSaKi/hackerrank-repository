import java.util.Scanner;

public class TheTimeInWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m == 0) {
            System.out.println(oClockTime(h));
        }
        else if(m > 0 && m < 31) {
            System.out.println(pastHourTime(m, h));
        }
        else {
            System.out.println(remainingTime(m, h));
        }

        sc.close();

    }

    private static String getNumberName(Integer value) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen",
                "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"
        };

        return numberWords[value];

    }

    private static String oClockTime(int number) {
        return getNumberName(number) + " o' clock";
    };

    private static String pastHourTime (int minute, int hour) {
        return getNumberName(minute) + minuteMinutesOrEmpty(minute) + " past " + getNumberName(hour);
    }

    private static String remainingTime (int minute, int hour) {
        minute = 60 - minute;
        hour++;
        return getNumberName(minute) + minuteMinutesOrEmpty(minute) + " to " + getNumberName(hour);
    }

    private static String minuteMinutesOrEmpty(int minute) {
        return minute == 1 ? " minute" : 
            (minute != 15 && minute != 30 ) ? " minutes" : "" ;
    }
 
}
