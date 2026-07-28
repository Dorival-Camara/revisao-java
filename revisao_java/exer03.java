import java.util.Scanner;

public class exer03 {
    public static  void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe um número inteiro para analisa-lo : ");
        int n1 = scanner.nextInt();

        String resultado = (n1 < 0) ? "é negativo" : (n1 == 0 ) ? "é nulo" : "é negativo";

        if (n1 % 2 == 0){
            System.out.println("Seu número " +resultado+ " e par");
        } 
        else{
            System.out.println("Seu número "+ resultado + " e ímpar");
        }

    }
}