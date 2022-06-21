
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) throws ParseException {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Scanner input = new Scanner(System.in);
        int opcaoUsuario = -1, encontrado = -1;

        while (opcaoUsuario != 0) {
            
            System.out.println("-----------Lista de Contatos-----------");
            System.out.println("   ( 1 ) Cadastrar contato  ");
            System.out.println("   ( 2 ) Listar contatos  ");
            System.out.println("   ( 3 ) Editar contato  ");
            System.out.println("   ( 4 ) Excluir contato  ");
            System.out.println("   ( 0 ) Sair  ");
            System.out.println("");

            System.out.println("   Informe sua opção: ");
            opcaoUsuario = input.nextInt();
            System.out.println("");

            switch (opcaoUsuario) {
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    System.out.println("Cadastrar contato:  ");
                    Pessoa p = CadastroContatos.cadastrarContato();
                    System.out.println("Contato cadastrado com sucesso!\n");
                    pessoas.add(p);
                    break;

                case 2:
                    System.out.println("\n ------Listar todos os contatos:----------  \n");
                    Collections.sort(pessoas);
                    System.out.println(pessoas);
                    break;

                case 3:
                    System.out.println("Editar um contato: ");
                    input.nextLine();
                    System.out.println("Qual o nome do contato que deseja editar? ");
                    String nomeUsuario = input.nextLine();

                    for (Pessoa pessoa : pessoas) {
                        if (pessoa.getNome().equals(nomeUsuario)) {
                            pessoa = EditarContatos.editarContato(pessoa);
                        } else {
                            System.out.println("Contato não encontrado!\n");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Excluir contato: ");
                    input.nextLine();
                    System.out.println("Informe o nome do contato a ser excluído: ");
                    String nomePesquisa = input.nextLine();

                    for (Pessoa pessoa : pessoas) {
                        if (pessoa.getNome().equals(nomePesquisa)) {
                            encontrado = 1;
                            pessoas.remove(pessoa);
                        }
                    }

                    if (encontrado == 1) {
                        System.out.println("Contato excluído!\n");
                    } else {
                        System.out.println("Contato não encontrado!\n");
                    }
                    break;

                default:
                    System.out.println("Operação inválida!\n");
                    break;
            }
        }

        input.close();
    }  
}
