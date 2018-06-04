package exercise1;

/*
* Write a Java application that simulates a test.
* The test contains at least five questions about first three lectures of this course.
* Each question should be a multiple-choice question with 4 options.
*
* Design a Test class. Use programmer-defined methods to implement your solution. For example:
* -	create a method to simulate the questions – simulateQuestion
* -	create a method to check the answer – checkAnswer
* -	create a method to display a random message for the user – generateMessage
* -	create a method to interact with the user - inputAnswer
*
* Display the questions using methods of JOptionPane class. Use a loop to show all the questions.
*
* For each question:
* -	If the user finds the right answer, display a random congratulatory message
* (“Excellent!”,”Good!”,”Keep up the good work!”, or “Nice work!”).
* -	If the user responds incorrectly, display an appropriate message and the correct answer
* (“No. Please try again”, “Wrong. Try once more”, “Don't give up!”, “No. Keep trying..”).
* -	Use random-number generation to choose a number from 1 to 4 that will be used to select an appropriate response to each answer.
-	Use a switch statement to issue the responses, as in the following code:
switch ( randomObject.nextInt( 4 ) )
{
case 0:
return( "Very good!" );
……
}
* At the end of the test display the number of correct and incorrect answers, and the percentage of the correct answers.
* Your main driver class will simply create a Test object and start the test by calling startTest method.
*/

import javax.swing.*;
import java.security.SecureRandom;

public class Test {
    private Question[] questions;
    private int score;

    //constructor
    public Test(Question[] questions) {
        this.questions = questions;
        score = 0;
    }

    //starts the test
    public void startTest(){
        JOptionPane.showMessageDialog(null,"Test starts!");
        for (Question question: questions) {
            inputAnswer(question);
        }
        JOptionPane.showMessageDialog(null, showGrade());
    }

    public String showGrade(){
        return String.format("You answered %d questions correctly out of %d questions. Your grade is %.2f%%",
                score,
                questions.length,
                (double)score*100/(double)questions.length);
    }

    //show question and asks for user input, and terminates once the user answers correctly
    private void inputAnswer(Question question){
        boolean userAnswersCorrectly;
        int attempt = 0;
        //show current question here
        do {
            attempt++;
            String answer = JOptionPane.showInputDialog(
                    null,
                    simulateQuestion(question),
                    "Please input the letter of the correct answer",
                    JOptionPane.PLAIN_MESSAGE);
            userAnswersCorrectly = checkAnswer(question, answer);
            generateMessage(attempt, userAnswersCorrectly);

        } while (!userAnswersCorrectly);
    }

    //prints question in a string format
    private String simulateQuestion(Question question){
        return String.format("%s", question);
    }

    //checks if answer is the same as the answer string
    private boolean checkAnswer(Question question, String answer){
        return (answer.toLowerCase().equals(question.getCorrectAnswer()));
    }

    //generates message depending on whether user's answer was right or wrong;
    private void generateMessage(int attempt, Boolean isCorrect){
        SecureRandom randomNumber = new SecureRandom();
        String message = "";
        switch (randomNumber.nextInt(4) )
        {
            case 0:
                message = (isCorrect ?
                        "Very good!" :
                        "Try again!");
                break;
            case 1:
                message = (isCorrect ?
                        "Excellent!" :
                        "You have another chance to answer correctly");
                break;
            case 2:
                message = (isCorrect ?
                        "Well done!" :
                        "That was not the correct answer. Keep going!");
                break;
            case 3:
                message = (isCorrect ?
                        "Skillful!" :
                        "Don't give up. You can do this");
                break;
            default:
                break;
        }
        if (attempt == 1 && isCorrect) score++;
        JOptionPane.showMessageDialog(null, message);
    }
}
