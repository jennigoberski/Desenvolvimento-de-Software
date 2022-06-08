package grafica;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logica.ControleBotoes;
import logica.EstadoBotoes;

public class TelaPrincipal extends JFrame {

    private static final int QUANTIDADE_JOGADAS = 2;
    private int jogadas = 0;

    private JPanel painel;

    private List<logica.ControleBotoes> listaControle;
    private List<logica.ControleBotoes> listaSelecionados;

    private ActionListener acaoBotoes;

    public TelaPrincipal() {
        super("Jogo da Memória");

        listaControle = new ArrayList<>();
        listaSelecionados = new ArrayList<>();

        acaoBotoes = (new ActionListener() {
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

        painel = new JPanel();
        this.add(painel);
        painel.setLayout(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criarJogo(8);
        this.setBounds(250,250,500,500);
        this.setVisible(true);

    }

    private void criarJogo(int qtPares) {
        ControleBotoes controle = null;

        List<Rectangle> posicionamentos = new ArrayList<>();
        int posX = 10;
        int posY = 10;
        Random rand = new Random();
    
        int j = 0;

        for (int i = 0; i < (qtPares * 2); i++) {
            // Randomizar o posicionamento dos botões
            Rectangle rec = new Rectangle(posX, posY, 75, 75);
            posicionamentos.add(rec);
            if (i % 5 == 0 && i > 0) {
                posY += 80;
                posX = 10;
            } else {
                posX += 80;
            }
        }
            
        for (int i = 0; i < (qtPares * 2); i++) {
            if (i % 2 == 0) {
                j++;
                controle = new ControleBotoes();
                controle.setNmBotao("Botão " + j);
                this.listaControle.add(controle);
            }

            JButton botao = new JButton("?");
            this.painel.add(botao);
            botao.addActionListener(this.acaoBotoes);

            int pos = rand.nextInt(((posicionamentos.size() - 1) > 0) ? posicionamentos.size() - 1 : 1);
            System.out.println(pos);
            botao.setBounds(posicionamentos.get(pos));
            posicionamentos.remove(pos);
            
            controle.adicionarBotao(botao);
        }
            
    }

}
