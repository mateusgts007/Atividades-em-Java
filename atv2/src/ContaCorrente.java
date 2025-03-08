public class ContaCorrente extends Conta {

        private int exemplo;

    public ContaCorrente(float saldo, int numero, int agencia, String nomeCliente, int exemplo) {
        super(saldo, numero, agencia, nomeCliente);
        this.exemplo = exemplo;
    }


}
