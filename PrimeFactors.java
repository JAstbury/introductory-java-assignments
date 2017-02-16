/**
 * Created by jessastbury on 15/02/2017.
 */
import java.util.*;

public class PrimeFactors {

    public static void main(String [] args) {
        System.out.print(generate(30));
    }

    public static ArrayList<Integer> generate(int num) {

        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        for(int i = 2; i <= num; i++) {
            if (num % i == 0) {
                primeFactors.add(i);
                num /= i;
            }
        }
        return primeFactors;
    }
}
