import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if(S.length() == 4){
            System.out.println(S);
        }
        else if (S.length() == 3){
            System.out.println("0"+S);
        }
        else if (S.length() == 2 ){
            System.out.println("0"+"0"+S);
        }
        else {
            System.out.println("0"+"0"+"0"+S);
        }


    }
}
