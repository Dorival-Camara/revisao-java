import java.util.Scanner;

public class exer06{
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe um número inteiro de 1 a 10 : ");
        int numero = scanner.nextInt();

        while (numero < 1 || numero > 10){
            System.out.println("Esse número é invalido informe novamente!!!");
            numero = scanner.nextInt();
        }
        System.out.println("Esse número "+numero+" é válido!");
    }
}