import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что-то");
        int x = s.nextInt();
        System.out.println("ВЫ ВВЕЛИ "+ x);
    }
}
