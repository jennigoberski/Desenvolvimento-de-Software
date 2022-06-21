public class LogicaGenius {
    private int piscar;
    private int pontos;
    private boolean isSequenciaCriada;
    private boolean fimDeJogo;

    public int getPiscar() {
        return piscar;
    }

    public void setPiscar(int piscar) {
        this.piscar = piscar;
    }

    public int getPontos() {
        return pontos;
    }

    public void somarPontos() {
        pontos += 5;
    }

    public boolean isSequenciaCriada() {
        return isSequenciaCriada;
    }

    public void setSequenciaCriada(boolean isSequenciaCriada) {
        this.isSequenciaCriada = isSequenciaCriada;
    }

    public boolean getFimdeJogo() {
        return fimDeJogo;
    }

    public void setFimDeJogo(boolean fimDeJogo) {
        this.fimDeJogo = fimDeJogo;
    }
}
