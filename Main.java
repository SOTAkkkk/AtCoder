import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if(S.equals("Hello,World!")){
            System.out.println("AC");
        }
        else{
            System.out.println("WA");
        }
    }
}
