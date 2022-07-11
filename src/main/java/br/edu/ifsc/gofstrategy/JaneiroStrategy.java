package br.edu.ifsc.gofstrategy;

import java.util.Scanner;

//criando uma estratégia para cada mes que tenho
//e cada estratégia vai herdar da classe abstract Strategy
public class JaneiroStrategy extends Strategy {

    @Override
    public void meses() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número referente ao mês desejado");
        int numero = entrada.nextInt();

        if (numero == 1) {
            //é o que tava dentro do switch
            System.out.println("O mês é Janeiro!");

        } else {
            System.out.println("Não existe um mês correspondente ao número escolhido! Mude a instancia do mes na classe Meses.");
        }

    }

}
