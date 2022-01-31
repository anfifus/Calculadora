import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String res;
        do {
            System.out.println("Write the operation you want");
            res = askOperation();
            switch (res) {
                case "+" -> addTwoNumbers();
                case "-" -> substractTwoNumbers();
                case "*" -> multiplierTwoNumbers();
                case "/" -> splitTwoNumbers();
                case "exit" -> System.out.println("Exiting calculator...");
            }
        }
        while (!res.equals("exit"));
    }

    private static void splitTwoNumbers() {
        int num1 = askForNumber();
        int num2 = askForNumber();
        printRes(num2 / num1);
    }

    private static void multiplierTwoNumbers() {
        int num1 = askForNumber();
        int num2 = askForNumber();
        printRes(num2 * num1);
    }

    private static String askOperation() {
        return new Scanner(System.in).nextLine();
    }

    private static void substractTwoNumbers() {
        int num1 = askForNumber();
        int num2 = askForNumber();
        printRes(num2 - num1);
    }

    private static void printRes(int result) {
        System.out.println("This is the result of the operation: " + result);
    }

    private static void addTwoNumbers() {
        int num1 = askForNumber();
        int num2 = askForNumber();
        printRes(num2 + num1);
    }

    private static int askForNumber() {
        System.out.println("Write the number");
        return new Scanner(System.in).nextInt();
    }
}
