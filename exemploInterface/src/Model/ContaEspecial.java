package Model;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numConta, double limite) {
        super(numConta);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + limite){
            super.sacar(valor);
        }
    }
}
