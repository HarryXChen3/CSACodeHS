package codehs.unit_5._7;

import java.util.*;

public class Exercise_5_7_6 {
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";

    private static final List<String> choices = Arrays.asList("rock", "paper", "scissors");
    private static final Map<String, String> winningConditions = makeWinningConditions();

    public static Map<String, String> makeWinningConditions() {
        final Map<String, String> result = new HashMap<>(3);
        result.put("rock", "scissors");
        result.put("paper", "rock");
        result.put("scissors", "paper");
        return result;
    }

    public static String getWinner(final String user, final String computer) {
        if (computer.equalsIgnoreCase(user)) {
            return TIE;
        } else if (computer.equalsIgnoreCase(winningConditions.get(user))) {
            return USER_PLAYER;
        } else {
            return COMPUTER_PLAYER;
        }
    }

    public static class Randomizer {
        public static int nextInt() {
            return nextInt(1, 10);
        }

        public static int nextInt(final int min, final int max) {
            return (int)(Math.random() * ((max - min) + 1) + min);
        }
    }

    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice (rock, paper, or scissors):");
            final String inputChoice = inputScanner.nextLine();
            if (!choices.contains(inputChoice.toLowerCase()))
                continue;

            final String computerChoice = choices.get(Randomizer.nextInt(0, choices.size() - 1));


            System.out.println("User: " + inputChoice);
            System.out.println("Computer: " + computerChoice);

            final String winner = getWinner(inputChoice, computerChoice);
            System.out.println(winner);
            if (USER_PLAYER.equals(winner))
                break;
        }
    }
}
