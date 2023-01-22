import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_02_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] A = bf.readLine().split(" ");
        String[] B = bf.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(A[i]) - Integer.parseInt(B[i]) == 1 || Integer.parseInt(A[i]) - Integer.parseInt(B[i]) == -2)
                System.out.println("A");
            else if (Integer.parseInt(A[i]) - Integer.parseInt(B[i]) == -1 || Integer.parseInt(A[i]) - Integer.parseInt(B[i]) == 2)
                System.out.println("B");
            else
                System.out.println("D");
        }
    }
}

