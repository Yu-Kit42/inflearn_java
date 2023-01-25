package I_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_03_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] in = bf.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);

        int sum = 0;
        int cnt = 0;

        in = bf.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            sum = 0;
            for (int k = i; k < N; k++){
                sum += Integer.parseInt(in[k]);
//                System.out.println(in[k] + " " + sum);
                if (sum == M){
                    cnt++;
                    break;
                } else if (sum > M) break;
            }
        }
        System.out.println(cnt);
    }
}
