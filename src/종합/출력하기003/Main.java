package 종합.출력하기003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int x = 0;
        int result = 0;

        while(result <= a) {
            x++;
            result += x;
        }
        System.out.println(x);
    }
}
