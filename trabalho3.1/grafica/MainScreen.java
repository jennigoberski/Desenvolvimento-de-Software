package grafica;

import java.awt.GridLayout;

import javax.swing.JFrame;

import logica.GameLogic;

public class MainScreen extends JFrame{
    GameLogic game; 
    GamePiece[][] board; 

    public MainScreen() {
        game = new GameLogic();
        board = new GamePiece[4][4];
        setLayout((new GridLayout(5, 4, 4, 5)));
        carregarPecas();


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

        
        
        setSize(new Dimension(300, 300));   
    

    private void carregarPecas() {
        //vincular action ao botao
        ActionConferir action = new ActionConferir(tabuleiro, jogo);
     
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int numeroSorteado = jogo.getTabuleiro()[i][j];
                BtnPeca btn = new BtnPeca(numeroSorteado);
                tabuleiro[i][j] = btn;
                add(btn);
                btn.addActionListener(action);
            }
        }
    }

    public void mostrarTabuleiro(){
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                tabuleiro[i][j].mostrar();
            }
        }
    }

    public void ocultarTabuleiro(){
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                tabuleiro[i][j].ocultar();
            }
        }
    }

}
