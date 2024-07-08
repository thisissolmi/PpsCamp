import java.util.Scanner;

public class A033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int num = 0;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = 0;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            sum += a + b + c + d;

            if (sum > max) {
                max = sum;
                num = i + 1; // 인덱스가 1부터 시작하므로 1을 더해줌
            }
        }

        System.out.println(num + " " + max);
        scanner.close();
    }
}
