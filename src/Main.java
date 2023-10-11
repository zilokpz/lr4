import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);
        int max = Math.max(Math.max(a , b ) , c );
        System.out.println(max);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        boolean containsDigit = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                containsDigit = true;
                break;
            }
        }

        if (containsDigit) {
            System.out.println("В строке есть цифры.");
        } else {
            System.out.println("В строке нет цифр.");
        }

    }
}