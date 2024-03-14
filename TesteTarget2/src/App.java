import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificarFibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        return false;
    }
}
