package I_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_02_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] tp1 = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (i == 0 || Integer.parseInt(tp1[i]) > Integer.parseInt(tp1[i - 1]))
                sb.append(Integer.parseInt(tp1[i])).append(" ");
        }
        System.out.println(sb);
    }
}

