import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BigSorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<String> unsorted = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            unsorted.add(sc.nextLine());
        }
        
        Map<Integer, ArrayList<String>> map = numberLength(unsorted);

        List<String> finalList = sortStringValues(map);

        for (String value : finalList) {
            System.out.println(value);
        }

        sc.close();
        
    }

    private static List<String> sortStringValues(Map<Integer, ArrayList<String>> map) {
        List<String> finalList = new ArrayList<>();
        for(ArrayList<String> list : map.values()) {
            Collections.sort(list);
            for(int j = 0; j < list.size(); j++) {
                finalList.add(list.get(j));
            }
        }
        return finalList;
    }

    private static Map<Integer, ArrayList<String>> numberLength(List<String> unsorted) {
        Map<Integer, ArrayList<String>> map = new TreeMap<>();
        for(String value: unsorted) {
            int len = value.length();
            if(map.get(len) == null) {
                map.put(len, new ArrayList<>());
                map.get(len).add(value);
            }
            else {
                map.get(len).add(value);
            }
        }

        return map;
    }

}