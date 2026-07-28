import java.util.Scanner;

public class exer02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Bme vindo ao conversor de Celcius para Farenheit!!\n");
        System.out.println("Informe uma temperatura em Celcius : ");
        Double temperatura = scanner.nextDouble();

        Double conversor = ((temperatura * 1.8) + 32);

        System.out.println("A sua temperatura em farenheit é de : "+ conversor+ " graus ");

    }
}