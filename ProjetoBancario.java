package maria.maria;

public class ProjetoBancario {

    int numero;
    int agencia;
    double saldo;

    // vazio
    public ProjetoBancario() {
    }

    // com parâmetros
    public ProjetoBancario(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void retirar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {

        ProjetoBancario conta = new ProjetoBancario(123, 1, 1000.0);

        conta.depositar(1000);
        conta.retirar(432);

        System.out.println("Saldo atual: " + conta.verificarSaldo());
    }
}