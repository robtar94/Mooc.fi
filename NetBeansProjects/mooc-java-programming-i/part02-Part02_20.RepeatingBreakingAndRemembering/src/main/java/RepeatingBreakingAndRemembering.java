
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double avg = 0;

        int even = 0;
        int odd = 0;


        while (true) {

            System.out.println("Give numbers:");

            // Part 1: Reading

            double n = Double.valueOf(scanner.nextLine());

            if (n != -1) {

                // Part 2: Sum of Numbers

                sum+=n;

                // Part 3: Number of Numbers:
                count+=1;

                // Part 4: Average of numbers
                avg = ((double) sum/count);

                // Part 5: Even and odd numbers

                if (n % 2 == 0) {
                    even+=1;
                } else if (n % 2 != 0) {
                    odd+=1;
                }

                continue;

            } else {
                System.out.println("Thx! Bye!");
                break;
            }

        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd:" + odd);
    }
}