package I_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class I_05_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] tp1 = bf.readLine().toCharArray();
        char[] tp2 = bf.readLine().toCharArray();
        Queue<Character> q = new LinkedList<>();

        for (char c : tp1) q.offer(c);

        boolean ch = true;

        for (int i = 0; i < tp2.length; i++) {
            if (q.contains(tp2[i])){
                if (q.peek() == tp2[i]){
                    q.poll();
                } else {
                    ch = false;
                    break;
                }
            }
        }

        if (ch && q.size() == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

