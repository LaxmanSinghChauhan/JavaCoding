package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HighestFreqencyChars {

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'a', 'b', 'a' };
        Map<Character, Integer> counterHM = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (counterHM.containsKey(arr[i]))
                counterHM.put(arr[i], counterHM.get(arr[i]) + 1);
            else
                counterHM.put(arr[i], 1);

        }
        System.out.println(counterHM);
    }
}
