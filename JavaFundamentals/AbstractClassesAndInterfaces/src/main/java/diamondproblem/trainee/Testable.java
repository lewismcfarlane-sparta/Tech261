package diamondproblem.trainee;

public interface Testable extends Trainable {
    default void test() {
        System.out.println("Test from Testable");
    }
}
