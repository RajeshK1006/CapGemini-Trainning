import java.util.HashSet;

public class Q2{
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        System.out.println("String without duplicates: " + result.toString());
    }
}
