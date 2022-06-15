
import java.util.HashMap;

public class Pessoa{
    private String nome;
    private String rg;
    // private Date dataNascimento;
    private HashMap<String, String> emailPrimario;
    private HashMap<String, String> emailSecundario;
    private HashMap<String, String> telefoneResidencial;
    private HashMap<String, String> telefoneComercial;
    private HashMap<String, String> telefoneCelular;
    private HashMap<String, Endereco> enderecoResidencial;
    private HashMap<String, Endereco> enderecoComercial;

    

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
        emailPrimario = new HashMap<String, String>();
        emailSecundario = new HashMap<String, String>();
        telefoneResidencial = new HashMap<String, String>();
        telefoneComercial = new HashMap<String, String>();
        telefoneCelular = new HashMap<String, String>();
        enderecoResidencial = new HashMap<String, Endereco>();
        enderecoComercial = new HashMap<String, Endereco>();

        //this.dataNascimento = dataNascimento;
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

    // public Date getDataNascimento() {
    //     return dataNascimento;
    // }

    // public void setDataNascimento(Date dataNascimento) {
    //     this.dataNascimento = dataNascimento;
    // }

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

   @Override
   public String toString() {
    return String.format("\n Informações do contato: \n \n Nome: %s\n RG: %s\n \n Email primário: %s\n Email secundário: %s\n \n Telefone residencial: %s\n Telefone comercial: %s\n Telefone celular: %s\n \n Endereço residencial: %s\n \n Endereço comercial: %s\n", nome, rg, emailPrimario, emailSecundario, telefoneResidencial, telefoneComercial, telefoneCelular, enderecoResidencial, enderecoComercial);
   }

//    @Override
//     public int compareTo(Pessoa o) {
//         if (this.nome.equals(o.getNome())) {
//             return 1;
//         } else if (this.idade < o.idade) {
//             return -1;
//         }
//         return 0;
//     }
}


