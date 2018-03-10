import java.util.ArrayList;

public class PrimeFactors {
    public static ArrayList<Integer> generate(Integer number) {
        ArrayList<Integer> primeFactors = new ArrayList();
        for (int i=2; i<= number; i++) {
            if (number % i == 0) {
                boolean factorIsPrime = true;
                for (int factor : primeFactors) {
                    if (i % factor == 0) {
                        factorIsPrime = false;
                    }
                }
                if (factorIsPrime) {
                    primeFactors.add(i);
                }
            }
        }
        return primeFactors;
    }
}
