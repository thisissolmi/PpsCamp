import java.util.Scanner;

public class A020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int max = 0;

        for (int i = 0; i < 4; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            total += n2 - n1;
            if (total > max) {
                max = total;
            }
        }

        System.out.println(max);
        scanner.close();
    }
}
