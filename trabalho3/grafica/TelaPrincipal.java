package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logica.ControleBotoes;
import logica.EstadoBotoes;

public class TelaPrincipal extends JFrame {

    private static final int QUANTIDADE_JOGADAS = 2;
    private int jogadas = 0;

    private JPanel painel;
    private JButton botao1;
    private JButton botao2;

    private JButton botaoA;
    private JButton botaoB;

    private ControleBotoes controle;
    private ControleBotoes controleA;

    private List<logica.ControleBotoes> listaControle;

    private List<logica.ControleBotoes> listaSelecionados;

    public TelaPrincipal() {
        super("Jogo da Memória");

        listaControle = new ArrayList<>();
        listaSelecionados = new ArrayList<>();

        ActionListener acaoBotoes = (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton botao = (JButton) e.getSource();

                for (logica.ControleBotoes cont : listaControle) {
                    if (cont.getReferenciaBotoes().get(botao) != null) {
                        jogadas++;
                        cont.executarAcaoBotoes((JButton) e.getSource(), EstadoBotoes.SELECIONADO);

                        if (!listaSelecionados.contains(cont)) {
                            listaSelecionados.add(cont);
                        }

                        if (jogadas == QUANTIDADE_JOGADAS) {
                            if (listaSelecionados.size() > 1) {
                                for (logica.ControleBotoes cbs : listaSelecionados) {
                                    cbs.zerarSelecoes();
                                }
                            }
                            jogadas = 0;
                            listaSelecionados.clear();
                        }
                        break;
                    }
                }
            }
        });

        controle = new ControleBotoes();
        controle.setNmBotao("Churros");

        controleA = new ControleBotoes();
        controleA.setNmBotao("Picolé");

        painel = new JPanel();
        this.add(painel);
        painel.setLayout(null);

        botao1 = new JButton("Botão 1");
        painel.add(botao1);
        botao1.setBounds(10, 10, 100, 100);

        botao1.addActionListener(acaoBotoes);

        botao2 = new JButton("Botão 2");
        painel.add(botao2);
        botao2.setBounds(120, 10, 100, 100);

        botao2.addActionListener(acaoBotoes);

        botaoA = new JButton("Botão 3");
        painel.add(botaoA);
        botaoA.setBounds(10, 110, 100, 100);

        botaoA.addActionListener(acaoBotoes);

        botaoB = new JButton("Botão 4");
        painel.add(botaoB);
        botaoB.setBounds(120, 110, 100, 100);
        botaoB.addActionListener(acaoBotoes);

        this.setBounds(250, 100, 350, 350);

        this.controle.AdicionarBotao(botao1);
        this.controle.AdicionarBotao(botao2);

        this.controleA.AdicionarBotao(botaoA);
        this.controleA.AdicionarBotao(botaoB);

        this.listaControle.add(controle);
        this.listaControle.add(controleA);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
