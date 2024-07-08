import java.util.Scanner;

public class A021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 멀티탭의 갯수
        int A = 0;
        int cnt = 0;
        int[] p = new int[N];

        for (int i = 0; i < N; i++) {
            p[i] = scanner.nextInt();
            A += p[i];
            cnt++;
        }

        System.out.println(A - (cnt - 1));
        scanner.close();
    }
}
