package I_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_02_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        boolean[] arr = new boolean[N + 1];

        arr[0] = true;
        arr[1] = true;
        int cnt = 0;

        for (int i = 2; i <= N; i++) {
            if (arr[i]) continue;
            else {
                cnt++;
                for (int k = i; k <= N; k += i) arr[k] = true;
            }
        }
        System.out.println(cnt);
    }
}

