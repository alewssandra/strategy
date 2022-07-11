package br.edu.ifsc.gofstrategy;

import java.util.Scanner;

public class AgostoStrategy extends Strategy {

    //implementando o método
    @Override
    public void meses() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número referente ao mês desejado");
        int numero = entrada.nextInt();

        if (numero == 8) {
            System.out.println("O mês é Agosto!");

        } else {
            System.out.println("Não existe um mês correspondente ao número escolhido! Mude a instancia do mes na classe Meses.");
        }
    }

}
