import java.util.LinkedList;

public class PrimeCounter {
    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    // Method to count prime numbers in a linked list
    public static int countPrimes(LinkedList<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Create a linked list and populate it with data
        LinkedList<Integer> list = new LinkedList<>();
        list.add(17);
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(15);

        // Count prime numbers in the linked list
        int primeCount = countPrimes(list);

        // Display the result
        System.out.println("Count of prime nodes: " + primeCount);
    }
}


