import java.util.Scanner;

public class Executer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, What's your name?");
        String name = sc.nextLine().trim();
        user user = new user(name);
        Assistant assistant = new Assistant(user);

        while(true){
            System.out.println("*** Checkin Menu ***");
            System.out.println("1. Start Session");
            System.out.println("2. Show Mood History");
            System.out.println("3. Exit");

            String ch = sc.nextLine();

            switch(ch){
                case "1":
                    assistant.startSession(sc);
                    break;
                case "2":
                    assistant.showMoodHistory();
                    break;
                case "3":
                    System.out.println("I hope you had a great session...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}