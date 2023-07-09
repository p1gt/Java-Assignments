public class Phone extends Device {
    public void call() {
        battery -= 5;
        System.out.printf("making a call...\nremaining battery: %d\n", battery);
    }

    public void play() {
        battery -= 20;
        System.out.printf("playing a game...\nremaining battery: %d\n", battery);
    }

    public void charge() {
        battery += 50;
        System.out.printf("charging the phone...\nremaining battery: %d\n", battery);
    }
}