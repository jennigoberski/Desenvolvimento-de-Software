import java.util.Scanner;

public class CompatibilidadePessoa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoas[] = new Pessoa[6];
        int aux, op=-1;
        char auxC;

        pessoas[0] = new Pessoa("Felipe", 57, 'M', 90, 100, 80, 30, 70);
        pessoas[1] = new Pessoa("Maria", 45, 'F', 50, 70, 100, 50, 90);
        pessoas[2] = new Pessoa("Cristiana", 30, 'F', 50, 20, 30, 70, 30);
        pessoas[3] = new Pessoa("Leonardo", 32, 'M', 80, 10, 60, 80, 50);
        pessoas[4] = new Pessoa("João", 27, 'M', 100, 30, 50, 100, 10);
        pessoas[5] = new Pessoa("Jéssica", 45, 'F', 85, 60, 70, 50, 60);

        do {
            Pessoa pessoa1 = new Pessoa();

            System.out.println("Informe seu nome: ");
            pessoa1.setNome(teclado.nextLine());

            System.out.println("Informe sua idade: ");
            aux = teclado.nextInt();
            if (aux >= 18) {
                pessoa1.setIdade(aux);
            } else {
                System.out.println("Você não tem idade para utilizar esse programa!");
                main(args);
            }

            System.out.println("Informe seu gênero (M ou F): ");
            auxC = teclado.next().charAt(0);
            if (auxC == 'M' || auxC == 'F') {
                pessoa1.setGenero(auxC);
            } else {
                System.out.println("Informe M ou F para o seu gênero!");
                main(args);
            }

            System.out.println("De 0 a 100, quanto você gosta de viajar? ");
            aux = teclado.nextInt();
            if (aux >= 0 && aux <= 100) {
                pessoa1.setGostaViajar(aux);
            } else {
                System.out.println("Informe uma valor entre 0 e 100!");
                main(args);
            }

            System.out.println("De 0 a 100, quanto você gosta de cozinhar? ");
            aux = teclado.nextInt();
            if (aux >= 0 && aux <= 100) {
                pessoa1.setGostaCozinhar(aux);
            } else {
                System.out.println("Informe uma valor entre 0 e 100!");
                main(args);
            }

            System.out.println("De 0 a 100, quanto você gosta de cinema? ");
            aux = teclado.nextInt();
            if (aux >= 0 && aux <= 100) {
                pessoa1.setGostaCinema(aux);
            } else {
                System.out.println("Informe uma valor entre 0 e 100!");
                main(args);
            }

            System.out.println("De 0 a 100, quanto você gosta de balada? ");
            aux = teclado.nextInt();
            if (aux >= 0 && aux <= 100) {
                pessoa1.setGostaBalada(aux);
            } else {
                System.out.println("Informe uma valor entre 0 e 100!");
                main(args);
            }

            System.out.println("De 0 a 100, quanto você gosta de ficar em casa? ");
            aux = teclado.nextInt();
            if (aux >= 0 && aux <= 100) {
                pessoa1.setGostaFicarEmCasa(aux);
            } else {
                System.out.println("Informe uma valor entre 0 e 100!");
                main(args);
            }

            double menor = 100, auxB;
            int indice = -1;

            for (int i = 0; i < pessoas.length; i++) {
                if (pessoa1.getGenero() != pessoas[i].getGenero()) {
                    auxB = pessoa1.calcularCompatibilidade(pessoas[i]);
                    if (auxB < menor) {
                        menor = auxB;
                        indice = i;
                    }
                }
            }

            System.out.println("A pessoa mais compatível com " + pessoa1.getNome() + " é " + pessoas[indice].getNome());
            System.out.println("Dados da pessoa informada: ");
            System.out.println(pessoa1);
            System.out.println("Dados da pessoa mais compatível: ");
            System.out.println(pessoas[indice]);

            int marcador = -1;
            do {
                System.out.println("Você deseja inserir outra pessoa? [1]Sim [2]Não");
                aux = teclado.nextInt();
                if (aux == 1 || aux == 2) {
                    op = aux;
                    marcador++;
                } else {
                    System.out.println("Opção inválida!"); 
                }
            } while (marcador == -1);
                
                teclado.nextLine();

        } while (op != 2);

        teclado.close();
    }
}
