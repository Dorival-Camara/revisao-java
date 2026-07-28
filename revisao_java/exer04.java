import java.util.Scanner;

public class exer04 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo ao verificador de idade!!!\n");
        System.out.println("Informe o ano atual : \n");
        int anoA = scanner.nextInt();

        System.out.println("Informe agora a data de seu nascimento : \n");
        int dataN = scanner.nextInt();

        int calcIdade = (anoA - dataN);

        if (calcIdade < 0){
            System.out.println("Essa idade não é válida!!");
        }

        else if (calcIdade <= 12 ){
            System.out.println("Você tem "+calcIdade+" ano(s) é menor de idade e tem direito a desconto.");
        }

        else if (calcIdade > 12 && calcIdade < 18){
            System.out.println("Você tem "+calcIdade+" ano(s) é menor de idade e não tem direito a desconto.");
        }

        else if (calcIdade >= 18 && calcIdade < 60){
            System.out.println("Você tem "+calcIdade+" ano(s) é maior de idade e não tem direito a desconto.");
        }

        else {
            System.out.println("Você tem  "+calcIdade+ ", ano(s) é maior de idade e tem direito a desconto.");
        }
    }
}