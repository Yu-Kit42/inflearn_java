package I_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_03_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] in = bf.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);

        int len = 0;
        int zero = 0;

        int p1 = 0;
        int p2 = 0;

        in = bf.readLine().split(" ");
        while (true) {
//            for (int i = p1; i < p2; i++)
//                System.out.print(in[i] + " ");;
            if (p2 == N){
                len = Math.max(len, p2 - p1);
                break;
            }
            if (zero < M + 1) {
                if (in[p2].equals("0")) zero++;
                p2++;
            } else if (zero == M + 1){
                len = Math.max(len, p2 - p1 - 1);
                if (in[p1].equals("0")) zero--;
                p1++;
            }
//            System.out.println();
        }
        System.out.println(len);
    }
}
