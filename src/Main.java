public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the registration number: ");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long n = scanner.nextLong();

        if (isProbableTopperNumber(n)) {
            System.out.println(n + " is a Probable Topper Number!");
        } else {
            System.out.println(n + " is not a Probable Topper Number.");
        }
    }

    public static boolean isProbableTopperNumber(long n) {
        // Convert the number to a string to iterate through its digits
        String numStr = Long.toString(n);

        // Initialize sums for odd and even digits
        int sumOdd = 0;
        int sumEven = 0;

        // Iterate through each digit
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));

            // Check if the digit is even or odd and update the corresponding sum
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
        }

        // If sums of even and odd digits are equal, it's a Probable Topper Number
        return sumEven == sumOdd;
    }
}
