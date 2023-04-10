import java.util.Scanner;

public class UniqueWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("The unique words in the sentence are:");
        for (int i = 0; i < words.length; i++) {
            boolean seenBefore = false;
        	//int count =0;
            for (int j = 0; j <=i-1; j++) {
                if (words[i].equals(words[j])) {
                    seenBefore = true;
                	//count ++;
                    break;
                }
            }//count ==0 
            if (!seenBefore) {
                System.out.println(words[i]);
            }
        }
    }
}
