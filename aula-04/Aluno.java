public class Aluno {
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int RGM;
    private String nome;
    private int anoIngresso;

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno(int RGM, String nome, int anoIngresso) {
        // inicializa variáveis de instância
        this.RGM = RGM;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
    }

    void setRGM(int RGM) {
        this.RGM = RGM;
    }

    int getRGM() {
        return this.RGM;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    int getAnoIngresso() {
        return this.anoIngresso;
    }

    public String toString() {
        return "RGM: " + this.RGM +
                "\nNome: " + this.nome +
                "\nAno de Ingresso: " + this.anoIngresso;
    }
}