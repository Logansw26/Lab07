
import java.util.Random;
import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        String again = "Y";

        while (again.equalsIgnoreCase("Y")) {

            int roll = 0;
            int die1;
            int die2;
            int die3;

            System.out.printf("%-8s %-8s %-8s %-8s %-8s%n",
                    "Roll", "Die1", "Die2", "Die3", "Sum");

            System.out.println("--------------------------------------------");

            do {
                roll++;

                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;

                int sum = die1 + die2 + die3;

                System.out.printf("%-8d %-8d %-8d %-8d %-8d%n",
                        roll, die1, die2, die3, sum);

            } while (die1 != die2 || die2 != die3);

            System.out.println("All three dice match!");

            System.out.print("Play again? Enter Y or N: ");
            again = input.nextLine();
        }

        System.out.println("Thanks for playing!");

        input.close();
    }
}
