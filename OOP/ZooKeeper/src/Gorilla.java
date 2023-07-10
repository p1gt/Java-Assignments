public class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("The gorilla has thrown something!");
        energyLevel -= 5;
    }

    public void eatBanana() {
        System.out.println("The gorilla ate a banana!");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("The gorilla has climbed a tree!");
        energyLevel -= 10;
    }
}
