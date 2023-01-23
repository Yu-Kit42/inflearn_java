package I_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_02_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        boolean[] arr = new boolean[100001];
        String[] inArr = bf.readLine().split(" ");

        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) continue;
            for (int k = i * 2; k < arr.length; k += i) arr[k] = true;
        }

        for (int i = 0; i < N; i++) {
            int tp = Integer.parseInt(new StringBuilder(inArr[i]).reverse().toString());
            if (!arr[tp]) System.out.print(tp + " ");
        }
    }
}

