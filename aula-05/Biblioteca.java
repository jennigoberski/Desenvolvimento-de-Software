import java.util.Calendar;

public class Biblioteca {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Livro livro = new Livro(
                1,
                "Livro Teste",
                "Editora Teste",
                "3° edição",
                "Autor Teste",
                2022,
                427,
                "2003900044");

        Revista revista = new Revista(
                2,
                "Revista Teste",
                "Editora Teste",
                "2° edição",
                c.getTime(),
                "Editorial Teste",
                "Reportagem de capa teste");

        System.out.println(livro);
        System.out.println(revista);

        livro.setTitulo("Título teste 2");
        livro.setEditora("Editora teste 2");
        livro.setAnoPublicacao(2023);

        revista.setReportagemCapa("Reportagem 2");

        System.out.println(livro);
        System.out.println(revista);
    }

}
