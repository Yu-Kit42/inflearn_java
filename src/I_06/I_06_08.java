
package I_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I_06_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tp1 = bf.readLine().split(" ");
        int N = Integer.parseInt(tp1[0]);
        int M = Integer.parseInt(tp1[1]);
        String[] tp2 = bf.readLine().split(" ");
        int[] arr = new int[tp2.length];
        StringBuilder sb = new StringBuilder();

        int p1 = 0;
        int p2 = tp2.length - 1;

        for (int i = 0; i < N; i++)  arr[i] = Integer.parseInt(tp2[i]);

        Arrays.sort(arr);

//        for (int i : arr) System.out.print(i + " ");
//        System.out.println();

        while (true){
            int mid = (p1 + p2) / 2;
//            System.out.printf("mid:%d val:%d \n", mid, arr[mid]);
            if (arr[mid] == M){
                System.out.println(mid + 1);
                break;
            } else if (arr[mid] > M) {
                p2 = mid;
            } else {
                p1 = mid;
            }
        }
    }
}

