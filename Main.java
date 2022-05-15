import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        if (90 <= X) {
            System.out.println("expert");
        } else if (70 <= X) {
            System.out.println(90 - X);
        } else if (40 <= X) {
            System.out.println(70 - X);
        } else {
            System.out.println(40 - X);
        }
    }
}
