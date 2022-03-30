import java.util.Scanner;

public class Polynomial {

    static int calculateY(int poly[], int n, int x) {
        int result = poly[0];

        for (int i = 1; i <= n; i++) {
            result = result * x + poly[i];
        }
        return result;
    }

    static int calculateYLinha(int poly[], int n, int x) {
        int derivative[] = new int[poly.length - 1];

        for (int i = 0; i < derivative.length; i++) {
            derivative[i] = poly[i] * (poly.length - 1 - i);
        }

        int result = 1, soma = 0;

        for (int i = 0; i < derivative.length; i++) {
            if (i == derivative.length - 1) {
                soma += derivative[i];
            } else {
                result = (derivative[i] * x);
                soma += result;
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o grau da função: ");
        int n = input.nextInt();

        int[] poly = new int[n + 1];

        for (int i = 0; i < poly.length; i++) {
            System.out.println("Informe o " + (i + 1) + " coeficiente: ");
            poly[i] = input.nextInt();
        }

        System.out.println("Informe o valor de x: ");
        int x = input.nextInt();

        System.out.println("Valor de y é " + calculateY(poly, n, x));
        System.out.println("Valor de y' é " + calculateYLinha(poly, n, x));

        input.close();
    }
}