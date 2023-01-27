package I_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class I_04_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        String[] tp1 = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hash = new HashMap<>();

        int p1 = 0;
        int p2 = M - 1;

        for (int i = 0; i < M; i++) {
            hash.put(tp1[i], hash.getOrDefault(tp1[i], 0) + 1);
        }

        while (true) {
//            for (String s : hash.keySet()) {
//                System.out.print(s + " ");
//            }
//            System.out.println();

            sb.append(hash.size()).append(" ");
            if (p2 == N - 1) break;

            if (hash.get(tp1[p1]) == 1) hash.remove(tp1[p1]);
            else hash.put(tp1[p1], hash.get(tp1[p1]) - 1);
            p1++;

            hash.put(tp1[++p2], hash.getOrDefault(tp1[p2], 0) + 1);
        }
        System.out.println(sb);
    }
}

