package exercise1;

public class Question {
    private String question;
    private String[] options;
    private String correctAnswer;

    //creates a question object
    //correct answer corresponds to element in the options array in which the answer is correct
    public Question(String question, String[] options, String correctAnswer) {
        //there should only be four options
        if (options.length != 4)
            throw new IllegalArgumentException("There should only be four options");

        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    //getters
    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer.toLowerCase(); //only checks for lowercase
    }

    public String toString(){
        //start question
        String message = this.getQuestion() + "\n";
        //retrieve options and show in a nice format
        String[] options = this.getOptions();
        for (int i = 0; i < options.length; i++) {
            //show all options. note that int 65-68 corresponds to char a-d
            message += String.format("%c) %s%n", (char)(i+65), options[i]);
        }
        return message;
    }
}
