public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Using iterative: " + findFactorialIterative(5));
        System.out.println("Using recursive: " + findFactorialRecursive(5));
    }

    public static int findFactorialRecursive(int number) {
        if (number == 2) {
            return 2;
        }
        return number * findFactorialRecursive(number - 1);
    }

    public static int findFactorialIterative(int number) {
        int factorialResult = 1;
        for (int i = 2; i < number + 1; i++) {
            factorialResult = factorialResult * i;
        }
        return factorialResult;
    }
}