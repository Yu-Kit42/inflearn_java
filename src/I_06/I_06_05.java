package I_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_06_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] tp1 = bf.readLine().split(" ");
        boolean[] ch = new boolean[10000001];
        boolean c = true;

        for (int i = 0; i < N; i++) {
            int tp = Integer.parseInt(tp1[i]);
            if (!ch[tp]) ch[tp] = true;
            else {
                c = false;
                break;
            }
        }
        if (c)
            System.out.println("U");
        else
            System.out.println("D");
    }
}

