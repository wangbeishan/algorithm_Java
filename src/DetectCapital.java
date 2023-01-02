public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                count++;
            }
        }
        if (count == word.length() || count == 0
                || ((word.charAt(0) >= 65 && word.charAt(0) <= 90) && count == 1)) {
            return true;
        }
        return false;
    }
}
