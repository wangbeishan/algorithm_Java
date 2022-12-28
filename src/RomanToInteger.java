import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {

        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);

        int index = 0, result = 0, length = s.length();

        while (index < length) {
            Character cur = s.charAt(index);
            Character next = null;
            if (index < length - 1) {
                next = s.charAt(index + 1);
            }
            if (next != null && hash.get(cur) < hash.get(next))
                result -= hash.get(cur);
            else
                result += hash.get(cur);

            index++;
        }
        return result;
    }
}
