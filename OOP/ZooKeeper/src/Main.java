public class Main {
    public static void main(String[] args) {
        // Gorilla test
        Gorilla gorilla = new Gorilla();

        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.eatBanana();
        gorilla.eatBanana();
        gorilla.climb();
        gorilla.displayEnergy();

        // Bat test
        Bat bat = new Bat();

        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.displayEnergy();
    }
}
