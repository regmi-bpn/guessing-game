package GuessingGame;

import javax.swing.*;

import static GuessingGame.GameOperations.determineGuess;

public class GameMain {
    public static void main(String[] args) {
        GameOperations determineGuess = new GameOperations();
        int computerNumber = (int) (Math.random() * 100 + 1);
        int userAnswer = 0;
        int count = 1;

        while (userAnswer != computerNumber) {

            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);

            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerNumber, count));
            count++;
        }



    }
}

