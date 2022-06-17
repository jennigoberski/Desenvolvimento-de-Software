import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EditarContatos {
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static Pessoa editarContato(Pessoa pessoa) throws ParseException {
        int opcaoEdicao;

        System.out.println("Qual informação você deseja editar? ");
        System.out.println("( 1 ) Nome");
        System.out.println("( 2 ) RG");
        System.out.println("( 3 ) Data de Nascimento");
        System.out.println("( 4 ) Email");
        System.out.println("( 5 ) Telefone");
        System.out.println("( 6 ) Endereço");
        opcaoEdicao = tecladoScanner.nextInt();
        tecladoScanner.nextLine();

        switch (opcaoEdicao) {
            case 1:
                pessoa = editarNome(pessoa);
                break;

            case 2:
                pessoa = editarRg(pessoa);
                break;

            case 3:
                pessoa = editarDataNascimento(pessoa);
                break;

            case 4:
                pessoa = editarEmail(pessoa);
                break;

            case 5:
                pessoa = editarTelefone(pessoa);
                break;

            case 6:
                pessoa = editarEndereco(pessoa);
                break;

            default:
                System.out.println("Opção inválida, tente novamente mais tarde.\n");
                break;
        }

        return pessoa;
    }

    private static Pessoa editarNome(Pessoa pessoa) {
        System.out.println("\nQual o novo nome do contato?");
        String novoNome = tecladoScanner.nextLine();
        pessoa.setNome(novoNome);
        System.out.println("Nome editado!\n");
        return pessoa;
    }

    private static Pessoa editarRg(Pessoa pessoa) {
        System.out.println("\nQual o novo RG do contato?");
        String novoRg = tecladoScanner.nextLine();
        pessoa.setRg(novoRg);
        System.out.println("RG editado!\n");
        return pessoa;
    }

    private static Pessoa editarDataNascimento(Pessoa pessoa) throws ParseException {
        System.out.println("\nQual o nova data de nascimento do contato?");
        String novaData = tecladoScanner.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse(novaData);

        pessoa.setDataNascimento(dataNascimento);
        System.out.println("Data de nascimento editada!\n");
        return pessoa;
    }

    private static Pessoa editarEmail(Pessoa pessoa) {
        System.out.println("\n Qual email você gostaria de atualizar?");
        System.out.println("( 1 ) Primário");
        System.out.println("( 2 ) Secundário");
        int opcaoEmail = tecladoScanner.nextInt();

        tecladoScanner.nextLine();

        System.out.println("Qual o novo email a ser atualizado? ");
        String novoEmail = tecladoScanner.nextLine();
        switch (opcaoEmail) {
            case 1:
                pessoa.getEmailPrimario().put("emailPrimario", novoEmail);
                break;
            case 2:
                pessoa.getEmailSecundario().put("emailSecundario", novoEmail);
                break;

            default:
                System.out.println("Opção inválida, tente novamente mais tarde.\n");
                break;
        }

        System.out.println("Email editado!\n");
        return pessoa;
    }

    private static Pessoa editarTelefone(Pessoa pessoa) {
        System.out.println("\n Qual telefone você gostaria de atualizar?");
        System.out.println("( 1 ) Residencial");
        System.out.println("( 2 ) Comercial");
        System.out.println("( 3 ) Celular");
        int opcaoCelular = tecladoScanner.nextInt();

        tecladoScanner.nextLine();

        System.out.println("Qual o novo telefone a ser atualizado? ");
        String novoTelefone = tecladoScanner.nextLine();

        switch (opcaoCelular) {
            case 1:
                pessoa.getTelefoneResidencial().put("telefoneResidencial", novoTelefone);
                break;
            case 2:
                pessoa.getTelefoneComercial().put("telefoneComercial", novoTelefone);
                break;
            case 3:
                pessoa.getTelefoneCelular().put("telefoneCelular", novoTelefone);
                break;

            default:
                System.out.println("Opção inválida, tente novamente mais tarde.\n");
                break;
        }

        System.out.println("Telefone editado!\n");
        return pessoa;
    }

    private static Pessoa editarInformacoesEndereco(String key, String novoEndereco, int opcao, Pessoa p) {
        switch (opcao) {
            case 1:
                p.getEnderecoR().setLogradouro(novoEndereco);
                p.getEnderecoResidencial().put(key, p.getEnderecoR());
                break;
            case 2:
                p.getEnderecoR().setNumero(novoEndereco);
                p.getEnderecoResidencial().put(key, p.getEnderecoR());
                break;
            case 3:
                p.getEnderecoR().setComplemento(novoEndereco);
                p.getEnderecoResidencial().put(key, p.getEnderecoR());
                break;
            case 4:
                p.getEnderecoR().setBairro(novoEndereco);
                p.getEnderecoResidencial().put(key, p.getEnderecoR());
                break;
            case 5:
                p.getEnderecoR().setCep(novoEndereco);
                p.getEnderecoResidencial().put(key, p.getEnderecoR());
                break;
            case 6:
                p.getEnderecoR().setCidade(novoEndereco);
                p.getEnderecoResidencial().put(key, p.getEnderecoR());
                break;
            default:
                System.out.println("Opção inválida, tente novamente mais tarde.\n");
                break;
        }

        System.out.println("Endereço editado!\n");
        return p;
    }

    private static Pessoa editarEndereco(Pessoa pessoa) {
        System.out.println("\n Qual endereço você gostaria de atualizar?");
        System.out.println("( 1 ) Residencial");
        System.out.println("( 2 ) Comercial");
        int opcao = tecladoScanner.nextInt();

        System.out.println("\n Qual informação você gostaria de atualizar?");
        System.out.println("( 1 ) Logradouro");
        System.out.println("( 2 ) Número");
        System.out.println("( 3 ) Complemento");
        System.out.println("( 4 ) Bairro");
        System.out.println("( 5 ) CEP");
        System.out.println("( 6 ) Cidade");
        int opcaoEndereco = tecladoScanner.nextInt();

        tecladoScanner.nextLine();

        System.out.println("Qual a nova informação a ser atualizada? ");
        String novoEndereco = tecladoScanner.nextLine();
         
        if (opcao == 1) {
            pessoa = editarInformacoesEndereco("enderecoResidencial", novoEndereco, opcaoEndereco, pessoa);
        } else if(opcao == 2) {
            pessoa = editarInformacoesEndereco("enderecoComercial", novoEndereco, opcaoEndereco, pessoa);
        } else {
            System.out.println("Opção inválida!");
        }
        return pessoa;
    }

}
