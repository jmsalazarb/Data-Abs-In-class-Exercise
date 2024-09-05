import java.util.Stack;
public class day2 {
    public static void main(String[] args){
        String test1 = "()";
        String test2 = "[)";
        String test3 = "{[()]}";
        String test4 = "{[(])}";
        Stack<Character> stack = new Stack<>();
        boolean flag = false;

        for (char c : test3.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    flag = false;  // No opening bracket to match
                    break;
                }
                char top = stack.pop();
                if (!((top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}'))) {
                    flag = false;  // Mismatch found
                    break;
                }
            }
        }

        // Check if the stack is empty after processing all characters
        if (!stack.isEmpty()) {
            flag = false;
        }
        System.out.println("Flag: " + flag);
    }
}
