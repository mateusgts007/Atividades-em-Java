public class Main {

    public static void main(String[] args) {

        Conta contaOrigem = new ContaCorrente(1200, 001, 002, "Marcos", 01);
        Conta contaDestino = new ContaCorrente(1500, 003, 004, "Ana", 02);


        contaOrigem.depositar(100);
        contaOrigem.sacar(50);


        contaOrigem.transferir(100, contaDestino);

    }
}