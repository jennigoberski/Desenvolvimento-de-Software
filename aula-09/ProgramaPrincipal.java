import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Cirilo", 15, 43));
        pessoas.add(new Pessoa("Maria Joaquina", 13, 47));
        pessoas.add(new Pessoa("Pedro", 30, 78));
        pessoas.add(new Pessoa("Simone", 25, 63));
        pessoas.add(new Pessoa("Edson", 45, 100));
        pessoas.add(new Pessoa("Francieli", 19, 60));

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        Collections.sort(pessoas);

        System.out.println("\n---------- Ordenação ----------\n");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
     
        Pessoa p = new Pessoa("Rogerinho", 38, 76);
        p.getTelefones().put("residencial", "41 3325-4472");
        p.getTelefones().put("comercial", "41 3021-0972");
        p.getTelefones().put("celular", "41 99702-7822");

        System.out.printf("Telefone Celular: %s\n", p.getTelefones().get("celular"));

    }
}
