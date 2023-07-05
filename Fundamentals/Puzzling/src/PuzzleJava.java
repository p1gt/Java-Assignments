import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randomRolls = new ArrayList<>();
        Random randMachine = new Random();
        for (int i = 0; i < 10; i++) {
            randomRolls.add(randMachine.nextInt(20) + 1);
        }
        return randomRolls;
    }

    public char getRandomLetter() {
        Random randMachine = new Random();
        char randomLetter = (char) (randMachine.nextInt(26) + 'a');
        return randomLetter;
    }

    public String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> newPasswordSet = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            newPasswordSet.add(generatePassword());
        }
        return newPasswordSet;
    }

    public void shuffleArray(int[] array) {
        Random randMachine = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = randMachine.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}