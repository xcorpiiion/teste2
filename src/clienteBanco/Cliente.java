
package clienteBanco;

public class Cliente {
    private String name;
    private int numeroConta;
    private double valorConta;
    private final int taxa = 5;

    public Cliente(String name, int numeroConta, double valorConta) {
        this.name = name;
        this.numeroConta = numeroConta;
        this.valorConta = valorConta;
    }

    public Cliente(String name, int numeroConta) {
        this.name = name;
        this.numeroConta = numeroConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getValorConta() {
        return valorConta;
    }
    
    public void deposito(double valorDeposito){
        this.valorConta += valorDeposito;
    }
    
    public void saque(double valorSaque){
        if(this.valorConta >= valorSaque) {
            this.valorConta -= valorSaque - taxa; // diminui o saldo da conta pelo saque e pela taxa de 5 reais
            
        }
    }
    
    public void cadastrarCliente(String nome, int numeroConta, double valorConta){
        this.name = nome;
        this.numeroConta = numeroConta;
        this.valorConta = valorConta;
    }

    @Override
    public String toString() {
        return "Cliente = " + name + ", Número da Conta = " + numeroConta + ", saldo da Conta = " + valorConta;
    }
    
    
    
}
