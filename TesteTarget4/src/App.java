import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você está em uma sala com três interruptores. Você pode ligar e desligar os interruptores.");
        System.out.println("Após fazer isso, informe se as lâmpadas estão acesas ou apagadas.");

        System.out.println("Ligue o primeiro interruptor e espere alguns minutos. Em seguida, desligue-o.");
        System.out.println("Ligue o segundo interruptor e entre na sala das lâmpadas.");

        System.out.print("As lâmpadas estão acesas? (s/n): ");
        char resposta = scanner.next().charAt(0);

        if (resposta == 's') {
            System.out.println("O segundo interruptor controla a lâmpada que está acesa.");
        } else {
            System.out.println("As lâmpadas estão apagadas. Elas estão quentes? (s/n): ");
            resposta = scanner.next().charAt(0);
            
            if (resposta == 's') {
                System.out.println("O primeiro interruptor controla a lâmpada que está quente.");
            } else {
                System.out.println("O terceiro interruptor controla a lâmpada que está fria.");
            }
        }

        scanner.close();
    }
}
