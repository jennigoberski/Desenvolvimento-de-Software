import java.util.Random;
import java.util.Scanner;

public class BuscaVetor {
    public static int numbers[] = new int[20];

    public static void numberArraySorter() {
        Random gerador = new Random();

        numbers[0] = gerador.nextInt(101);

        for (int i = 1; i < 20; i++) {

            numbers[i] = gerador.nextInt(101);
            }
            

    }

    public static int verifyUserNumber(int userNumber) {
        int x = numbers[5];

        for (int i = 0; i < 20; i++) {
            if (numbers[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int userNumber, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo entre 0 e 100:");
        userNumber = input.nextInt();

        if (userNumber < 0 || userNumber > 100) {
            System.out.println("Número inválido. Tente novamente.");
            main(args);
        } else {
            numberArraySorter();
            result = verifyUserNumber(userNumber);
            if (result == -1) {
                System.out.println("Esse número não está contido no vetor");
            } else {
                System.out.printf("O número está contido na posição %d do vetor.", result);
            }
        }

        input.close();

    }
}
