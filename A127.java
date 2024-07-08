import java.util.Scanner;

public class A127 {
    // 최대공약수를 구하는 함수
    public static int divide(int x, int y) {
        if (x % y == 0)
            return y;
        else
            return divide(y, x % y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스 개수
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // A와 B 중 큰 값으로 최대공약수를 구함
            int gcd;
            if (A >= B) {
                gcd = divide(A, B);
            } else {
                gcd = divide(B, A);
            }

            // 최소공배수 계산
            int lcm = A * B / gcd;

            System.out.println(lcm);
        }

        scanner.close();
    }
}
