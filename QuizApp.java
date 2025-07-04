import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 'C'));

        questions.add(new Question("Which language is used for Android development?",
                new String[]{"Python", "Java", "C#", "Swift"}, 'B'));

        questions.add(new Question("What is 10 + 20?",
                new String[]{"30", "25", "20", "10"}, 'A'));

        questions.add(new Question("Which planet is known as the Red Planet?",
                new String[]{"Earth", "Venus", "Mars", "Jupiter"}, 'C'));

        questions.add(new Question("Which company created Java?",
                new String[]{"Microsoft", "Google", "Sun Microsystems", "Apple"}, 'C'));

        int score = 0;

        System.out.println("🧠 Welcome to the Java Console Quiz!\n");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Question " + (i + 1) + ":");
            questions.get(i).display();
            System.out.print("Your answer (A/B/C/D): ");
            char answer = scanner.next().charAt(0);

            if (questions.get(i).isCorrect(answer)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + questions.get(i).correctAnswer + "\n");
            }
        }

        System.out.println("🎉 Quiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.size());

        if (score == questions.size()) {
            System.out.println("🏆 Excellent!");
        } else if (score >= 3) {
            System.out.println("👍 Good Job!");
        } else {
            System.out.println("📘 Keep Practicing!");
        }

        scanner.close();
    }
}
