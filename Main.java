import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N < 10) {
            System.out.println("AGC00" + N);
        } else if (N < 42) {
            System.out.println("AGC0" + N);
        } else {
            System.out.println("AGC0" + (N + 1));
        }
    }
}
