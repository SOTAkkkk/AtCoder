import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if(S.endsWith("er")){
            System.out.println("er");
        }
        else{
            System.out.println("ist");
        }
    }
}
