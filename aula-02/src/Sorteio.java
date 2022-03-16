import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {
        int i=1, soma=0, minimo, maximo, numero=0;
        float media;
        Random gerador = new Random();

        numero = gerador.nextInt(101);
        maximo = numero;
        minimo = numero;

        while (i < 1000) {
            numero = gerador.nextInt(101);
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            soma += numero;
            i += 1;
        }

        media = soma/1000;

        System.out.println("O maior número foi " + maximo);
        System.out.println("O menor número foi " + minimo);
        System.out.println("A média dos números é " + media);

    }
    
}

