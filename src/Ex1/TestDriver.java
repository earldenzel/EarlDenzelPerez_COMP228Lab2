package Ex1;

public class TestDriver {
    public static void main(String[] args) {
        Test test = createSampleTest();
        test.startTest();
    }

    public static Test createSampleTest() {
        //create questions
        Question question1 = new Question(
                "q1",
                new String[]{"a", "b", "c", "d"},
                "a");
        Question question2 = new Question(
                "q2",
                new String[]{"a", "b", "c", "d"},
                "b");
        Question question3 = new Question(
                "q3",
                new String[]{"a", "b", "c", "d"},
                "c");
        Question question4 = new Question(
                "q4",
                new String[]{"a", "b", "c", "d"},
                "d");
        Question question5 = new Question(
                "q5",
                new String[]{"a", "b", "c", "d"},
                "a");

        //compile questions into test
        Question[] questions = new Question[]{question1,question2,question3,question4, question5};
        Test test = new Test(questions);
        return test;
    }
}
