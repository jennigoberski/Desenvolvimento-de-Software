import java.util.HashMap;
import java.util.Map;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private float peso;
    private HashMap<String, String> telefones;

    public Pessoa(String nome, int idade, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s; Idade: %d; Peso: %.2f\n", nome, idade, peso);
    }

    @Override
    public int compareTo(Pessoa o) {
        if (this.idade > o.idade) {
            return 1;
        } else if (this.idade < o.idade) {
            return -1;
        }
        return 0;
    }

    public Map<String, String> getTelefones() {
        return telefones;
    }
}