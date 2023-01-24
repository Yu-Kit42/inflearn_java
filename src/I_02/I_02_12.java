package I_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_02_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] firIn = bf.readLine().split(" ");
        int N = Integer.parseInt(firIn[0]);
        int M = Integer.parseInt(firIn[1]);
        int[][] arr = new int[M][N];
        boolean[][] arrCh = new boolean[N][N];

        for (int i = 0; i < M; i++) {
            String[] tp = bf.readLine().split(" ");
            for (int k = 0; k < N; k++) {
                arr[i][k] = Integer.parseInt(tp[k]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[j][k] != i + 1) {
                        arrCh[i][arr[j][k] -1] = true;
//                        System.out.println(j + ":" + k + " " + (i + 1));
                    } else {
                        arrCh[i][i] = true;
                        break;
                    }
                }
            }
        }
//        for (boolean[] a : arrCh) {
//            for (boolean c : a) {
//                if (!c) System.out.print("1 ");
//                else System.out.print("0 ");
//            }
//            System.out.println();
//        }
        int cnt = 0;
        for (boolean[] a : arrCh)
            for (boolean c : a)
                if (!c) cnt++;
        System.out.println(cnt);
    }
}


