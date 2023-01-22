import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String tp1 = bf.readLine();

        String out = "";
        char charTp = ' ';
        int intTp = 1;

        for (int i = 0; i < tp1.length(); i++) {
            if (tp1.charAt(i) != charTp) {
                out += (intTp <= 1 ? "" : intTp);
                out += tp1.charAt(i);
                intTp = 1;
                charTp = tp1.charAt(i);
            } else intTp++;
        }
        if (intTp != 1) out += (intTp <= 1 ? "" : intTp);
        System.out.println(out);
    }
}

