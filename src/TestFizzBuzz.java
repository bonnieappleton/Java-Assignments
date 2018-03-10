public class TestFizzBuzz {

    public static void main (String[] args) {
        testFizzBuzz();
    }

    public static void testFizzBuzz() {
        System.out.println(
                "Output should be numbers 1-100 with 'Fizz' instead of multiples of 3 and "
                + "'Buzz' instead of multiples of 5"
        );
        FizzBuzz.FizzBuzz();
    }
}
