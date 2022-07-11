

package br.edu.ifsc.gofstrategy;

import java.util.Scanner;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Client {

    public static void main(String[] args) {
        
        System.out.println("--------------");
        System.out.println("-------Hello World!---------");
        
        //criando um novo objeto
        Meses meses = new Meses();
        meses.MesesDoAno();
        
         //Quando quiser mudar o mes do ano
        //troca a instancia do mes
        
        //setando o mês/um novo mes

        meses.setStrategy(new MarcoStrategy());
        //meses.setStrategy(new MaioStrategy());
        meses.MesesDoAno();
        
    }
}
