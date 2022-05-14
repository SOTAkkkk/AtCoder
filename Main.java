import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();
        int X = scanner.nextInt();

        int takahashiDistance;
        int aokiDistance;

        if (X - (X / (A + C)) < A) {
            takahashiDistance = (A * B) * (X / (A + C)) + B * X;
        } else {
            takahashiDistance = (A * B) * (X / (A + C)) + B * A;
        }
        if (X - (X / (D + F)) < D) {
            aokiDistance = (D * E) * (X / (D + F)) + E * X;
        } else {
            aokiDistance = (D * E) * (X / (D + F)) + E * D;
        }

        if (takahashiDistance > aokiDistance) {
            System.out.println("Takahashi");
        } else if (takahashiDistance < aokiDistance) {
            System.out.println("Aoki");
        } else {
            System.out.println("Draw");
        }
    }
}
