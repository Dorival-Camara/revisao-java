import java.util.Scanner;

public class exer01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua primeira nota : ");
        Double nota1 = scanner.nextDouble();

        System.out.println("\nInsira sua segunda nota :  ");
        Double nota2 = scanner.nextDouble();

        System.out.println("\nInsira sua terceira nota :  ");
        Double nota3 = scanner.nextDouble();

        System.out.println("\nInsira sua quarta e ultima nota : ");
        Double nota4 = scanner.nextDouble();

        Double media = ((nota1 + nota2 + nota3+ nota4)/4);

        System.out.println("Sua média é de : "+media);


    }
}