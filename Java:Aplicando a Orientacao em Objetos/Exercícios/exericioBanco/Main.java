package exericios.exericioBanco;

import java.util.Scanner;

public class Main {
    static Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        ContaCorrente conta[] = new ContaCorrente[3];

        conta[0] = new ContaCorrente (1000, "Ana Júlia Silva", 'p');
        conta[1] = new ContaCorrente(500, "Kratos", 'c');
        conta[2] = new ContaCorrente(20000, "Fernanda Montenegro", 'i');

        int resp=1;
        int escolha;

        System.out.println("Qual conta vai manipular?");
        escolha = e.nextInt();

        if (escolha>conta.length-1){
            System.out.println("Conta inexistente! Reinicie o programa");
        }


        do {
            System.out.println("********* BANCO NAYEON ***********");
            System.out.println("0 - Fechar");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar");
            System.out.println("4 - Cobrar Mensalidade");
            resp = e.nextInt();

            switch (resp){
                case 1:
                    conta[escolha].sacar();
                    break;
                case 2:
                    conta[escolha].depositar();
                case 3:
                    conta[escolha].consultarSaldo();
                    break;
                case 4:
                    conta[escolha].cobrarTarifaMensal();
            }



        } while (resp!=0);


    }
}
