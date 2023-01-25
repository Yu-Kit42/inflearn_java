package I_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I_03_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        String[] tp1 = bf.readLine().split(" ");
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) arr1[i] = Integer.parseInt(tp1[i]);

        int M = Integer.parseInt(bf.readLine());
        String[] tp2 = bf.readLine().split(" ");
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) arr2[i] = Integer.parseInt(tp2[i]);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        StringBuilder sb = new StringBuilder();
        int p1 = 0;
        int p2 = 0;
        int P1 = 0;
        int P2 = 0;

        for (int i = 0; i < N + M; i++) {
            if (p1 != tp1.length) P1 = arr1[p1];
            else break;
            if (p2 != tp2.length) P2 = arr2[p2];
            else break;
            if (P1 == P2) {
                sb.append(P1).append(" ");
                p1++;
                p2++;
            } else if (P1 < P2) p1++;
            else p2++;
        }
        System.out.println(sb);
    }
}

