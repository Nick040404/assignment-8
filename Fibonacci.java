public class Fibonacci {
    public static void main(String[] args) {
        // If no number arguement
        if (args.length < 1) {
            System.out.println("Please enter a valid integer.");
            return;
        }
        // If too many arguements
        else if (args.length > 1) {
            System.out.println("Too many arguements");
            return;
        }

        // Turn string into valid int
        int num = Integer.parseInt(args[0]);
        System.out.println(fibonacci(num));
    }
    
    public static int fibonacci(int num) {
        // Base case for 0
        if (num == 0) {
            return 0;
        }
        // Base case for 1
        if (num == 1) {
            return 1;
        }

        // Recursion
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}