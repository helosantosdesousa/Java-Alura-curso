package exericios.exericioBanco;

import java.util.Scanner;

/*Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(),
        sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da
        classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(),
        que desconta uma tarifa mensal da conta corrente.*/
public class ContaBancaria {
    Scanner e = new Scanner(System.in);
    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar() {
        System.out.println("Qual o valor do depósito?");
        double deposito = e.nextDouble();
        setSaldo(getSaldo()+deposito);
    }

    public void sacar() {
        System.out.println("Qual o valor do saque?");
        double saque = e.nextDouble();
        this.setSaldo(getSaldo() - saque);
    }

    public double consultarSaldo() {
        System.out.println("Saldo: " + getSaldo());
        return this.getSaldo();
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
