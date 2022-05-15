import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        HashSet hashSet = new HashSet();
        for(int i = 0; i<3;i++){
            hashSet.add(S.charAt(i));
        }
        if(hashSet.size()==1){
            System.out.println(1);
        }
        else if (hashSet.size() == 2){
            System.out.println(3);
        }
        else {
            System.out.println(6);
        }
    }
}
