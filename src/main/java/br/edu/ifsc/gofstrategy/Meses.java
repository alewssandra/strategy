package br.edu.ifsc.gofstrategy;

import java.util.Scanner;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Meses {

    /* enum nivel {
       JANEIRO, FEVEREIRO, MARCO, ABRIL...
    }
     */
    private Strategy strategy;

    public void setStrategy(Strategy st) {
        this.strategy = st;

    }

    public Meses() {
        
        //Quando quiser mudar o mes 
        //troca a instancia do mes   
        
        //strategy = new MaioStrategy();
        strategy = new MarcoStrategy();
        
    
        
    }
    
    public void MesesDoAno(){
        
          //criar meses
        //ao invés de criar switch, criar uma classe para cada case
       
        
        /*
        switch (numero) {
            case 1:
                System.out.println("O mês é Janeiro!");
                break;
            case 2:
                System.out.println("O mês é Fevereiro!");
                break;
            case 3:
                System.out.println("O mês é Março!");
                break;
            case 4:
                System.out.println("O mês é Abril!");
                break;
            case 5:
                System.out.println("O mês é Maio!");
                break;
            case 6:
                System.out.println("O mês é Junho!");
                break;
            case 7:
                System.out.println("O mês é Julho!");
                break;
            case 8:
                System.out.println("O mês é Agosto!");
                break;
            case 9:
                System.out.println("O mês é Setembro!");
                break;
            case 10:
                System.out.println("O mês é Outubro!");
                break;
            case 11:
                System.out.println("O mês é Novembro!");
                break;
            case 12:
                System.out.println("O mês é Dezembro!");
                break;
            default:
                System.out.println("Não existe um mês correspondente ao número escolhido! Digite um número entre 1 a 12.");
        }
    }
         */
        
    strategy.meses();
    
     
        
    }
}
