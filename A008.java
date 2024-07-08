import java.util.Scanner;

public class A008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        for (int i = 0; i < c; i++) {
            int n = scanner.nextInt();
            int[] scores = new int[n];
            int sum = 0;
            int countAboveAverage = 0;

            for (int j = 0; j < n; j++) {
                scores[j] = scanner.nextInt();
                sum += scores[j];
            }

            double average = (double) sum / n;

            for (int j = 0; j < n; j++) {
                if (scores[j] > average) {
                    countAboveAverage++;
                }
            }

            double result = (double) countAboveAverage / n * 100;

            System.out.printf("%.3f%%\n", result);
        }

        scanner.close();
    }
}
