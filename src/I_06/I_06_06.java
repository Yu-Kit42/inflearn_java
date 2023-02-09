package I_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I_06_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] tp1 = bf.readLine().split(" ");
        int[] arr = new int[N];
        int[] stArr = new int[N];

        String out = "";

        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(tp1[i]);
            arr[i] = p;
            stArr[i] = p;
        }

        Arrays.sort(stArr);

        for (int i = 0; i < N; i++) if (arr[i] != stArr[i])   out += i + 1 + " ";
        System.out.println(out);
    }
}

