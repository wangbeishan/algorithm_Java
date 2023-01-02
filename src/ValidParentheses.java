import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (stack.empty())
                return false;
            else if (c == ')' && stack.pop() != '(')
                return false;
            else if (c == '}' && stack.pop() != '{')
                return false;
            else if (c == ']' && stack.pop() != '[')
                return false;
        }
        return stack.empty();
    }
}
