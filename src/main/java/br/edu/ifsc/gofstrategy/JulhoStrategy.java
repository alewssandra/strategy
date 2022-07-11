package br.edu.ifsc.gofstrategy;

import java.util.Scanner;

public class JulhoStrategy extends Strategy {

    //implementando o método
    @Override
    public void meses() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número referente ao mês desejado");
        int numero = entrada.nextInt();

        if (numero == 7) {
            System.out.println("O mês é Julho!");

        } else {
            System.out.println("Não existe um mês correspondente ao número escolhido! Mude a instancia do mes na classe Meses.");
        }
    }

}
