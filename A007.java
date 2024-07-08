import java.util.Scanner;

public class A007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];
        int ascending = 0;
        int descending = 0;

        for (int i = 0; i < 8; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] == i + 1) {
                ascending += 1;
            } else if (arr[i] == 8 - i) {
                descending += 1;
            }
        }

        if (ascending == 8) {
            System.out.println("ascending");
        } else if (descending == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        scanner.close();
    }
}
