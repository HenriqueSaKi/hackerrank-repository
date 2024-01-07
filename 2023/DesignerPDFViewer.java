import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DesignerPDFViewer {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> h = IntStream.range(0, 26)
            .mapToObj(i -> sc.nextInt())
            .collect(Collectors.toList());
        String word = sc.next();
        System.out.println(String.valueOf(designerPdfViewer(h, word)));
        sc.close();

    }

    private static int designerPdfViewer(List<Integer> h, String word) {
        Map<String, Integer> alphabet = fillAlphabet(h);
        int height = tallestLetter(h, word, alphabet);
        int qtdLetters = word.length();
        return calculateArea(qtdLetters, height);
    }
    
    private static Map<String, Integer> fillAlphabet(List<Integer> h) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z"};
        Map<String, Integer> alphabetMap = new HashMap<>();
        for(int i = 0; i < h.size(); i++) {
            alphabetMap.put(alphabet[i], h.get(i));
        }
        return alphabetMap;
    }
    
    private static int tallestLetter(List<Integer> h, String word,
        Map<String, Integer> alphabet) {
        int tallest = 0;
        String[] wordLetters = word.split("");
        for(int i = 0; i < wordLetters.length; i++) {
            tallest = alphabet.get(wordLetters[i]) > tallest ? 
                alphabet.get(wordLetters[i]) : tallest;
        }
        return tallest;
    }
    
    private static int calculateArea(int qtdLetters, int height) {
        return qtdLetters * 1 * height;
    }
    
}
