package I_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class I_05_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] temp = bf.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (char c : temp) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int p2 = stack.pop();
                int p1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(p1 + p2);
                        break;
                    case '-':
                        stack.push(p1 - p2);
                        break;
                    case '*':
                        stack.push(p1 * p2);
                        break;
                    case '/':
                        stack.push(p1 / p2);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}

