package I_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_02_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][N];

        int max = 0;
        int sum1, sum2;

        for (int i = 0; i < N; i++) {
            String[] tp = bf.readLine().split(" ");
            for (int k = 0; k < N; k++) {
                arr[i][k] = Integer.parseInt(tp[k]);
            }
        }
        for (int i = 0; i < N; i++) {
            sum1 = sum2 = 0;
            for (int k = 0; k < N; k++) {
                sum1 += arr[i][k];
                sum2 += arr[k][i];
            }
            max = Math.max(Math.max(sum1, sum2), max);
        }
        sum1 = sum2 = 0;

        for (int i = 0; i < N; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][N - i - 1];
        }
        max = Math.max(Math.max(sum1, sum2), max);
        System.out.println(max);
    }
}


