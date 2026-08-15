public class jogoDaVelha {


    private char[][] tabuleiro;


    private char jogadorAtual;


    private boolean jogoFinalizado;


    public jogoDaVelha() {
        tabuleiro = new char[3][3];
        jogadorAtual = 'X';
        jogoFinalizado = false;
        inicializarTabuleiro();
    }


    private void inicializarTabuleiro() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = ' ';
            }
        }
    }

    public boolean jogar(int linha, int coluna) {
    
        if (jogoFinalizado) {
            return false;
        }

       
        if (tabuleiro[linha][coluna] != ' ') {
            return false;
        }

       
        tabuleiro[linha][coluna] = jogadorAtual;

     
        if (verificarVencedor()) {
            jogoFinalizado = true;
        } else if (tabuleiroCheio()) {
            jogoFinalizado = true; 
        } else {
            trocarJogador();
        }

        return true;
    }

 
    private void trocarJogador() {
        if (jogadorAtual == 'X') {
            jogadorAtual = 'O';
        } else {
            jogadorAtual = 'X';
        }
    }

    
    public boolean verificarVencedor() {
        char j = jogadorAtual;

    
        for (int linha = 0; linha < 3; linha++) {
            if (tabuleiro[linha][0] == j && tabuleiro[linha][1] == j && tabuleiro[linha][2] == j) {
                return true;
            }
        }

     
        for (int coluna = 0; coluna < 3; coluna++) {
            if (tabuleiro[0][coluna] == j && tabuleiro[1][coluna] == j && tabuleiro[2][coluna] == j) {
                return true;
            }
        }

     
        if (tabuleiro[0][0] == j && tabuleiro[1][1] == j && tabuleiro[2][2] == j) {
            return true;
        }

       
        if (tabuleiro[0][2] == j && tabuleiro[1][1] == j && tabuleiro[2][0] == j) {
            return true;
        }

        return false;
    }


    public boolean tabuleiroCheio() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (tabuleiro[linha][coluna] == ' ') {
                    return false; 
                }
            }
        }
        return true;
    }

    public void reiniciar() {
        inicializarTabuleiro();
        jogadorAtual = 'X';
        jogoFinalizado = false;
    }


    public char getValorCasa(int linha, int coluna) {
        return tabuleiro[linha][coluna];
    }

    public char getJogadorAtual() {
        return jogadorAtual;
    }

    public boolean isJogoFinalizado() {
        return jogoFinalizado;
    }
}