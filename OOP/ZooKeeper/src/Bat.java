public class Bat extends Mammal {
    public Bat() {
        energyLevel = 300;
    }

    public void fly() {
        System.out.println("The bat is airborne!");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("The bat ate a human!");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("The bat attacked a town!");
        energyLevel -= 100;
    }
}
