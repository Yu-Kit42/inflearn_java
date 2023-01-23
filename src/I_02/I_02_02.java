package I_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_02_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] tp1 = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(tp1[i]) > max){
                max = Integer.parseInt(tp1[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

