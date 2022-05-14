import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S1 = scanner.nextLine();
        String S2 = scanner.nextLine();

        char A1 = S1.charAt(0);
        char A2 = S1.charAt(1);
        char A3 = S2.charAt(0);
        char A4 = S2.charAt(1);

        if ((A1 == '.' && A4 == '.') || (A2 == '.' && A3 == '.')) {
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
