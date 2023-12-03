import java.util.Scanner;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        playGame(scanner, random);

    }

    public static void playGame(Scanner scanner, Random random) {
        int maxAttempts = 5;
        int rounds = 0;
        int score = 0;
        boolean playAgain = true;
        System.out.println("Enter your name:");
        String name=scanner.nextLine();

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            System.out.println("Round " + (rounds + 1) + ": Guess the number between 1 and 100.");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                int guess;
                try {
                    guess = scanner.nextInt();
                }
                catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                    scanner.next();
                    continue;
                }

                if (guess == randomNumber) {
                    System.out.println("Congratulations!"+ name +" You have guessed correct the number.");
                    score++;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("It's too low! Try again.");
                } else {
                    System.out.println("It's too high! Try again.");
                }

                attempts++;
            }
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + randomNumber + ".");
            }

            rounds++;
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.equals("yes");
        }

        System.out.println("Game Over!"+ name );
        System.out.println("Rounds played: " + rounds + ", Score: " + score);
    }
}
