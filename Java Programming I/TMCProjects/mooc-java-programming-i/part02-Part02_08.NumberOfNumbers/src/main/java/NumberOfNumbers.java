
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // counting numbers

        int num = 0;
        int total = 0;

1

        while (true) {
            System.out.println("Give a number:");

            num = Integer.valueOf(scanner.nextLine());

            if (num == 0) { // exit condiction
                break;
            }

            if (num > 0 || num < 0) {

                total+=1;
                continue;
            }
        }

        System.out.println("Number of numbers: " + total);



    }
}
