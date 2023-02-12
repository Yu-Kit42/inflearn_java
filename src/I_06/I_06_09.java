package I_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I_06_09 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tp1 = bf.readLine().split(" ");
        int N = Integer.parseInt(tp1[0]);
        int M = Integer.parseInt(tp1[1]);
        String[] tp2 = bf.readLine().split(" ");
        int[] arr = new int[tp2.length];

        // 입력 받은 수를 Int 형으로
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(tp2[i]);

        
        int p1 = Arrays.stream(arr).max().getAsInt();   // 입력값의 최대값을 시작지점으로
        int p2 = Arrays.stream(arr).sum();              // 1 3 6 10 15 21 28 36 45 값들의 최대값을 끝지점으로 

        
        // 디버그용
        /*
        int t = 0;
        for (int i : arr) {
            t += i;
            System.out.print(t + " ");
        }
        */

        int out = 0;
        while (p1 <= p2) {

            int mid = (p1 + p2) / 2;
            int cnt = 1;
            int sum = 0;

            // 배열 값을 더하면서 X크기일때 M개의 디스크에 다 담을수 있는지 체크 
            for (int x : arr) {
                if (sum + x > mid) {
                    cnt++;
                    sum = x;
                } else sum += x;
            }

            // X크기에 만족 하는지 체크, 만족한다면 출력값과 범위를 바꾸고 다시 실행
            if (cnt <= M) {
                p2 = mid - 1;
                out = mid;
            } else p1 = mid + 1; // X크기를 초과시 시작점을 끝으로
        }
        System.out.println(out);
    }
}

