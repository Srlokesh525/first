import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Create a copy of the original array
        int[] shuffledArray = Arrays.copyOf(originalArray, originalArray.length);

        // Shuffle the array
        shuffleArray(shuffledArray);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }

    // Shuffle the array using the Fisher-Yates algorithm
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
