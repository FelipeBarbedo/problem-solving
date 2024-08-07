import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(){";

        System.out.println(SolutionVP.isValid(s));
    }
}

class SolutionVP {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(', '{', '[':
                    stack.push(s.charAt(i));
                    break;
                case ')', '}', ']':
                    try {
                        if (stack.peek() == '(' && s.charAt(i) == ')') {
                            stack.pop();
                        } else if (stack.peek() == '{' && s.charAt(i) == '}') {
                            stack.pop();
                        } else if (stack.peek() == '[' && s.charAt(i) == ']') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    } catch (Exception e) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
