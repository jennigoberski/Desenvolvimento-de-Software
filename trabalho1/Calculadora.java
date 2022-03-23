package trabalho1;

import java.util.Scanner;

class Calculadora {
    public static int soma(int a, int b) {
        return a+b;
    }

    public static int subtracao(int a, int b) {
        return a-b;
		}

    public static int multiplicacao(int a, int b) {
        return a*b;
    }

    public static float divisao(int a, int b) {
        float result = ((float)a/b);
        return result;
    }

    public static void main(String args[]) {
    int a, b;
    Scanner entrada = new Scanner(System.in);

     System.out.print("Informe um número inteiro: ");
     a = entrada.nextInt();

     System.out.print("Informe outro número inteiro: ");
     b = entrada.nextInt();

     System.out.printf("A soma é %d \n", soma(a,b));
     System.out.printf("A subtração é %d \n", subtracao(a,b));
     System.out.printf("A multiplicação é %d \n", multiplicacao(a,b));
     System.out.printf("A divisão é %.2f", divisao(a,b));
     
     entrada.close();

    }
}
