import java.util.Scanner;

public class App {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir a string
        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();

        // Chama o método para inverter a string
        String invertida = inverterString(entrada);

        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    // Método para inverter a string
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray(); // Converte a string em um array de caracteres

        int inicio = 0;
        int fim = str.length() - 1;

        // Inverte os caracteres
        while (inicio < fim) {
            // Troca o caractere no índice 'inicio' pelo caractere no índice 'fim'
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Move os índices para o próximo par de caracteres
            inicio++;
            fim--;
        }

        // Converte o array de caracteres de volta para uma string
        return new String(caracteres);
    }

}
