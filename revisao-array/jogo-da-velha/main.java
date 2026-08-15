import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {   // <- essa linha sumiu
            @Override
            public void run() {
                telaJogo tela = new telaJogo();        // <- nome da classe errado (telaJogo vs TelaJogo)
                tela.setVisible(true);
            }
        });
    }
}