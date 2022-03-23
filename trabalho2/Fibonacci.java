package trabalho2;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacciPrinter(int n) {
        int n1 = 0, n2 = 1;
        int n3;

        System.out.println("A sequência de Fibonacci até o n-ésimo termo é: ");

        if(n == 0) {
            System.out.print(n1 + " ");

        } else if (n == 1) {
            System.out.print(n2 + " ");

        } else {
            System.out.print(n1 + " ");
            System.out.print(n2 + " ");

            for (int i = 0; i < n; i++) {
                n3 = n1 + n2;
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int n, usersChoiceController = 1;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Informe o n-ésimo termo da sequência de Fibonacci que deseja: ");
            n = input.nextInt();

            if (n < 0) {
                System.out.println("Input inválido. Por favor informe um número inteiro positivo.");
                main(args);
            }
            fibonacciPrinter(n);

            System.out.println("\nVocê gostaria de inserir outro número? [1]Sim [2]Não");
            usersChoiceController = input.nextInt();

        } while (usersChoiceController == 1);

        input.close();
    }
}
