package Ex2;

import javax.swing.*;

public class LottoDriver {
    public static void main(String[] args) {
        boolean askNumberAgain = true;
        int userGuess;

        //i want to ask the user until a valid number is given
        while (askNumberAgain) {
            try {
                userGuess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number from 3-27."));

                if (userGuess < 3 || userGuess > 27){
                    JOptionPane.showMessageDialog(
                            null,
                            "Your guess should be between 3 and 27. You will be asked to guess again.");
                }
                else{
                    askNumberAgain = false;
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Your guess should be a number. You will be asked to guess again.");
            }
        }

    }
}
