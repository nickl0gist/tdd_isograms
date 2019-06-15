import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {

    public boolean isIsogram(String input) {
        input = input.replace(" ", "").replace("-","");
        input = input.toLowerCase();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }
        return set.size() == input.length();
    }
}