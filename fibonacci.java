import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> generateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a natural number greater than 0.");
        }

        List<Integer> fibonacciNumbers = new ArrayList<>();
      
        if (n >= 1) {
            fibonacciNumbers.add(0);
        }
        
        if (n >= 2) {
            fibonacciNumbers.add(1);
        }

        for (int i = 2; i < n; i++) {
            int nextFib = fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2);
            fibonacciNumbers.add(nextFib);
        }

        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        try {
            int n = 10; // Пример входного значения
            List<Integer> fibNumbers = generateFibonacci(n);
            System.out.println("Первые " + n + " числа Фибоначчи: " + fibNumbers);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
