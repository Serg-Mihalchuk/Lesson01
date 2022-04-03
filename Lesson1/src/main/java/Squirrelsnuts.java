import java.util.Scanner;

public class Squirrelsnuts {
    public static void main(String[] args) {

        int N;
        int K;

        Scanner scanner = new Scanner(System.in);

        N = Integer.parseInt(scanner.nextLine());
        K = Integer.parseInt(scanner.nextLine());

        if ((N > 0) & (N < 10000) & (K > 0) & (K < 10000)){

            int count = K % N;

            System.out.println(count);}
        else System.out.println("Отрицательное число или больше 10000");

    }

}
