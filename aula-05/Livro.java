public class Livro extends Leitura {
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private String isbn;

    public Livro() {
    }

    public Livro(int codigo,
            String titulo,
            String editora,
            String edicao,
            String autor,
            int anoPublicacao,
            int numeroPaginas, 
            String isbn) {
        super(codigo, titulo, editora, edicao);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
        setNumeroPaginas(numeroPaginas);
        setIsbn(isbn);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAutor: " + getAutor() +
                "\nAno: " + getAnoPublicacao() +
                "\nNúmero de páginas: " + getNumeroPaginas() +
                "\nISBN: " + getIsbn() + "\n";
    }
}
