package regras;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;

public class ControleBotoes {
    private String nmBotao;
    private Map<JButton, Boolean> referenciaBotoes;

    public ControleBotoes() {
        this.referenciaBotoes = new HashMap<JButton, Boolean>();
    }

    public String getNmBotao() {
        return nmBotao;
    }

    public void setNmBotao(String nmBotao) {
        this.nmBotao = nmBotao;
    }

    public Map<JButton, Boolean> getReferenciaBotoes() {
        return referenciaBotoes;
    }

    public void setReferenciaBotoes(Map<JButton, Boolean> referenciaBotoes) {
        this.referenciaBotoes = referenciaBotoes;
    }

    public void AdicionarBotao(JButton botao) {
        this.referenciaBotoes.put(botao, Boolean.FALSE);
    }

    public void alterarSelecao(JButton botao, Boolean selecionado) {
        Boolean b = this.referenciaBotoes.get(botao);
        b = selecionado;
    }

    public void zerarSelecoes() {
        this.referenciaBotoes.values().stream().forEach((b) -> {
            b = false;
        });
    }

    public Boolean isTodasSelecionadas() {
        for (Boolean b : this.referenciaBotoes.values()) {
            if (!b) {
                //Não foram todos selecionados
                return false;
            }
        }
        return true;
    }
}
