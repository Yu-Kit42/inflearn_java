package I_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_04_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        char[] temp = bf.readLine().toCharArray();
//        int N = Integer.parseInt(temp[0]);
//        int M = Integer.parseInt(temp[1]);
//        String[] tp1 = bf.readLine().split(" ");
//        String[] tp2 = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        int max = 0;
        int idx = 0;

        for (int i = 0; i < N; i++) {
            if (++arr[temp[i] - 65] > max) {
                max = ++arr[temp[i] - 65];
                idx = temp[i];
            }
        }
        System.out.println((char) idx);
    }
}

