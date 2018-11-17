import java.util.HashMap;

class Counter{
    private final HashMap<Character, Integer> counter = new HashMap<>();

    Counter(String phrase){
        for (Character a : phrase.toCharArray()) {
            if (a == ' ' || a == '-'){
                continue;
            }
            a = Character.toLowerCase(a);
            if (counter.containsKey(a)) {
                int oldValue = counter.get(a);
                counter.put(a, oldValue + 1);
            } else {
                counter.put(a, 1);
            }
        }
    }

    Boolean allUnique(){
        for(Integer value : counter.values()){
            if (value != 1){
                return false;
            }
        }
        return true;
    }
}

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Counter counter = new Counter(phrase);
        return counter.allUnique();
    }

}
