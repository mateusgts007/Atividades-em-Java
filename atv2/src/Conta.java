public class Conta {

    private float saldo;
    private int numero;
    private int agencia;
    private String nomeCliente;

    public float getSaldo() {
        return saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /// construtor
    public Conta(float saldo, int numero, int agencia, String nomeCliente){
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
    }

    public void sacar (float valor){

        if (valor <= this.saldo) {
            saldo -= valor;
        }
    }

    public void depositar (float valor) {

        if (valor > 0){
            saldo += valor;
        }
    }

    public void transferir (float valor, Conta contaDestino){

        if (this.saldo >= valor) {

            sacar(valor);

            contaDestino.depositar(valor);

            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");

        } else {

        }
            System.out.println("Saldo insuficiente para transferência.");
        }
}
