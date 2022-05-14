import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int T = scanner.nextInt();
        int X = scanner.nextInt();
        if (S > T) {
            if ((S <= X && X <= 23) || (0 <= X && X < T)) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        } else if (S <= X && X < T) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
