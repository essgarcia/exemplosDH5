package Model;

import Util.BancoDeDados;

public abstract class Conta {

    private int numConta;
    private double saldo;

    public Conta(int numConta){
        this.numConta = numConta;
    }

    public void depositar(double valor){
        saldo += valor;
    }


    public void sacar(double valor){
        saldo -= valor;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void gravar(BancoDeDados banco){
        banco.gravar(this);
    }
}
