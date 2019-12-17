/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbanco;

import clienteBanco.Cliente;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ExBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // TODO code application logic here
        // variaveis
        String nome = "";
        int numeroConta, numeroOperacao = 0;
        double valorDeposito;
        boolean isFinish = false;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o seu nome: ");
        nome = scanner.nextLine();
        System.out.printf("Informe o número da conta: ");
        numeroConta = scanner.nextInt();
        System.out.printf("Informe o valor de deposito: ");
        valorDeposito = scanner.nextDouble();

        Cliente cliente = new Cliente(nome, numeroConta, valorDeposito);
        
        while (!isFinish) {
            System.out.println("Informe um das opções abaixo");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Sacar Dinheiro");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Detalhes");
            System.out.println("5 - Sair");
            numeroOperacao = scanner.nextInt();
            switch (numeroOperacao) {
                case 1:
                    System.out.printf("Informe o seu nome: ");
                    nome = scanner.nextLine();
                    System.out.printf("Informe o número da conta: ");
                    numeroConta = scanner.nextInt();
                    System.out.printf("Informe o valor de deposito: ");
                    valorDeposito = scanner.nextDouble();

                    cliente.cadastrarCliente(nome, numeroConta, valorDeposito);
                    break;
                case 2:
                    System.out.printf("Informe o valor do saque: ");
                    valorDeposito = scanner.nextDouble();
                    cliente.saque(valorDeposito);
                    break;
                case 3:
                    System.out.printf("Informe o valor do depositar: ");
                    valorDeposito = scanner.nextDouble();
                    cliente.deposito(valorDeposito);
                    break;
                case 4:
                    System.out.println(cliente.toString());
                    break;
                default:
                    isFinish = true;
                    break;

            }
        }

    }

}
