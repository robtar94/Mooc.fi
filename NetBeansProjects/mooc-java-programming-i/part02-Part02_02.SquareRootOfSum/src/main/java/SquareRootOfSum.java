
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // assign input to variables.
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        // calculate sum
        int sum = num1 + num2;

        // calculate squareroot of sum

        double squareRoot = Math.sqrt(sum);

        // printing

        System.out.println(squareRoot);

    }
}
