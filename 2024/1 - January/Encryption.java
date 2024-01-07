import java.util.Scanner;

// Hackerrank - Encryption
public class Encryption {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String L = sc.nextLine();

        String[] letters = L.replace(" ", "").split("");
        int len = letters.length;
        int column = (int) Math.ceil(Math.sqrt(len));

        String line = divideLineByColumnLength(letters, len, column);

        String[] words = line.split(" ");
        int row = words.length;

        line = switchRowsToColumns(column, words, row);
        System.out.println(line);

        sc.close();

    }

    private static String divideLineByColumnLength(String[] letters, int len, int column) {
        String line = "";
        for(int i = 0; i < len; i++) {
            if(i % column == column - 1) {
                line = line + letters[i] + " ";
            }
            else {
                line = line + letters[i];
            }
        }
        return line;
    }

    private static String switchRowsToColumns(int column, String[] words, int row) {
        String line = "";
        for(int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                try {
                    if(j == row - 1) {
                        line = line + words[j].charAt(i) + " ";
                    }
                    else {
                        line = line + words[j].charAt(i);
                    }
                }
                catch (Exception e) {
                    line = line + " ";
                    continue;
                }
            }
        }
        return line;
    }
    
}