package I_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Person {
    int id;
    int p;

    public Person(int id, int p) {
        this.id = id;
        this.p = p;
    }
}

public class I_05_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tp1 = bf.readLine().split(" ");
        int N = Integer.parseInt(tp1[0]);
        int M = Integer.parseInt(tp1[1]);
        String[] tp2 = bf.readLine().split(" ");
        int[] max = new int[51];
        int maxTp = 0;

        Queue<Person> q = new LinkedList<>();


        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(tp2[i]);
            q.offer(new Person(i, p));
            max[p - 50] += 1;
            maxTp = Math.max(maxTp, p - 50);
        }
        int cnt = 0;
        int tp = 0;

        while (true) {
            if (max[maxTp] == 0) {
                maxTp -= 1;
                continue;
            }
//            for (Person i : q) System.out.print(i.p + " ");
//            System.out.printf(" 인덱스:%d max:%d 개수:%d %d\n", q.peek().id, maxTp, max[maxTp], q.peek().p - 50);
            if (q.peek().p - 50 == maxTp) {
                cnt++;
                if (q.poll().id == M) break;
                max[maxTp] -= 1;
            } else q.offer(q.poll());
        }
        System.out.println(cnt);
    }
}

