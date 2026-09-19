public class Banco {
    private double saldo = 0;

    public double getSaldo() {
        return saldo;
    }

    public boolean depositarSaldo(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean sacarSaldo(double valor) {
        if (valor < 0 || saldo - valor < 0) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}
