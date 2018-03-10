public class FizzBuzz {
    public static void FizzBuzz() {
        for (int i=1; i<=100; i++) {
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
