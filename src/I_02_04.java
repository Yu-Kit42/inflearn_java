import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_02_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[46];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i < 45; i++) arr[i] = arr[i - 1] + arr[i - 2];
        for (int i = 0; i < N; i++) System.out.print(arr[i] + " ");
    }
}

