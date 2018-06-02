package exercise1;

public class TestDriver {
    public static void main(String[] args) {
        Test test = createSampleTest();
        test.startTest();
    }

    public static Test createSampleTest() {
        //create questions
        Question question1 = new Question(
                "Which is not true regarding machine languages?",
                new String[]{
                        "Machine languages are easily readable", "" +
                        "It is the lowest level language",
                        "The design of the hardware defines the machine language",
                        "Programming through machine language is too slow"},
                "a");
        Question question2 = new Question(
                "What is not an example of an IDE?",
                new String[]{
                        "IntelliJ",
                        "Github",
                        "Microsoft Visual Studio 2017",
                        "Eclipse"},
                "b");
        Question question3 = new Question(
                "Consider the method with function header: public static void talk(). Which of the following is true?",
                new String[]{
                        "The method returns a String object",
                        "The method takes a String argument",
                        "Another static method in the same class can call this method",
                        "You don't need to use a qualified name to call the method talk() outside the class"},
                "c");
        Question question4 = new Question(
                "Which of the following employs the correct usage of a camel case?",
                new String[]{
                        "camel_case",
                        "c-a-m-e-l-c-a-s-e",
                        "c4m3lc453RuLz",
                        "camelCase"},
                "d");
        Question question5 = new Question(
                "Every object has a constructor automatically created by default, and this is called the _____.",
                new String[]{
                        "default constructor",
                        "new constructor",
                        "automatic constructor",
                        "boa constructor"},
                "a");

        //compile questions into test
        Question[] questions = new Question[]{question1,question2,question3,question4, question5};
        Test test = new Test(questions);
        return test;
    }
}
