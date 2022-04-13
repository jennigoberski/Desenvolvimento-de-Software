import java.util.Date;

public class Revista extends Leitura {
    private Date data;
    private String editorial;
    private String reportagemCapa;

    public Revista() {
    }

    public Revista(int codigo,
            String titulo,
            String editora,
            String edicao,
            Date data,
            String editorial,
            String reportagemCapa) {
        super(codigo, titulo, editora, edicao);
        setData(data);
        setEditorial(editorial);
        setReportagemCapa(reportagemCapa);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getReportagemCapa() {
        return reportagemCapa;
    }

    public void setReportagemCapa(String reportagemCapa) {
        this.reportagemCapa = reportagemCapa;
    }

    @Override
    //%t para data no String format
    public String toString() {
        return super.toString() +
                "\nData: " + getData() +
                "\nEditorial: " + getEditorial() +
                "\nReportagem da Capa: " + getReportagemCapa() + "\n";
    }
}
