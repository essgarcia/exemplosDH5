package Model;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numConta) {
        super(numConta);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()){
            super.sacar(valor);
        }
    }
}
