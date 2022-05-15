import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        if (S.charAt(N - 1) == 'o') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
