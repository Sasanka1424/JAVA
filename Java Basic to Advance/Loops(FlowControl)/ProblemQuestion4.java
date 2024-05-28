/*Q4. Print Square pattern.  */
public class ProblemQuestion4 {
    public static void main(String[] args) {
        int n = 4; // Size of the square pattern

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for the number of columns
            for (int j = 1; j <= n; j++) {
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
