public class Phone extends Device {
    public void call() {
        if (battery < 10) {
            System.out.println("battery is too low, please charge your phone");
        } else {
            battery -= 5;
            System.out.printf("making a call...\nremaining battery: %d\n", battery);
        }
    }

    public void play() {
        if (battery < 25) {
            System.out.println("battery is too low, please charge your phone");
        } else {
            battery -= 20;
            System.out.printf("playing a game...\nremaining battery: %d\n", battery);
        }
    }

    public void charge() {
        battery += 50;
        System.out.printf("charging the phone...\nremaining battery: %d\n", battery);
    }
}