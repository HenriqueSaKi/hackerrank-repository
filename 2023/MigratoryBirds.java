import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MigratoryBirds {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(String.valueOf(migratoryBirds(arr)));
        sc.close();

    }

    private static int migratoryBirds(List<Integer> arr) {
        int[] aux = new int[5];
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1) 
                aux[0]++;
            if(arr.get(i) == 2) 
                aux[1]++;
            if(arr.get(i) == 3) 
                aux[2]++;
            if(arr.get(i) == 4) 
                aux[3]++;
            if(arr.get(i) == 5) 
                aux[4]++;
        }
        int highest = findHighestNumber(aux);
        return returnType(aux, highest);
    
    }
    
    private static int findHighestNumber(int[] aux) {
        int highest = 0;
        for(int i = 0; i < aux.length; i++) {
            if(aux[i] > highest) {
                highest = aux[i];
            }
        }
        return highest;
    }
    
    private static int returnType(int[] aux, int highest) {
        int pos = 1;
        for(int i = 0; i < aux.length; i++) {
            if (aux[i] == highest) {
                break;
            }
            pos++;
        }
        return pos;
    }
    
}
