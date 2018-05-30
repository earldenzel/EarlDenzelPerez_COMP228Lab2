package Ex1;

public class Question {
    private String question;
    private String[] options;
    private int correctAnswer;

    //creates a question object
    //correct answer corresponds to element in the options array in which the answer is correct
    public Question(String question, String[] options, int correctAnswer) {
        //there should only be four options
        if (options.length != 4)
            return; // or throw exception
        //correct answer number should be 0, 1, 2 or 3 as it corresponds to the options array
        if (correctAnswer > 3 || correctAnswer < 0)
            return; // or throw exception

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

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
