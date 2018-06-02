package exercise2;

import javax.swing.*;

public class LottoDriver {
    public static void main(String[] args) {
        boolean askNumberAgain = true;
        int userGuess = 0;

        //i want to ask the user until a valid number is given
        while (askNumberAgain) {
            try {
                userGuess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number from 3-27."));

                if (userGuess < 3 || userGuess > 27) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Your guess should be between 3 and 27. You will be asked to guess again.");
                } else {
                    askNumberAgain = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Your guess should be a number. You will be asked to guess again.");
            }
        }

        //set titles
        JFrame frame = new JFrame();
        frame.setTitle("Your guess was" + userGuess);

        //start lotto loop. this will only loop at most 5 times
        for (int i = 1; i < 6; i++) {
            //create lotto object
            Lotto lotto = new Lotto();

            //show draw details
            JOptionPane.showMessageDialog(frame, String.format("Draw %d:%n%s", i, lotto));

            //if win, show win condition, and end program
            if (lotto.retrieveLottoSum() == userGuess){
                JOptionPane.showMessageDialog(frame, "Congratulations! You won!");
                return;
            }
        }

        //if loop ends, then user was not able to win and therefore user loses
        JOptionPane.showMessageDialog(frame, "Sorry! You lost...");
    }
}
