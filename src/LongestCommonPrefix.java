import java.util.HashSet;
import java.util.LinkedList;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length < 1 || strs == null)
            return "";
        if (strs.length == 1)
            return strs[0];

        int shortest = 0;
        int len = strs[0].length();

        for (int i = 0; i < strs.length; i++) {
            int curLen = strs[i].length();
            if (curLen < len) {
                len = curLen;
                shortest = i;
            }
        }

        String sub = strs[shortest];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(sub) != 0) {
                sub = sub.substring(0, sub.length() - 1);
            }
        }
        return sub;
    }
}
