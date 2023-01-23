import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_02_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");

        int p = 1;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[k])) p++;
            System.out.print(p + " ");
            p = 1;
        }
    }
}


