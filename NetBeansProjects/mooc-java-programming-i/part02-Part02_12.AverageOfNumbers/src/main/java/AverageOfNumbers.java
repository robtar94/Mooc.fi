
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            double num = Double.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }

            if (num < 0 || num > 0) {

                total+=1;
                sum+=num;
                continue;
            }
        }

        System.out.println("Average of the numbers: " + (double) (sum/total));

    }
}
