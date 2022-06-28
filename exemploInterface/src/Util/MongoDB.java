package Util;

import Model.Conta;

public class MongoDB implements BancoDeDados{
    public void gravar(Conta conta) {
        System.out.println("Gravando no BD MongoDB a conta: " + conta.getNumConta());
    }
}