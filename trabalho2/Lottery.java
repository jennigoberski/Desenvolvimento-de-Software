import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static int userNumbers[] = new int[6];
    public static int lotteryNumbers[] = new int[6];

    public static void sortNumbers() {
        Random gerador = new Random();
        int aux, aux2;

        // sorteando números da loteria
        for (int i = 0; i < 6; i++) {
            lotteryNumbers[i] = 1 + gerador.nextInt(60);

            System.out.print(lotteryNumbers[i] + " ");
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aux = 0;

        // todo: garantir que não tenha repetições
        sortNumbers();
        // Coletando os números do usuário
        for (int i = 0; i < 6; i++) {
            System.out.printf("Informe o %d número de 1 a 60 que deseja jogar: \n", i + 1);
            userNumbers[i] = input.nextInt();

            if (userNumbers[i] < 1 || userNumbers[i] > 60) {
                System.out.println("Número inválido, informe números de 1 a 60.");
                i--;
            }

            /*
             * for(int j=i+1;j<6;j++) {
             * if(aux == lotteryNumbers[j]){
             * i--;
             * } else {
             * lotteryNumbers[i] = aux;
             * }
             * }
             */
        }

        compareNumbers();

        input.close();
    }
}
