package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logica.ControleBotoes;
import logica.EstadoBotoes;

public class TelaPrincipal extends JFrame {
    private JPanel painel;
    private JButton botao1;
    private JButton botao2;

    private ControleBotoes controle;

    public TelaPrincipal() {
        super("Jogo da Memória");

        ActionListener acaoBotoes = (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ((JButton) e.getSource()).setBackground(null);
               controle.executarAcaoBotoes((JButton) e.getSource(), EstadoBotoes.SELECIONADO);
            }    
        });

        controle = new ControleBotoes();
        controle.setNmBotao("Churros");

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

        this.setBounds(250, 100, 350, 350);

        this.controle.AdicionarBotao(botao1);
        this.controle.AdicionarBotao(botao2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
