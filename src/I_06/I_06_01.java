package I_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_06_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] tp1 = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        String tp = "";

        for (int i = 0; i < N - 1; i++) {
            for (int k = i + 1; k < N; k++) {
                int p1 = Integer.parseInt(tp1[i]);
                int p2 = Integer.parseInt(tp1[k]);
                if (p1 > p2) {
                    tp = tp1[i];
                    tp1[i] = tp1[k];
                    tp1[k] = tp;
                }
            }
        }
        for (String s : tp1)
            System.out.print(s + " ");
    }
}

