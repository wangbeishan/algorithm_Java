import java.util.LinkedList;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0))
            return false;
        if (x > 0 && x < 10)
            return true;
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x /= 10;
            System.out.println("res: " + res + ", x: " + x);
        }

        return ((res == x) || (x == res / 10));
    }
}
