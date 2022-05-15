import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();

        if(S.compareTo(T)<0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
