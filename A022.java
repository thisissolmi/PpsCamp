import java.util.Scanner;

public class A022
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = 0, num3 = 0;

        for (int i = 0; i < num1; i++) {
            int num4 = scanner.nextInt();
            num2 += (num4 / 30 + 1) * 10;
            num3 += (num4 / 60 + 1) * 15;
        }

        if (num2 == num3) {
            System.out.println("Y M " + num2);
        } else if (num2 > num3) {
            System.out.println("M " + num3);
        } else {
            System.out.println("Y " + num2);
        }

        scanner.close();
    }
}
