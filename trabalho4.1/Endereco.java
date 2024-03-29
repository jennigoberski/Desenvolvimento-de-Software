public class Endereco {
   private String logradouro;
   private String numero;
   private String complemento;
   private String bairro;
   private String cep;
   private String cidade;

   public Endereco(String logradouro, String numero, String complemento, String bairro, String cep, String cidade) {
       this.logradouro = logradouro;
       this.numero = numero;
       this.complemento = complemento;
       this.bairro = bairro;
       this.cep = cep;
       this.cidade = cidade;
   }

   public String getLogradouro() {
       return logradouro;
   }

   public void setLogradouro(String logradouro) {
       this.logradouro = logradouro;
   }

   public String getNumero() {
       return numero;
   }

   public void setNumero(String numero) {
       this.numero = numero;
   }

   public String getComplemento() {
       return complemento;
   }

   public void setComplemento(String complemento) {
       this.complemento = complemento;
   }

   public String getBairro() {
       return bairro;
   }

   public void setBairro(String bairro) {
       this.bairro = bairro;
   }

   public String getCep() {
       return cep;
   }

   public void setCep(String cep) {
       this.cep = cep;
   }

   public String getCidade() {
       return cidade;
   }

   public void setCidade(String cidade) {
       this.cidade = cidade;
   }

   @Override
   public String toString() {
    return String.format("\n Endereço:\n Logradouro: %s\n Número: %s\n Complemento: %s\n Bairro: %s\n CEP: %s\n Cidade: %s \n", logradouro, numero, complemento, bairro, cep, cidade);
}

}
