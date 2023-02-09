package I_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_06_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        String[] order = bf.readLine().split(" ");
        int idx = 0;
        int[] arr = new int[N];

        boolean[] chArr = new boolean[101];

        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(order[i]);
            if (!chArr[p]) {
                idx++;
                if (idx > N) idx--;
                chArr[p] = true;
                for (int k = idx - 1; k > 0; k--) {
                    if (idx == N) chArr[arr[idx - 1]] = false;
                    arr[k] = arr[k - 1];
                }
                arr[0] = p;

            } else {
                int tp = 0;
                for (int k = 0; k < idx; k++) {
                    if (arr[k] == p) {
                        tp = k;
                        break;
                    }
                }
                for (int k = tp; k > 0; k--)  arr[k] = arr[k - 1];
                arr[0] = p;
            }
//            for (int k : arr)
//                System.out.print(k + " ");
//            System.out.println();

        }
        for (int k : arr)
            System.out.print(k + " ");
    }
}

