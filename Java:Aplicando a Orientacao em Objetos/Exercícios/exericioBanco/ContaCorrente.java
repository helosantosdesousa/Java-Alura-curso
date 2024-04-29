package exericios.exericioBanco;

import java.util.Scanner;

/*Em seguida, crie uma subclasse ContaCorrente que herda da
        classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(),
        que desconta uma tarifa mensal da conta corrente.*/
public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo, String titular, char tipoConta) {
        super(saldo);
        this.titular = titular;
        this.tipoConta = tipoConta;
    }

    protected String titular;
    protected char tipoConta;
    protected double mensalidade;

    public double verificarTipoConta(){
        switch (tipoConta){
            case 'c':
              mensalidade=10;
              break;
            case 'p':
                mensalidade = 20;
                break;
            case 'i':
                mensalidade = 0;
        }
        return mensalidade;
    }
    public void cobrarTarifaMensal(){
        this.setSaldo(getSaldo()-mensalidade);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public char getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(char tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
