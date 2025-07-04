public class Question {
    String question;
    String[] options;
    char correctAnswer;

    public Question(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(char userAnswer) {
        return Character.toUpperCase(userAnswer) == Character.toUpperCase(correctAnswer);
    }

    public void display() {
        System.out.println(question);
        char optionLabel = 'A';
        for (String option : options) {
            System.out.println(optionLabel + ". " + option);
            optionLabel++;
        }
    }
}
