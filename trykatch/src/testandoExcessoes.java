import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class testandoExcessoes {
    
    public static void main(String[] args) throws Exception {
     
        try {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //// imprimindo dados do usuário
        System.out.println("Meu nome é: " + nome + " " + sobrenome);
        System.out.println("Tenho: " + idade + " anos");
        System.out.println("Minha altura: " + altura + "cm ");

        scanner.close();
        
        } 
        catch(InputMismatchException e ){
            System.out.println(" Formatação de altura ou idade inválida");
        }

    }
}
