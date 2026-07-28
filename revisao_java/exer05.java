import java.util.Scanner;

public class exer05 {
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.print("Informe um número para eu mostrar a tabuada até o 10 : ");
        int numero = scanner.nextInt();
        System.out.println("\n");

        for (int i = 0; i <= 10; i++){
            int resultado = numero * i ;
            System.out.println(numero+ " x " +i+ " é :"+resultado+"\n");
        }
    }
}