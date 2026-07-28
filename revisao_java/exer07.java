import java.util.Scanner;

public class exer07
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Vetor na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}