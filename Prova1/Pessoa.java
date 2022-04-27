public class Pessoa {
    private String nome;
    private int idade;
    private char genero;
    private int gostaViajar;
    private int gostaCozinhar;
    private int gostaCinema;
    private int gostaBalada;
    private int gostaFicarEmCasa;

    public Pessoa() {
    }

    public Pessoa(
            String nome,
            int idade,
            char genero,
            int gostaViajar,
            int gostaCozinhar,
            int gostaCinema,
            int gostaBalada,
            int gostaFicarEmCasa) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.gostaViajar = gostaViajar;
        this.gostaCozinhar = gostaCozinhar;
        this.gostaCinema = gostaCinema;
        this.gostaBalada = gostaBalada;
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getGostaViajar() {
        return gostaViajar;
    }

    public void setGostaViajar(int gostaViajar) {
        this.gostaViajar = gostaViajar;
    }

    public int getGostaCozinhar() {
        return gostaCozinhar;
    }

    public void setGostaCozinhar(int gostaCozinhar) {
        this.gostaCozinhar = gostaCozinhar;
    }

    public int getGostaCinema() {
        return gostaCinema;
    }

    public void setGostaCinema(int gostaCinema) {
        this.gostaCinema = gostaCinema;
    }

    public int getGostaBalada() {
        return gostaBalada;
    }

    public void setGostaBalada(int gostaBalada) {
        this.gostaBalada = gostaBalada;
    }

    public int getGostaFicarEmCasa() {
        return gostaFicarEmCasa;
    }

    public void setGostaFicarEmCasa(int gostaFicarEmCasa) {
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }

    public double calcularCompatibilidade(Pessoa pessoa) {
        double distancia = Math.sqrt(Math.pow(pessoa.getGostaViajar() - this.gostaViajar, 2)
                + Math.pow(pessoa.getGostaCozinhar() - this.gostaCozinhar, 2)
                + Math.pow(pessoa.getGostaCinema() - this.gostaCinema, 2)
                + Math.pow(pessoa.getGostaBalada() - this.gostaBalada, 2)
                + Math.pow(pessoa.getGostaFicarEmCasa() - this.gostaFicarEmCasa, 2));
        return distancia;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Idade: " + this.idade + "\n" +
                "Gênero: " + this.genero + "\n" +
                "Gosta de viajar: " + this.gostaViajar + "\n" +
                "Gosta de cozinhar: " + this.gostaCozinhar + "\n" +
                "Gosta de cinema: " + this.gostaCinema + "\n" +
                "Gosta de balada: " + this.gostaBalada + "\n" +
                "Gosta de ficar em casa: " + this.gostaFicarEmCasa + "\n";
    }

}