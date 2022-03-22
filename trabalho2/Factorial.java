import java.util.Scanner;

public class Factorial {

    public static int factorialCalc(int usersNumber) {

        if (usersNumber == 0) {
            return 1;
        }

        return usersNumber * (factorialCalc(usersNumber - 1));

    }

    public static void factorialPrint(int answer, int usersNumber) {
        System.out.print(usersNumber + "! = ");

        for (int i = usersNumber; i > 0; i--) {
            if (usersNumber == 0) {
                System.out.println("1");
            }

            if (i == 1) {
                System.out.print(i);

            } else {
                System.out.print(i + " * ");
            }
        }

        System.out.println(" = " + answer);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usersNumber, answer, usersChoiceController = 1;

        do {

                System.out.println("Informe o número que gostaria de ver o fatorial: ");
                usersNumber = input.nextInt();

                if(usersNumber < 0) {
                    System.out.println("Input inválido, por favor informe um número inteiro positivo.");
                    main(args);
                }

                answer = factorialCalc(usersNumber);
                factorialPrint(answer, usersNumber);

            System.out.println("Você gostaria de inserir outro número? [1]Sim [2]Não");
            usersChoiceController = input.nextInt();

        } while (usersChoiceController == 1);

        input.close();
    }
}
