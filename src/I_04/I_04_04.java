package I_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class I_04_04 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bf.readLine());
        char[] S = bf.readLine().toCharArray();
        char[] T = bf.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        HashMap<Character, Integer> SH = new HashMap<>();
        HashMap<Character, Integer> TH = new HashMap<>();

        int cnt = 0;
        int p1 = 0;
        int p2 = T.length - 1;

        for (char c : T) TH.put(c, TH.getOrDefault(c, 0) + 1);
        for (int i = 0; i < T.length; i++) SH.put(S[i], SH.getOrDefault(S[i], 0) + 1);


        while (true) {
            if (SH.equals(TH)) cnt++;
            if (p2 + 1 == S.length) break;
//            System.out.println();
//            for (char c : SH.keySet()) System.out.print(c + ":" + SH.get(c) + " ");

            if (SH.get(S[p1]) == 1) SH.remove(S[p1]);
            else SH.put(S[p1], SH.get(S[p1]) - 1);
            p1 += 1;

            p2 += 1;
            SH.put(S[p2], SH.getOrDefault(S[p2], 0) + 1 );
        }

        System.out.println(cnt);
    }
}


