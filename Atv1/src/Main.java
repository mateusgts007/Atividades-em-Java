import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int op;
        float soma = 0;
        Scanner leitura = new Scanner (System.in);

        do {

            String menu = """ 
                            Menu
                            1 - Sanduiche - R$ 5,00
                            2 - Coxinha - R$ 6,00
                            3 - coca - R$ 7,00
                            4 - cuscuz com charque - R$12,00
                            5 - Cafe 300ml - R$ 5,00
                            0 - Sair
                    """;
            System.out.println("Informe a opcao desejada:");

            op = leitura.nextInt();

            switch(op){

                case 1:
                    soma += 5;
                    break;

                case 2:
                    soma += 6;
                    break;

                case 3:
                    soma += 7;
                    break;

                case 4:
                    soma += 12;
                    break;
                case 5:
                    soma+= 5;
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
            }
        }while(op != 0);

        System.out.println("O valor gasto foi: " + soma);

    }
}