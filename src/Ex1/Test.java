package Ex1;

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

import java.security.SecureRandom;

public class Test {
    private Question[] questions;

    public Test(Question[] questions) {
        this.questions = questions;
    }

    private void startTest(){
        for (Question question: questions) {
            simulateQuestion();
            char answer = inputAnswer();
            generateMessage(question, checkAnswer(question, answer));
        }
    }

    private void simulateQuestion(){
        //show question here

    }
    private Boolean checkAnswer(Question question, char answer){
        //check if answer is correct

        return true;
    }

    //generates message depending on whether user's action was right or wrong;
    private String generateMessage(Question question, Boolean isCorrect){
        SecureRandom randomNumber = new SecureRandom();
        String message = "";
        switch (randomNumber.nextInt(4) )
        {
            case 0:
                message = (isCorrect ?
                        "Very good!" :
                        String.format("The correct answer was %s", question.getCorrectAnswerString()));
                break;
            case 1:
                message = (isCorrect ?
                        "Excellent!" :
                        String.format("You should have answered %s", question.getCorrectAnswerString()));
                break;
            case 2:
                message = (isCorrect ?
                        "Well done!" :
                        String.format("No. The answer was &s. Try again!", question.getCorrectAnswerString()));
                break;
            case 3:
                message = (isCorrect ?
                        "Skillful!" :
                        String.format("You chose wrongly. Answer %s next time", question.getCorrectAnswerString()));
                break;
            default:
                break;
        }
        return message;
    }

    private char inputAnswer(){
        return 'a';
    }

}
