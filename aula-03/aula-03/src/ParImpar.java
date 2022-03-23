import java.util.Scanner;

public class ParImpar {

    public static String verifyOddOrEven(int userNumber) {
        if (userNumber % 2 == 0) {
            return "par";
        } else {
            return "ímpar";
        }
    }

    public static void main(String[] args) {
        int userNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        userNumber = input.nextInt();

        if(userNumber > 0) {
            System.out.println("O número " + userNumber + " é " + verifyOddOrEven(userNumber));
            System.out.println("");
        } else {
            input.close();
            return;
        }

        do {
            System.out.println("Informe um número inteiro: ");
            userNumber = input.nextInt();

            System.out.println("O número " + userNumber + " é " + verifyOddOrEven(userNumber));
            System.out.println("");

        } while (userNumber >= 0);

        input.close();
    }
}