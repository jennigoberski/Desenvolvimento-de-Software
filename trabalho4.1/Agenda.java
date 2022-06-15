
//import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        int opcaoUsuario = -1, encontrado = -1;

        while (opcaoUsuario != 0) {
            System.out.println("-----------Lista de Contatos-----------");
            System.out.println("   ( 1 ) Cadastrar contato  ");
            System.out.println("   ( 2 ) Listar contatos  ");
            System.out.println("   ( 3 ) Editar contato  ");
            System.out.println("   ( 4 ) Excluir contato  ");
            System.out.println("   ( 0 ) Sair  ");

            System.out.println("Informe sua opção: ");
            opcaoUsuario = input.nextInt();
            System.out.println("");

            switch (opcaoUsuario) {
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    System.out.println("Cadastrar contato:  ");

                    input.nextLine();
                    System.out.println("Informe o nome:  ");
                    String nome = input.nextLine();

                    System.out.println("Informe o RG:  ");
                    String rg = input.next();

                    // Descobrir como adicionar a data
                    // System.out.println("Informe a data de nascimento: (Formato: dd/mm/yyyy) ");
                    // String dataNascimento = input.nextLine();

                    // DateFormat data=DateFormat.getInstance();
                    // Date da;
                    // da=data.parse(dataNascimento);
                    System.out.println("");
                    System.out.println("Endereço Residencial: ");

                    input.nextLine();
                    System.out.println("Informe o logradouro:  ");
                    String logradouro = input.nextLine();

                    System.out.println("Informe o número do logradouro:  ");
                    String numero = input.nextLine();

                    System.out.println("Informe o complemento:  ");
                    String complemento = input.nextLine();

                    System.out.println("Informe o bairro:  ");
                    String bairro = input.nextLine();

                    System.out.println("Informe o CEP:  ");
                    String cep = input.nextLine();

                    System.out.println("Informe a cidade:  ");
                    String cidade = input.nextLine();

                    Endereco enderecoResidencial = new Endereco(logradouro, numero, complemento, bairro, cep, cidade);
                    Pessoa p = new Pessoa(nome, rg);
                    pessoas.add(p);

                    System.out.println("");
                    System.out.println("Endereço Comercial: ");

                    System.out.println("Informe o logradouro:  ");
                    logradouro = input.nextLine();

                    System.out.println("Informe o número do logradouro:  ");
                    numero = input.nextLine();

                    System.out.println("Informe o complemento:  ");
                    complemento = input.nextLine();

                    System.out.println("Informe o bairro:  ");
                    bairro = input.nextLine();

                    System.out.println("Informe o CEP:  ");
                    cep = input.nextLine();

                    System.out.println("Informe a cidade:  ");
                    cidade = input.nextLine();

                    Endereco enderecoComercial = new Endereco(logradouro, numero, complemento, bairro, cep, cidade);

                    System.out.println("");
                    System.out.println("Informe o email primário:  ");
                    String emailPrimario = input.nextLine();
                    p.getEmailPrimario().put("emailPrimario", emailPrimario);

                    System.out.println("Informe o email secundário:  ");
                    String emailSecundario = input.nextLine();
                    p.getEmailSecundario().put("emailSecundario", emailSecundario);

                    System.out.println("");
                    System.out.println("Informe o telefone residencial:  ");
                    String telefoneResidencial = input.nextLine();
                    p.getTelefoneResidencial().put("telefoneResidencial", telefoneResidencial);

                    System.out.println("Informe o telefone comercial:  ");
                    String telefoneComercial = input.nextLine();
                    p.getTelefoneComercial().put("telefoneComercial", telefoneComercial);

                    System.out.println("Informe o telefone celular:  ");
                    String telefoneCelular = input.nextLine();
                    p.getTelefoneCelular().put("telefoneCelular", telefoneCelular);

                    p.getEnderecoResidencial().put("enderecoResidencial", enderecoResidencial);

                    p.getEnderecoComercial().put("enderecoComercial", enderecoComercial);

                    break;

                case 2:
                    System.out.println(" Listar todos os contatos:  ");
                    // Implementar ordenação
                    // Collections.sort(pessoas);
                    System.out.println(pessoas);
                    break;

                case 3:
                    System.out.println("Editar um contato: ");

                    break;

                case 4:
                    input.nextLine();
                    System.out.println("Excluir contato: ");
                    System.out.println("Informe o nome do contato a ser excluído: ");
                    String nomePesquisa = input.nextLine();

                    for (Pessoa pessoa : pessoas) {
                        if (pessoa.getNome().equals(nomePesquisa)) {
                            encontrado = 1;
                            pessoas.remove(pessoa);
                        }
                    }

                    if (encontrado == 1) {
                        System.out.println("Contato excluído!");
                    } else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;

                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        }

        input.close();
    }
}
