package I_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_02_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N + 2][N + 2];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            String[] tp = bf.readLine().split(" ");
            for (int k = 1; k <= N; k++) {
                arr[i][k] = Integer.parseInt(tp[k - 1]);
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                boolean ch  = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (arr[nx][ny] >= arr[i][j]){
                        ch = false;
                        break;
                    }
                }
                if (ch) cnt++;
            }
        }
        System.out.println(cnt);
    }
}


