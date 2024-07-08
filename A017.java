import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String roomNumber = scanner.next();
        int[] number = new int[10];

        for (int i = 0; i < roomNumber.length(); i++) {
            number[roomNumber.charAt(i) - '0']++;
        }

        number[6] += number[9];
        number[6] = (number[6] + 1) / 2; // 숫자 6과 9를 하나의 세트로 처리
        number[9] = 0;

        int max = 0;
        for (int n = 0; n < 10; n++) {
            if (max < number[n]) {
                max = number[n];
            }
        }

        System.out.println(max);
        scanner.close();
    }
}
