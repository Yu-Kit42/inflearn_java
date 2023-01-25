package I_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_03_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N + 1];
        int cnt = 0;
        int sum = 0;
        int p1 = 1;
        int p2 = 1;

        for (int i = 0; i <= N; i++) arr[i] = i;
        while (true) {
            if (p2 == 1) sum += arr[p2];
            if (sum == N) {
//                System.out.println(p1 + ":" + p2);
                cnt++;
                sum -= arr[p1++];
            } else if (sum < N) {
                p2++;
                sum += arr[p2];
            } else sum -= arr[p1++];
            if (p1 == p2 && p1 == N) break;
        }
        System.out.println(cnt);
    }
}
