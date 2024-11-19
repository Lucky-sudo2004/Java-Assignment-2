/* 22. Write a java program to create an custom Exception that would handle at least 2 kind of Arithmetic Exceptions while calculating a given equation */

class ArithmeticOperationException extends Exception {
    public ArithmeticOperationException(String message) {
        super(message);
    }
}

public class CustomArithmeticExceptionDemo {

    public static int calculate(String operation, int a, int b) throws ArithmeticOperationException {
        int result = 0;

        try {
            switch (operation) {
                case "divide":
                  if (b == 0) {
                        throw new ArithmeticOperationException("Error: Division by zero is not allowed.");
                    }
                    result = a / b;
                    break;

                case "add":
                    if ((a > 0 && b > Integer.MAX_VALUE - a) || (a < 0 && b < Integer.MIN_VALUE - a)) {
                        throw new ArithmeticOperationException("Error: Integer overflow occurred during addition.");
                    }
                    result = a + b;
                    break;

                default:
                    throw new ArithmeticOperationException("Unsupported operation.");
            }
        } catch (ArithmeticOperationException e) {
            throw e;
        }

        return result;
    }

    public static void main(String[] args) {

        try {

            System.out.println("Result of 10 / 2: " + calculate("divide", 10, 2));


            System.out.println("Result of 10 / 0: " + calculate("divide", 10, 0));

        } catch (ArithmeticOperationException e) {
            System.out.println(e.getMessage());
        }

        try {

            System.out.println("Result of 2147483647 + 1: " + calculate("add", Integer.MAX_VALUE, 1));

        } catch (ArithmeticOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
