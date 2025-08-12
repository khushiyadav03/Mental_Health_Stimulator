public class CalmActivity {
    public void breathingExercise() {
        System.out.println("We will start with breathing excercises. ");
        try {
        for(int i = 0; i<3; i++){
            System.out.println("Breathe in...");
            Thread.sleep(2000); // Simulating 2 seconds of breathing in
            System.out.println("Hold...");
            Thread.sleep(2000); 
            System.out.println("Breathe out...");
            Thread.sleep(2000); // Simulating 2 seconds of breathing out

        }
        } catch (InterruptedException e) {
        e.printStackTrace();
        System.out.println("An error occurred during the breathing exercise.");
        }
        System.out.println("Breathing exercise completed. You should feel more relaxed now.");
    }
    
}