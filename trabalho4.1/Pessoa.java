import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String rg;
    private Date dataNascimento;
    private Endereco enderecoR;
    private Endereco enderecoC;
    private HashMap<String, String> emailPrimario;
    private HashMap<String, String> emailSecundario;
    private HashMap<String, String> telefoneResidencial;
    private HashMap<String, String> telefoneComercial;
    private HashMap<String, String> telefoneCelular;
    private HashMap<String, Endereco> enderecoResidencial;
    private HashMap<String, Endereco> enderecoComercial;

    public Pessoa() {
    }

    public Pessoa(String nome, String rg, Date dataNascimento, Endereco enderecoR, Endereco enderecoC) {
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.enderecoR = enderecoR;
        this.enderecoC = enderecoC;
        emailPrimario = new HashMap<String, String>();
        emailSecundario = new HashMap<String, String>();
        telefoneResidencial = new HashMap<String, String>();
        telefoneComercial = new HashMap<String, String>();
        telefoneCelular = new HashMap<String, String>();
        enderecoResidencial = new HashMap<String, Endereco>();
        enderecoComercial = new HashMap<String, Endereco>();
    }

    public Endereco getEnderecoR() {
        return enderecoR;
    }

    public void setEnderecoR(Endereco enderecoR) {
        this.enderecoR = enderecoR;
    }

    public Endereco getEnderecoC() {
        return enderecoC;
    }

    public void setEmailSecundario(HashMap<String, String> emailSecundario) {
        this.emailSecundario = emailSecundario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public HashMap<String, String> getEmailPrimario() {
        return emailPrimario;
    }

    public HashMap<String, String> getEmailSecundario() {
        return emailSecundario;
    }

    public HashMap<String, String> getTelefoneComercial() {
        return telefoneComercial;
    }

    public HashMap<String, String> getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public HashMap<String, String> getTelefoneCelular() {
        return telefoneCelular;
    }

    public HashMap<String, Endereco> getEnderecoComercial() {
        return enderecoComercial;
    }

    public HashMap<String, Endereco> getEnderecoResidencial() {
        return enderecoResidencial;
    }

    private String dateConvertor(Date dataNascimento) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = dateFormat.format(dataNascimento);
        return strDate;
    }

    @Override
    public String toString() {
        return String.format(
                "\n Informações do contato: \n \n Nome: %s\n RG: %s\n Data de nascimento: %s \n Email primário: %s\n Email secundário: %s\n \n Telefone residencial: %s\n Telefone comercial: %s\n Telefone celular: %s\n \n Endereço residencial: %s\n \n Endereço comercial: %s\n",
                nome, rg, dateConvertor(dataNascimento), emailPrimario, emailSecundario, telefoneResidencial,
                telefoneComercial, telefoneCelular,
                enderecoResidencial, enderecoComercial);
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.nome);
    }
}
