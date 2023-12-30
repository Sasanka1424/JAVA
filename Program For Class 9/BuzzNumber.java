public class BuzzNumber {
    public static void main(String[] args) {
        // Define the range p to q
        int p = 1;
        int q = 50;

        // Display all buzz numbers between p and q
        System.out.println("Buzz numbers between " + p + " and " + q + ":");
        for (int i = p; i <= q; i++) {
            if (isBuzzNumber(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to check if a number is a buzz number
    private static boolean isBuzzNumber(int num) {
        // Check if the number is divisible by 7 or ends with 7
        return num % 7 == 0 || num % 10 == 7;
    }
}
