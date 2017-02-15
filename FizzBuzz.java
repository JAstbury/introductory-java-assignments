/**
 * Created by jessastbury on 15/02/2017.
 */
public class FizzBuzz {
    public static void main(String [] args) {
        FizzBuzz f = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            f.play(i);
        }
    }

    public void play(int num) {
        if (divisibleByFifteen(num)) {
            System.out.print("FizzBuzz");
        }
        else if (divisibleByFive(num)) {
            System.out.print("Fizz");
        }
        else if (divisibleByThree(num)) {
            System.out.print("Buzz");
        }
        else {
            System.out.print(num);
        }
        System.out.println();
    }

    private boolean divisibleByFifteen(int num) {
        return num % 15 == 0;
    }

    private boolean divisibleByFive(int num) {
        return num % 5 == 0;
    }

    private boolean divisibleByThree(int num) {
        return num % 3 == 0;
    }
}
