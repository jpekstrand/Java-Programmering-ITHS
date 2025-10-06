package codealongs.Scanner.finished;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        System.out.println("Please input your age: ");
        Scanner scan = new Scanner(System.in);
        byte age = scan.nextByte();

        System.out.println("Please input your name: ");
        String name = scan.next();
    
        System.out.println("Please input your initials, if any: ");

        scan.close();
    }
}
