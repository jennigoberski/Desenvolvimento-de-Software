package grafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import logica.LogicaGenius;
import logica.GeniusPrincipal;

public class FrmGenius extends JPanel implements ActionListener, MouseListener {
    LogicaGenius logica = new LogicaGenius();
    ArrayList<Integer> sequencia;
    int tempoBrilho, indiceCor, tempoEscuro;
    Random random = new Random();

    public FrmGenius() {
        JFrame frame = new JFrame("Genius");
        Timer timer = new Timer(20, this);

        frame.setSize(600 + 15, 600 + 35);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(this);
        frame.addMouseListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JOptionPane.showMessageDialog(frame, "O jogo vai começar, memorize a sequência de cores", "Atenção",
                JOptionPane.WARNING_MESSAGE);

        iniciarJogo();

        timer.start();
    }

    public void iniciarJogo() {
        sequencia = new ArrayList<Integer>();
        indiceCor = 0;
        logica.setPiscar(0);
        tempoBrilho = 0;
        tempoEscuro = 2;
        logica.setPontos(0);
        logica.setSequenciaCriada(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tempoBrilho++;

        if (tempoBrilho % 20 == 0) {
            logica.setPiscar(0);

            if (tempoEscuro >= 0) {
                tempoEscuro--;
            }
        }

        if (logica.isSequenciaCriada()) {
            if (tempoEscuro <= 0) {
                if (indiceCor >= sequencia.size()) {
                    logica.setPiscar(random.nextInt(40) % 4 + 1);
                    sequencia.add(logica.getPiscar());
                    indiceCor = 0;
                    logica.setSequenciaCriada(false);
                } else {
                    logica.setPiscar(sequencia.get(indiceCor));
                    indiceCor++;
                }
                tempoEscuro = 2;
            }
        } else if (indiceCor == sequencia.size()) {
            logica.setSequenciaCriada(true);
            indiceCor = 0;
            tempoEscuro = 2;
            logica.somarPontos();  
        }
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //se o jogo no main foi criado, pinta o tabuleiro
        if (GeniusPrincipal.genius != null) {
            GeniusPrincipal.genius.paint((Graphics2D) g);
        }

    }

    public void paint(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //criando os quadrados
        if (logica.getPiscar() == 1) {
            g.setColor(Color.green);
        } else {
            g.setColor(Color.green.darker());
        }
        g.fillRect(0, 0, 300, 300);

        if (logica.getPiscar() == 2) {
            g.setColor(Color.red);
        } else {
            g.setColor(Color.red.darker());
        }
        g.fillRect(300, 0, 300, 300);

        if (logica.getPiscar() == 3) {
            g.setColor(Color.yellow);
        } else {
            g.setColor(Color.yellow.darker());
        }
        g.fillRect(0, 300, 300, 300);

        if (logica.getPiscar() == 4) {
            g.setColor(Color.blue);
        } else {
            g.setColor(Color.blue.darker());
        }
        g.fillRect(300, 300, 300, 300);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int largura = e.getX(), altura = e.getY();
        //encontrando os quadrados e piscando a cor
        if (logica.isSequenciaCriada() == false && logica.getFimdeJogo() == false) {
            if (largura > 0 && largura < 300 && altura > 0 && altura < 300) {
                // área vermelha no plano cartesiano
                logica.setPiscar(1);
                tempoBrilho = 1;
            } else if (largura > 300 && largura < 600 && altura > 0 && altura < 300) {
                // área verde no plano cartesiano
                logica.setPiscar(2);
                tempoBrilho = 1;
            } else if (largura > 0 && largura < 300 && altura > 300 && altura < 600) {
                // área amarela no plano cartesiano
                logica.setPiscar(3);
                tempoBrilho = 1;
            } else if (largura > 300 && largura < 600 && altura > 300 && altura < 600) {
                // área azul no plano cartesiano
                logica.setPiscar(4);
                tempoBrilho = 1;
            }

            //se já piscou comparar o tamanho da sequencia com o brilhos e ver se ganhou ou não
            if (logica.getPiscar() != 0) {
                if (sequencia.get(indiceCor) == logica.getPiscar()) {
                    indiceCor++;
                } else {
                    logica.setFimDeJogo(true);
                    JOptionPane.showMessageDialog(this,
                            String.format("Fim de jogo! Sua pontuação final foi: %d", logica.getPontos()), "Genius",
                            JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }
        } else if (logica.getFimdeJogo()) {
            //se ainda não piscou, inicia o jogo
            iniciarJogo();
            logica.setFimDeJogo(false);
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
}
