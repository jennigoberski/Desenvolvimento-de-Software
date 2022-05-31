package grafica;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame {
    private JPanel painel;
    private JButton botao1;
    private JButton botao2;

    public TelaPrincipal() {
        super("Jogo da Memória");

        painel = new JPanel();
        this.add(painel);
        painel.setLayout(null); 

        botao1 = new JButton("Botão 1");
        painel.add(botao1);
        botao1.setBounds(10, 10, 100, 100);

        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ((JButton) e.getSource()).setBackground(Color.BLUE);

            }    
        });

        botao2 = new JButton("Botão 2");
        painel.add(botao2);
        botao2.setBounds(10, 10, 100, 100);

        this.setBounds(250, 100, 350, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
