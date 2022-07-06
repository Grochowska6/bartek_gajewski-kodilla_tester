public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 12;
        int secondNumber = 11;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        } else {
            sumAndDisplay(firstNumber, secondNumber);
        }
        if (firstNumber > secondNumber) {
            sumAndDisplay(firstNumber, secondNumber);
        }
        if (firstNumber > secondNumber) {

            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (firstNumber == secondNumber) {

            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (firstNumber < secondNumber) {
            System.out.println("true");
        }
        else {
            System.out.println("false");}


    }

    private static void sumAndDisplay(int a, int b) {
        int result = a + b;

        System.out.println(result);
        int firstNumber = 11;
        int secondNumber = 22;

    }

    private static void subtractAndDisplay(int a, int b) {
        int result = ( a - b);

        System.out.println(result);
    }
}