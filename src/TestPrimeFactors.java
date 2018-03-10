import java.util.ArrayList;

public class TestPrimeFactors {
    public static void main (String[] args) {
        testPrimeFactorsWithOne();
        testPrimeFactorsWithPrime();
        testPrimeFactorsWithMultipleFactors();
    }

    public static void testPrimeFactorsWithOne() {
        ArrayList<Integer> factors = PrimeFactors.generate(1);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        System.out.print("Test prime factors with 1 ");
        if (factors.equals(expected)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }

    public static void testPrimeFactorsWithPrime() {
        ArrayList<Integer> factors = PrimeFactors.generate(19);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(19);
        System.out.print("Test prime factors with prime ");
        if (factors.equals(expected)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }

    public static void testPrimeFactorsWithMultipleFactors() {
        ArrayList<Integer> factors = PrimeFactors.generate(30);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        System.out.print("Test prime factors with multiple factors ");
        if (factors.equals(expected)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }
}

