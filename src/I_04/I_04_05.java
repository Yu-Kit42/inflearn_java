package I_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.TreeSet;

public class I_04_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tp1 = bf.readLine().split(" ");
        int N = Integer.parseInt(tp1[0]);
        int M = Integer.parseInt(tp1[1]);
        String[] tp2 = bf.readLine().split(" ");

        TreeSet<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    Tset.add(Integer.parseInt(tp2[i]) + Integer.parseInt(tp2[j]) + Integer.parseInt(tp2[k]));
                }
            }
        }

        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == M) {
                System.out.println(x);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}

