
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

    public static void confirmAction() {
        int playersAnswer;
        Scanner input = new Scanner(System.in);

        System.out.println("E aí, quer jogar? Informe o número da sua opção: ");
        System.out.println("[1]Sim [2]Não");
        playersAnswer = input.nextInt();

        switch (playersAnswer) {
            case 1:
                playersAttempt();
                break;
            case 2:
                System.out.println("Que pena! Talvez outra hora :(");
                System.out.println("---------FIM DE JOGO---------");
                System.out.println("");// separar os diálogos
                break;
            default:
                System.out.println("Não entendi sua resposta :( Tente novamente.");
                System.out.println("");// separar os diálogos
                confirmAction();
                break;
        }
        input.close();
    }

    public static void playersAttempt() {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        int playersNumber, magicNumber, controller = 0;

        magicNumber = gerador.nextInt(101);

        for (int i = 0; i < 10; i++) {
            System.out.println("Essa é a sua " + (i + 1) + "° tentativa!");
            System.out.println("Insira o seu palpite: ");
            playersNumber = input.nextInt();

            if (playersNumber < 0 || playersNumber > 100) {
                System.out.println("Calma lá amigão, insira números de 0 a 100!");
                i -= 1;
            } else {
                controller = compareNumbers(playersNumber, magicNumber);

            }
            if (controller == 1) {
                i = 10;
            }

            if (controller != 1 && i == 9) {
                System.out.println("Que pena, você perdeu :( O número mágico era " + magicNumber);
                System.out.println("");// separar os diálogos
                confirmAction();
            }
        }

        input.close();
    }

    public static int compareNumbers(int playersNumber, int magicNumber) {
        int controller = 0;

        if (magicNumber != playersNumber) {
            System.out.println("Que pena, você errou :(");
            hints(playersNumber, magicNumber);
            System.out.println("");// separar os diálogos
        } else {
            System.out.println("Parabéns! Você acertou o número mágico!");
            System.out.println("---------FIM DE JOGO---------");
            System.out.println("");// separar os diálogos
            controller = 1;
            confirmAction();
        }

        return controller;
    }

    public static void hints(int playersNumber, int magicNumber) {

        if (playersNumber < magicNumber) {
            System.out.println("Dica: O número mágico é maior!");
        } else {
            System.out.println("Dica: O número mágico é menor!");
        }

    }

    public static void main(String[] args) {
        System.out.println("Bem vindo jogador! Que tal jogar um jogo comigo?");
        System.out.println("As regras são simples: você tem dez tentativas para acertar o número mágico!");
        System.out.println(
                "Lembrando que o número mágico é um número inteiro positivo entre 0 e 100 (extremos inclusos!)");
        System.out.println("Parece difícil? Mas não se preocupe, eu vou te dar algumas dicas ao longo do jogo ;)");
        System.out.println("");// separar os diálogos

        confirmAction();
    }
}
