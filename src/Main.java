import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 테스트

public class Main {

    public String solution(String str) {
        String answer = "";
        String[] arr = new StringBuilder(str).reverse().toString().split(" ");
        List<Integer> list = new ArrayList<>();

        for (String s : arr) {
            int target = Integer.parseInt(s);

            if (target != 2 && target % 2 == 0) continue;

            if (target == 1) continue;
            boolean check = true;

            for (int j = 3; j <= Math.sqrt(target); j+=2) {
                if (target % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) list.add(target);
        }

        for (int i =list.size()-1; i >= 0; i--) {
            answer += list.get(i) + " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        Main main = new Main();
        System.out.println(main.solution(str));
        return;
    }

}