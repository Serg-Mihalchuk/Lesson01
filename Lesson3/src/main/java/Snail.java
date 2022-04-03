import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        int H, A, B;

        Scanner scanner = new Scanner(System.in);

        H = Integer.parseInt(scanner.nextLine());
        A = Integer.parseInt(scanner.nextLine());
        B = Integer.parseInt(scanner.nextLine());

        if ((H > 0) && (H < 100) && (A > 0) && (A < 100)
                && (B > 0) && (B < 100) && (H > A) && (A > B)) {

            int count = (H - B - 1) / (A - B) + 1;

            System.out.println(count);
        } else System.out.println("Числа не соответствуют условиям задачи");

    }
}

