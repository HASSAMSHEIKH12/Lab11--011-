public class NumberUtils {

    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public int factorial(int num) {
        if (num < 0)
            return -1;

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
