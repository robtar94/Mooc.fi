
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int fst = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int sec = Integer.valueOf(scanner.nextLine());
        System.out.println(fst + " + " + sec + " = " + (fst + sec));
        System.out.println(fst + " - " + sec + " = " + (fst - sec));
        System.out.println(fst + " * " + sec + " = " + (fst * sec));
        System.out.println(fst + " / " + sec + " = " +  ((double) fst / sec));

    }
}
