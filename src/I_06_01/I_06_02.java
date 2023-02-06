package I_06_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_06_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] tp1 = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        String tp = "";

        for (int i = N - 1; 0 < i; i--) {
            for (int k = 0; k < i; k++) {
                int p1 = Integer.parseInt(tp1[k]);
                int p2 = Integer.parseInt(tp1[k + 1]);
                if (p1 > p2) {
                    tp = tp1[k];
                    tp1[k] = tp1[k + 1];
                    tp1[k + 1] = tp;
                }
            }
        }
        for (String s : tp1)
            System.out.print(s + " ");
    }
}

