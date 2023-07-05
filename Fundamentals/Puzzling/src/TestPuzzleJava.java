import java.util.ArrayList;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        char randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        String randomPassword = generator.generatePassword();
        System.out.println(randomPassword);
        
        ArrayList<String> newPasswordSet = generator.getNewPasswordSet(8);
        System.out.println(newPasswordSet);

        int[] array = {0,1,5,2,6,3,7,4,8,9};
        generator.shuffleArray(array);
        System.out.println(java.util.Arrays.toString(array));
    }
}