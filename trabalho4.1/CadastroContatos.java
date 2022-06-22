import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CadastroContatos {
    public static Scanner teclado = new Scanner(System.in);
    public static Pessoa cadastrarContato() throws ParseException {

        System.out.println("Informe o nome:  ");
        String nome = teclado.nextLine();

        System.out.println("Informe o RG:  ");
        String rg = teclado.nextLine();

        System.out.println("Informe a data de nascimento: (Formato: dd/mm/yyyy) ");
        String dataRecebida = teclado.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse(dataRecebida);

        System.out.println("");
        System.out.println("Endereço Residencial: ");

        System.out.println("Informe o logradouro:  ");
        String logradouro = teclado.nextLine();

        System.out.println("Informe o número do logradouro:  ");
        String numero = teclado.nextLine();

        System.out.println("Informe o complemento:  ");
        String complemento = teclado.nextLine();

        System.out.println("Informe o bairro:  ");
        String bairro = teclado.nextLine();

        System.out.println("Informe o CEP:  ");
        String cep = teclado.nextLine();

        System.out.println("Informe a cidade:  ");
        String cidade = teclado.nextLine();

        Endereco enderecoResidencial = new Endereco(logradouro, numero, complemento, bairro, cep, cidade);

        System.out.println("");
        System.out.println("Endereço Comercial: ");

        System.out.println("Informe o logradouro:  ");
        logradouro = teclado.nextLine();

        System.out.println("Informe o número do logradouro:  ");
        numero = teclado.nextLine();

        System.out.println("Informe o complemento:  ");
        complemento = teclado.nextLine();

        System.out.println("Informe o bairro:  ");
        bairro = teclado.nextLine();

        System.out.println("Informe o CEP:  ");
        cep = teclado.nextLine();

        System.out.println("Informe a cidade:  ");
        cidade = teclado.nextLine();

        Endereco enderecoComercial = new Endereco(logradouro, numero, complemento, bairro, cep, cidade);

        Pessoa p = new Pessoa(nome, rg, dataNascimento, enderecoResidencial, enderecoComercial);

        System.out.println("");
        System.out.println("Informe o email primário:  ");
        String emailPrimario = teclado.nextLine();
        p.getEmailPrimario().put("emailPrimario", emailPrimario);

        System.out.println("Informe o email secundário:  ");
        String emailSecundario = teclado.nextLine();
        p.getEmailSecundario().put("emailSecundario", emailSecundario);

        System.out.println("");
        System.out.println("Informe o telefone residencial:  ");
        String telefoneResidencial = teclado.nextLine();
        p.getTelefoneResidencial().put("telefoneResidencial", telefoneResidencial);

        System.out.println("Informe o telefone comercial:  ");
        String telefoneComercial = teclado.nextLine();
        p.getTelefoneComercial().put("telefoneComercial", telefoneComercial);

        System.out.println("Informe o telefone celular:  ");
        String telefoneCelular = teclado.nextLine();
        p.getTelefoneCelular().put("telefoneCelular", telefoneCelular);

        p.getEnderecoResidencial().put("enderecoResidencial", enderecoResidencial);

        p.getEnderecoComercial().put("enderecoComercial", enderecoComercial);

        return p;
    }
}
