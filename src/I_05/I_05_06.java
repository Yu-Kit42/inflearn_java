package I_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class I_05_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);

        Queue<Integer> q = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            q.offer(i + 1);
        }

        while (!q.isEmpty()){
            for (int i = 1; i < M; i++) {
                q.offer(q.poll());
            }
            q.poll();
            if (q.size() == 1)
                System.out.println(q.poll());
        }
    }
}

