import java.util.Scanner;

public class teatro {
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        String[] nomeDaSala = new String[3];
        String[] espetaculos = new String[3];
        Double[] precoInteiro = new Double[3];
        char[][][] cadeiras = new char[3][20][20];
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L','M', 'N', 'O', 'P', 'R', 'T', 'U' ,'V'};
        Double[] tabelaPreco = {150.0, 180.0, 300.0};

        int totalSala = 0;
        int salaSelecionada = -1;
        int opcao;

        for (int s = 0; s < 3; s++){
            for(int i = 0; i < 20; i++){
                for (int j = 0; j < 20; j++){
                    cadeiras[s][i][j] = 'L';
                }
            }
        }

        do {
            System.out.println("\n-------------------------------------------");
            System.out.println("        SEJA BEM VINDO AO TEATRO!!!");
            System.out.println("---------------------------------------------");
            System.out.println("1 - Cadastro de sala");
            System.out.println("2 - Selecionar sapa");
            System.out.println("3 - Exibir mapa da plateia");
            System.out.println("4 - Reservar assento");
            System.out.println("5 - Comprar assento");
            System.out.println("6 - Cancelar reserva");
            System.out.println("7 - Relatório financeiro");
            System.out.println("0 - Finalizar programa");
            System.out.println("\n Digite a opção desejada");
            opcao = scanner.nextInt();

            
        }   while (opcao != 0); 




    }
}