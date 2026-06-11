import java.util.Scanner;

public class ContaTerminal{
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    Conta novaConta = new Conta();

    System.out.print("Digite o numero da sua conta: ");
    novaConta.setNumero(input.nextInt());
    input.nextLine();

    System.out.print("Digite a sua agencia: ");
    novaConta.setAgencia(input.nextLine());

    System.out.print("Digite o seu nome: ");
    novaConta.setNomeCliente(input.nextLine());

    System.out.print("Digite o seu saldo: ");
    novaConta.setSaldo(input.nextDouble());

    System.out.println("Olá "+ novaConta.getNomeCliente() +
    ", obrigado por criar uma conta em nosso banco, sua agência é "+ novaConta.getAgencia() +
    ", conta "+ novaConta.getNumero() +" e seu saldo "+ novaConta.getSaldo() +" já está disponível para saque");

  }
}
