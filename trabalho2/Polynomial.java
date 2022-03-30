import java.util.Scanner;

class HornerPolynomial {
   
    static int calculateY(int poly[], int n, int x) {
        int result = poly[0];

        for (int i = 1; i <= n; i++)
            result = result * x + poly[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o grau da função: ");
        int n = input.nextInt();

        int[] poly = new int[n + 1];

        for (int i = 0; i < poly.length; i++) {
            System.out.println("Informe o coeficiente: ");
            poly[i] = input.nextInt();
        }

        System.out.println("Informe o valor de x: ");
        int x = input.nextInt();
        // Let us evaluate value of 2x3 - 6x2 + 2x - 1 for x = 3

        System.out.println("Valor de y é " + calculateY(poly, n, x));

        input.close();
    }
}

