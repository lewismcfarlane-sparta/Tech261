package diamondproblem.trainee;

public interface Trainable {
    void train();
    void study();

    default void test() {
        System.out.println("Test from Trainable");
    };
}
