public abstract class Material {
    private int codigo;
    private String titulo;

    public Material() {}

    public Material(int codigo, String titulo) {
        setCodigo(codigo);
        setTitulo(titulo);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Código: " + getCodigo() +
        "\nTítulo: " + getTitulo();
    }
}
