import java.util.Scanner;

public class A105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int i = 1;

        while (X > i) {
            X -= i;
            i++;
        }

        if (i % 2 == 0)
            System.out.println(X + "/" + (i - X + 1));
        else
            System.out.println((i - X + 1) + "/" + X);

        scanner.close();
    }
}
