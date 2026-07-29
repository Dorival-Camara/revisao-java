import java.util.Scanner;

public class exer10{
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
        double[] temperaturas = new double[7];
        double soma = 0;

        for (int i = 0; i < 7; i++){
            System.out.println("Informe a temperatura do dia "+(i+1)+"° : ");
            temperaturas[i] = scanner.nextDouble();
            soma = soma + temperaturas[i];
        }

        double media = soma / 7;

        int diasAcimaDaMedia = 0;
        for (int i = 0; i < 7; i++){
            if (temperaturas[i] > media){
                diasAcimaDaMedia++;
            }
        }

        System.out.println("A média semanal foi de "+media);
        System.out.println("Dias acima da média : "+diasAcimaDaMedia);
    }
}
