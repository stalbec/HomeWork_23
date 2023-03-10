import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<Integer> oddDigits = new ArrayList<>();
        ArrayList<Integer> evenDigits = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int digit = random.nextInt(100) + 1;
            digits.add(digit);
        }
        for (int digit : digits) {
            if (digit % 2 == 0) {
                evenDigits.add(digit);
            } else {
                oddDigits.add(digit);
            }
        }
        System.out.println("All digits:  ");
        System.out.println(digits);
        System.out.println("Odd digits:  ");
        System.out.println(oddDigits);
        System.out.println("Even digits:  ");
        System.out.println(evenDigits);


    }
}