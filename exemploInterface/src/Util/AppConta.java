package Util;

import Model.Conta;
import Model.ContaCorrente;
import Model.ContaEspecial;
import java.util.ArrayList;
import java.util.HashMap;

public class AppConta {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(111);
        ContaEspecial ce1 = new ContaEspecial(222, 1000);

        MySQL mySQL = new MySQL();
        MongoDB mongo =  new MongoDB();

        ArrayList<Conta> contasList = new ArrayList<>();
        contasList.add(cc1);
        contasList.add(ce1);

        /*for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).getNumConta());
        }*/

        for ( Conta c: contasList) {
            if (c.getNumConta() == 111){
                System.out.println("Conta: " + c.getNumConta());
            }
        }

        // HashMap
        HashMap<Integer, Conta> mapaContas = new HashMap<>();
        mapaContas.put(cc1.getNumConta(), cc1);
        mapaContas.put(ce1.getNumConta(), ce1);

        Conta contaEncontrada = mapaContas.get(111);
        System.out.println("Conta Encontrada no HashMap: " + contaEncontrada.getNumConta());

        //cc1.gravar(mySQL);
        //ce1.gravar(mongo);
    }
}
