import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        int X = (int) Math.floor(input);
        int Y = (int) ((input - (double) X)*10);
        if (0 <= Y && Y <= 2) {
            System.out.println(X + "-");
        } else if (3 <= Y && Y <= 6) {
            System.out.println(X);
        } else {
            System.out.println(X + "+");
        }
    }
}
