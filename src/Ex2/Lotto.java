package Ex2;
/*
 * Design a Lotto class with one array instance variable to hold three random integer values (from 1 to 9).
 * Include a constructor that randomly populates the array for a lotto object. Also, include a method in the class
 * to return the array.
 *
 * Use this class to simulate a simple lotto game in which the user chooses a number between 3 and 27.
 * The user runs the lotto up to 5 times and each time the sum of lotto numbers is calculated.
 * If the number chosen by the user matches the sum, the user wins and the game ends.
 * If the number does not match the sum within five rolls, the computer wins.
 * Use methods of JOptionPane class to interact with the user.
 */

import java.security.SecureRandom;

public class Lotto {
    //Create RNG
    public static final SecureRandom randomNumber = new SecureRandom();

    //getter function that returns the lotto array
    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    //array of lotto numbers
    private int[] lottoNumbers = new int[3];

    public Lotto() {
        lottoNumbers[0] = randomNumber.nextInt(9) + 1;
        lottoNumbers[1] = randomNumber.nextInt(9) + 1;
        lottoNumbers[2] = randomNumber.nextInt(9) + 1;
    }


    public int winningLottoNumber(){
        return lottoNumbers[0] + lottoNumbers[1] + lottoNumbers[2];
    }
}
