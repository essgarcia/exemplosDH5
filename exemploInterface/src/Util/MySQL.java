package Util;

import Model.Conta;

public class MySQL implements BancoDeDados{
    @Override
    public void gravar(Conta conta) {
        System.out.println("Gravando no BD MySQL a conta: " + conta.getNumConta());
    }
}
