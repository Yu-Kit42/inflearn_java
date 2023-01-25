package I_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_03_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] in = bf.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        int max = 0;
        int sum = 0;
        int[] arr = new int[N + 1];
        arr[0] = 0;
        in = bf.readLine().split(" ");

        for (int i = 0; i < N; i++) arr[i + 1] = sum += Integer.parseInt(in[i]);
        for (int i = 0; i < N - M + 1; i++) {
            max = Math.max(max, arr[M + i] - arr[i]);
//            System.out.printf("%d %d %d \n", arr[M + i - 1] - arr[i], arr[M + i], arr[i]);
        }
        System.out.println(max);
    }
}
