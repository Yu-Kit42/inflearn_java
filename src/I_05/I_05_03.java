package I_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class I_05_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] top = new int[N];
        int[][] arr = new int[N][N];
        String[] tp = new String[10];

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            tp = bf.readLine().split(" ");
            for (int k = 0; k < N; k++) {
                arr[k][i] = Integer.parseInt(tp[k]);
                if (Integer.parseInt(tp[k]) == 0) top[k]++;
            }
        }

//        for (int i : top) System.out.print(i + " ");
//        System.out.println();
        int M = Integer.parseInt(bf.readLine());
        tp = bf.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < M; i++) {
            int now = Integer.parseInt(tp[i]) - 1;
            if (top[now] >= N) continue;
//            System.out.printf("위치:%d 탑:%d 값:%d / ", now, top[now], arr[now][top[now]] );

            if (!stack.isEmpty() && stack.peek() == arr[now][top[now]]) {
                cnt += 2;
                stack.pop();
            } else {
                stack.push(arr[now][top[now]]);
            }
//            for (int a : stack) System.out.print(a + " ");
//            System.out.println();
            top[now]++;
        }
        System.out.println(cnt);
    }
}

