public class FizzBuzz {
    public static void printNumbers(Integer number) {
        for (int i=1; i<=number; i++) {
            Boolean fizzOrBuzz = false;
            if (i%3 == 0) {
                System.out.print("Fizz");
                fizzOrBuzz = true;
            }
            if (i%5 == 0) {
                System.out.print("Buzz");
                fizzOrBuzz = true;
            }
            if (fizzOrBuzz == false) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
