import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int a = Character.getNumericValue(S.charAt(0));
        int b = Character.getNumericValue(S.charAt(1));
        int c = Character.getNumericValue(S.charAt(2));

        int inputNumber = Integer.parseInt(S);
        int firstPlace=inputNumber;
        int ans = 0;
        while (firstPlace != 0) {
            firstPlace = inputNumber % 10;
            ans += firstPlace * 100 + firstPlace * 10 + firstPlace;
            inputNumber /= 10;
        }
        System.out.println(ans);
    }
}
