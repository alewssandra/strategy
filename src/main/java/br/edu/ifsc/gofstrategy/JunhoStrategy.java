package br.edu.ifsc.gofstrategy;

import java.util.Scanner;

public class JunhoStrategy extends Strategy {

    //implementando o método
    @Override
    public void meses() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número referente ao mês desejado");
        int numero = entrada.nextInt();

        if (numero == 6) {
            System.out.println("O mês é Junho!");

        } else {
            System.out.println("Não existe um mês correspondente ao número escolhido! Mude a instancia do mes na classe Meses.");
        }
    }

}
