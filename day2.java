import java.util.Stack;
public class day2 {
    public static void main(String[] args){
        String test1 = "()";
        String test2 = "[)";
        String test3 = "{[()]}";
        String test4 = "{[(])}";
        Stack<Character> stack = new Stack<>();
        boolean flag = false;

        for(char c : test4.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}'){
                char top = stack.pop();
                if ((top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}') && stack.isEmpty()){
                    flag = true;
                    break;
                }else{
                    flag = false;
                    break;
                }
            }
        }

        System.out.println("Flag: " + flag);

    }
}
