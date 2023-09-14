import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello world!");
        int intOperandA = 2;
        int intOperandB = 4;
        int intSum = 0;
        int intDifference = 0;
        int intProduct = 0;
        int intQuotient = 0;
        int intModulo = 0;

        double doubleOperandA = 6.1;
        double doubleOperandB = 3.2;
        double doubleSum = 0.0;
        double doubleProduct = 0.0;
        double doubleDifference = 0.0;
        double doubleQuotient = 0.0;
        double doubleModul = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of int " + intOperandA + " and " + intOperandB + " is " + intSum);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of int " + intOperandA + " and " + intOperandB + " is " + intDifference);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product of int " + intOperandA + " and " + intOperandB + " is " + intProduct);
        intQuotient = intOperandA/intOperandB;
        System.out.println("The quotient of int " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        intModulo = intOperandB%intOperandA;
        System.out.println("The modulus of int " + intOperandA + " and " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of double " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA*doubleOperandB;
        System.out.println("The product of double " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandA-doubleOperandB;
        System.out.println("The difference of double " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        doubleQuotient = doubleOperandA/doubleOperandB;
        System.out.println("The quotient of double " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        doubleModul = doubleOperandA%doubleOperandB;
        System.out.println("The modulous of double " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModul);

    }
}