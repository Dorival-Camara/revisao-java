import javax.swing.*;


public class telaJogo extends JFrame {

    private jogoDaVelha jogo;
    private JButton[][] botoes;
    private JLabel statusLabel;

    public telaJogo() {
        jogo = new jogoDaVelha();
        botoes = new JButton[3][3];

        configurarJanela();
        criarStatusLabel();
        criarTabuleiroDeBotoes();
        criarBotaoReiniciar();
    }

    private void configurarJanela() {
        setTitle("Jogo da Velha");
        setSize(350, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }

    private void criarStatusLabel() {
        statusLabel = new JLabel("Vez do jogador: " + jogo.getJogadorAtual());
        add(statusLabel);
    }

    private void criarTabuleiroDeBotoes() {
  
        JPanel painelTabuleiro = new JPanel();
        painelTabuleiro.setLayout(new BoxLayout(painelTabuleiro, BoxLayout.Y_AXIS));

        for (int linha = 0; linha < 3; linha++) {
    
            JPanel painelLinha = new JPanel();
            painelLinha.setLayout(new BoxLayout(painelLinha, BoxLayout.X_AXIS));

            for (int coluna = 0; coluna < 3; coluna++) {
                JButton botao = new JButton(" ");

                final int l = linha;
                final int c = coluna;

                botao.addActionListener(e -> tratarClique(l, c));

                botoes[linha][coluna] = botao;
                painelLinha.add(botao);
            }

            painelTabuleiro.add(painelLinha);
        }

        add(painelTabuleiro);
    }

    private void criarBotaoReiniciar() {
        JButton botaoReiniciar = new JButton("Reiniciar Jogo");
        botaoReiniciar.addActionListener(e -> {
            jogo.reiniciar();
            atualizarTabuleiroNaTela();
            statusLabel.setText("Vez do jogador: " + jogo.getJogadorAtual());
        });
        add(botaoReiniciar);
    }

    private void tratarClique(int linha, int coluna) {
        char jogadorQueJogou = jogo.getJogadorAtual();
        boolean jogadaValida = jogo.jogar(linha, coluna);

        if (!jogadaValida) {
            return;
        }

        botoes[linha][coluna].setText(String.valueOf(jogadorQueJogou));

        if (jogo.isJogoFinalizado()) {
            if (jogo.verificarVencedor()) {
                statusLabel.setText("Jogador " + jogadorQueJogou + " venceu!");
                desabilitarTodosOsBotoes();
            } else {
                statusLabel.setText("Empate!");
            }
        } else {
            statusLabel.setText("Vez do jogador: " + jogo.getJogadorAtual());
        }
    }

    private void desabilitarTodosOsBotoes() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                botoes[linha][coluna].setEnabled(false);
            }
        }
    }

    private void atualizarTabuleiroNaTela() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                char valor = jogo.getValorCasa(linha, coluna);
                botoes[linha][coluna].setText(valor == ' ' ? " " : String.valueOf(valor));
                botoes[linha][coluna].setEnabled(true);
            }
        }
    }
}