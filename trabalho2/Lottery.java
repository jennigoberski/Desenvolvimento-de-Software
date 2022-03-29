import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static int userNumbers[] = new int[6];
    public static int lotteryNumbers[] = new int[6];

    public static void sortNumbers() {
        Random gerador = new Random();
        int aux, aux2, id = 2;

        for (int i = 0; i < lotteryNumbers.length; i++) {

            do {
                aux = 1 + gerador.nextInt(60);
                aux2 = verifyEqualNumber(aux, id);

                if (verifyEqualNumber(aux, id) == -1) {
                    lotteryNumbers[i] = aux;
                }

            } while (aux2 > 0);
        }
    }

    public static void compareNumbers() {
        int controller = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (userNumbers[i] == lotteryNumbers[j]) {
                    controller++;
                }
            }
        }

        switch (controller) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Que pena! Você não ganhou nenhum prêmio.");
                break;

            case 4:
                System.out.println("Parabéns! Você teve 4 acertos, e ganhou R$ 50.000,00!");
                break;

            case 5:
                System.out.println("Parabéns! Você teve 5 acertos, e ganhou R$ 250.000,00!");
                break;

            case 6:
                System.out.println("Parabéns! Você teve 6 acertos, e ganhou  R$ 1.000.000,00!");
                break;
        }
    }

    public static int verifyEqualNumber(int aux, int id) {

        if (id == 1) {
            for (int i = 0; i < userNumbers.length; i++) {
                if (userNumbers[i] == aux) {
                    return 1;
                }
            }
        } else if (id == 2) {
            for (int i = 0; i < lotteryNumbers.length; i++) {
                if (lotteryNumbers[i] == aux) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aux, id = 1;

        for (int i = 0; i < 6; i++) {
            int result;

            System.out.printf("\nInforme o %d° número de 1 a 60 que deseja jogar: \n", i + 1);
            aux = input.nextInt();

            if (aux < 1 || aux > 60) {
                System.out.println("Número inválido, informe números de 1 a 60.");
                if (i != 0) {
                    i--;
                } else {
                    main(args);
                }
            }

            result = verifyEqualNumber(aux, id);

            if (result == -1) {
                userNumbers[i] = aux;
            } else {
                i--;
            }

        }

        sortNumbers();

        compareNumbers();

        input.close();
    }

}
