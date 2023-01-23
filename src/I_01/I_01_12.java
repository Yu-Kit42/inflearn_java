package I_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_01_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String tp1 = bf.readLine();
        String out = "";
        String tp = "";

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < 7; k++){
                tp += (tp1.charAt(i * 7 + k) == '#' ? 1 : 0);
            }
            out += (char) (Integer.parseInt(tp, 2));
            tp = "";
        }
        System.out.println(out);
    }
}

