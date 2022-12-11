import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper & Scissors!");
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.printf("%s, let's see if the luck is on your side today!", name);
        System.out.printf("%nPlease choose [r]ock, [p]aper ot [s]cissors: ");
        String playerMove = scanner.next();

        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = SCISSORS;
        } else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);
        String computerMove = "";

        switch (computerRandomNumber) {
            case 0:
                computerMove = "Rock";
                break;
            case 1:
                computerMove = "Paper";
                break;
            case 2:
                computerMove = "Scissors";
                break;
        }

        System.out.printf("You chose %s and the computer chose %s.%n", playerMove, computerMove);

        if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) || (playerMove.equals(PAPER) && computerMove.equals(ROCK)) || playerMove.equals(SCISSORS) && computerMove.equals(PAPER)) {
            System.out.println("Congrats! You win.");
            System.out.println("Thank you for playing!");

        } else if ((playerMove.equals(ROCK) && computerMove.equals(PAPER)) || (playerMove.equals(PAPER) && computerMove.equals(SCISSORS) || playerMove.equals(SCISSORS) && computerMove.equals(ROCK))) {
            System.out.println("You lose :(");
        } else {
            System.out.println("This game was a draw.");
        }


    }
}