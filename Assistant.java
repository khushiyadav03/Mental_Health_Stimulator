import java.util.Scanner;

public class Assistant {
    private user user;
    private QuoteProvider qp;
    private CalmActivity ca;
    private MoodTracker mt;

    Assistant(user user) {
        this.user = user;
        qp = new QuoteProvider();
        ca = new CalmActivity();
        mt = new MoodTracker();
    }

    public void startSession(Scanner sc){
        String mood = mt.askMood(sc, user);
        System.out.println("Logging mood: " + mood);
        user.addMoodHistory(mood);

        qp.getRandomQuote();

        System.out.println("Would you like to do a some exercise? (yes/no)");
        String ans = sc.nextLine().trim().toLowerCase();
        if (ans.equals("yes")) {
            System.out.println("Starting breathing exercise...");
            ca.breathingExercise();
        } else {
            System.out.println("No exercise today. Remember to take care of yourself!");
        }
    }

    public void showMoodHistory() {
        for (String mood : user.getMoodHistory()) {
            System.out.println("- " + mood);
        }
        System.out.println();
    }

}