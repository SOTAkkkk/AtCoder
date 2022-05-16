import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String ans;
        if (0 < A && B == 0) {
            ans = "Gold";
        } else if (A == 0 && 0 < B) {
            ans = "Silver";
        } else {
            ans = "Alloy";
        }

        System.out.println(ans);
    }
}
