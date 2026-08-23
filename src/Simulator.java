public class Simulator {
    public static void main(String[] args) {
        Hero dragon = new Hero(new WalkMove());

        System.out.println("The Dragon starts on land:");
        dragon.performMove();

        System.out.println("\nThe Dragon takes flight:");
        dragon.setMovementStrategy(new FlyMove());
        dragon.performMove();

        System.out.println("\nThe Dragon dives into a lake:");
        dragon.setMovementStrategy(new SwimMove());
        dragon.performMove();
    }
}
