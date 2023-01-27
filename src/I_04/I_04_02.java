package I_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class I_04_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bf.readLine());
//        char[] temp = bf.readLine().toCharArray();
//        int N = Integer.parseInt(temp[0]);
//        int M = Integer.parseInt(temp[1]);
//        StringBuilder sb = new StringBuilder();

        char[] tp1 = bf.readLine().toCharArray();
        char[] tp2 = bf.readLine().toCharArray();
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for (int i = 0; i < tp1.length; i++) {
            hashMap1.put(tp1[i], hashMap1.getOrDefault(tp1[i], 0) + 1);
            hashMap2.put(tp2[i], hashMap2.getOrDefault(tp2[i], 0) + 1);
        }
        String out = "YES";
        for (char x : hashMap1.keySet()){
            if (hashMap1.getOrDefault(x, 0) != hashMap2.getOrDefault(x, 0)){
                out = "NO";
                break;
            }
        }

        System.out.println(out);
    }
}

