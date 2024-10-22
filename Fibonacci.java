public class Fibonacci {
    public static void main(String[] args) {
        if (args.length < 1)
        {
            System.out.println("Please enter a valid integer.");
            return;
        }
        else if (args.length > 1)
        {
            System.out.println("Too many arguements");
            return;
        }

        int num = Integer.parseInt(args[0]);
        System.out.println(fibonacci(num));
    }
    
    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}