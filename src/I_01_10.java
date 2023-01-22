import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_01_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String tp1 = bf.readLine();
        char[] arr = tp1.split(" ")[0].toCharArray();
        char t = tp1.split(" ")[1].charAt(0);

        boolean[] chArr = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == t) chArr[i] = true;

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (i - k >= 0){
                    if (chArr[i - k]) {
                        System.out.print(k + " ");
                        break;
                    }
                }
                if(i + k < arr.length){
                    if (chArr[i + k]) {
                        System.out.print(k + " ");
                        break;
                    }
                }
            }
        }
    }
}
