import java.util.Scanner;

public class exer09{
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Informe o número "+(i+1)+" : ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Qual número você quer buscar? ");
        int busca = scanner.nextInt();

        int contador = 0;
        for (int i = 0; i < 10; i++){
            if (vetor[i] == busca){
                contador++;
            }
        }

        if (contador > 0){
            System.out.println("O número "+busca+" foi encontrado "+contador+" vez(es)!");
        } else {
            System.out.println("O número "+busca+" não foi encontrado!");
        }
    }
}