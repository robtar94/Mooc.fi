
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double total = 0;

        while (true) {

            double num = Double.valueOf(scanner.nextLine());
            if (num == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

            if (num > 0) {
                total+=1;
                sum+=num;
            }

            if (num < 0) {
                continue;
            }

        }
        System.out.println(sum/total);



    }
}
