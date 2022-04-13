public abstract class Leitura extends Material {
    private String editora;
    private String edicao;

    public Leitura() {
    }

    public Leitura(int codigo,
            String titulo,
            String editora,
            String edicao) {
        super(codigo, titulo);
        setEditora(editora);
        setEdicao(edicao);
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEditora: " + getEditora() +
                "Edição: " + getEdicao();
    }
}
