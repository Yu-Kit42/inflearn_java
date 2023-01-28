package I_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class I_05_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] temp = bf.readLine().toCharArray();
        Stack<Character> op = new Stack<>();


        StringBuilder sb = new StringBuilder();

        boolean ch = true;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == '(') {
                op.push(temp[i]);
            } else {
                if (op.isEmpty()) {
                    ch = false;
                    break;
                }
                op.pop();
            }
        }

        if (op.isEmpty() && ch) System.out.println("YES");
        else System.out.println("NO");
    }
}

