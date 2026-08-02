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

            switch (opcao){

                case 1: 
                if(totalSala >= 3) {
                    System.out.println("Limite de salas atingido!!");
                }
                else{
                        scanner.nextLine();

                        System.out.println("Digite o nome da slaa: ");
                        nomeDaSala[totalSala] = scanner.nextLine();

                        System.out.println("Digite o nome do espetáculo: ");
                        espetaculos[totalSala] = scanner.nextLine();

                        precoInteiro[totalSala] = tabelaPreco[totalSala];

                        System.out.println("Preço da sala : R$ " + precoInteiro[totalSala]);

                        totalSala++;
                        System.out.println("Sala cadastrada com sucesso!!");
                    }
                    break;

                case 2: 
                    if (totalSala == 0){
                        System.out.println("Cadastre a sala primeiro!!");
                    }

                    else{
                        System.out.println("\nSalas cadastradas: ");
                        for (int i = 0; i < totalSala; i++){
                            System.out.println(i + " - "+ nomeDaSala[i]);
                        }

                        System.out.println("Escolha a sala : ");
                        int escolha = scanner.nextInt();

                        if (escolha >= 0 && escolha < totalSala){
                            salaSelecionada = escolha;
                            System.out.println("Sala selecionada!!");
                        }
                        else{
                            System.out.println("Sala inválida!!");
                        }
                    }
                    break;
                 
                case 3:
                    if (salaSelecionada == -1){
                        System.out.println("Selecione uma sala primeiro!!");
                    }    
                    else{
                        int livres = 0;
                        int reservadas = 0;
                        int ocupadas = 0;

                        System.out.println("\nSala : " + nomeDaSala[salaSelecionada]);
                        System.out.println("Espetáculo : "+ espetaculos[salaSelecionada]);
                        System.out.println("Inteira : " + precoInteiro[salaSelecionada] + " | Meia: R$ " + (precoInteiro[salaSelecionada] / 2));

                        System.out.println("   1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20");

                        for (int i = 0; i< 20; i++){
                            System.out.println(letras[i] + " ");

                            for (int c = 0; c < 20; c++){
                                char estado = cadeiras[salaSelecionada][i][c];

                                if (estado == 'L') {
                                    System.out.println("[ ]");
                                    livres++;
                                }
                                else if (estado == 'R') {
                                    System.out.println("[R]");
                                    reservadas++;
                                }
                                else{
                                    System.out.println("[X]");
                                    ocupadas++;
                                }
                            }
                            System.out.println();
                        }
                        System.out.println("livres: " + livres + " | Reservadas: " + reservadas + " | Ocupadas: " + ocupadas );
                    }
                    break;
                
                case 4:
                    if(salaSelecionada == -1){
                        System.out.println("Selecione uma sala primeiro!!");
                    }    
                    else{
                        System.out.println("Linha (A - V): ");
                        char linha = scanner.next().toUpperCase().charAt(0);

                        System.out.println("Coluna (1 - 20)");
                        int coluna = scanner.nextInt();

                        int l = linha - 'A';
                        int c = coluna - '1';

                        if(l < 0 || 1 >= 12 || c < 0 || c >= 12){
                            System.out.println("Posição inválida!!");
                        }
                        else{
                            if(cadeiras[salaSelecionada][l][c] == 'L') { 
                                cadeiras[salaSelecionada][l][c] = 'R';
                                double valor = precoInteiro[salaSelecionada] / 2;
                                System.out.println("Reservado! Valor: R$ " + valor);
                        }
                        else{
                            System.out.println("Assento indisponível!!");
                        }
                    }
            }
            break;


        }   while (opcao != 0); 




    }
}