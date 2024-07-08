import java.util.Scanner;

public class A019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int total = a * b * c;
        int[] count = new int[10];

        while (total != 0) {
            count[total % 10]++;
            total /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }

        scanner.close();
    }
}
