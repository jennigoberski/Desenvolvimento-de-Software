package logica;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;

public class ControleBotoes {
    private String nmBotao;
    private Map<JButton, EstadoBotoes> referenciaBotoes;

    public ControleBotoes() {
        this.referenciaBotoes = new HashMap<JButton, EstadoBotoes>();
    }

    public void executarAcaoBotoes(JButton botao, EstadoBotoes estado) {
        alterarSelecao(botao, estado);
        
        if (this.isTodasSelecionadas()) {
            alterarEstadoTodosBotoes(EstadoBotoes.PARES_ENCONTRADOS);
        } else {
            alterarVisualizacaoBotao(botao);
        }
    }

    private void alterarEstadoTodosBotoes(EstadoBotoes estado) {
        for (JButton botao : this.referenciaBotoes.keySet()) {
            alterarSelecao(botao, estado);
            alterarVisualizacaoBotao(botao);
        }
    }

    public String getNmBotao() {
        return nmBotao;
    }

    public void setNmBotao(String nmBotao) {
        this.nmBotao = nmBotao;
    }

    public Map<JButton, EstadoBotoes> getReferenciaBotoes() {
        return referenciaBotoes;
    }

    public void setReferenciaBotoes(Map<JButton, EstadoBotoes> referenciaBotoes) {
        this.referenciaBotoes = referenciaBotoes;
    }

    public void AdicionarBotao(JButton botao) {
        this.referenciaBotoes.put(botao, EstadoBotoes.NORMAL);
    }

    public void alterarSelecao(JButton botao, EstadoBotoes selecionado) {
        this.referenciaBotoes.put(botao, selecionado);
    }

    private void alterarVisualizacaoBotao(JButton botao) {
        EstadoBotoes selecionado = this.referenciaBotoes.get(botao);
        switch (selecionado) {
            case NORMAL:
                botao.setBackground(null);
                botao.setText("?");
                break;

            case SELECIONADO:
                botao.setBackground(Color.green);
                botao.setText(this.nmBotao);
                break;

            case PARES_ENCONTRADOS:
                botao.setBackground(Color.magenta);
                botao.setText(this.nmBotao);
                botao.setEnabled(false);
                break;
        }
    }

    public void zerarSelecoes() {
        alterarEstadoTodosBotoes(EstadoBotoes.NORMAL);
    }

    public Boolean isTodasSelecionadas() {
        for (EstadoBotoes b : this.referenciaBotoes.values()) {
            if (b != EstadoBotoes.SELECIONADO) {
                // Não foram todos selecionados
                return false;
            }
        }
        return true;
    }
}
