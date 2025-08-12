import java.util.Scanner;

public class MoodTracker {
    public String askMood(Scanner sc, user user){
        System.out.println("Hey" + ", " + user.getName() + "How are you feeling today?");
        System.out.println("Options: Happy, Sad, Angry, Anxious, Excited, Calm, Tired, Overwhelmed");
        System.out.println("Your mood: ");
        String mood = sc.nextLine();
        return mood;

    }
}
