import java.util.Scanner;

public class A034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[42]; // 0부터 41까지의 인덱스를 가진 배열
        int val = 0;

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            arr[num % 42] = 1; // 나머지를 인덱스로 하여 배열 요소를 1로 설정 (중복 방지)
        }

        for (int i = 0; i < 42; i++) {
            if (arr[i] == 1) {
                val++; // 배열 요소가 1인 경우, 중복되지 않는 값이므로 개수를 증가
            }
        }

        System.out.println(val);
        scanner.close();
    }
}
