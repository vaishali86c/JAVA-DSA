package Assignment;

public class EligibalForVote {
    public static void main(String[] args) {
        eligibalforvote(12);
    }

    static void eligibalforvote(int age) {
        if (age <= 18) {
            System.out.println(" you are not eligibal for vote");
        }
        else {
            System.out.println("you are eligibal for vote");
        }
    }
}
