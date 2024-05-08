import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      Scanner sca = new Scanner (System.in);

      System.out.println("Qual a sua agência?");
        String agencia = sca.next();

      System.out.println("Qual o seu nome?");
        String nomeCliente = sca.next();

      System.out.println("Qual o numero da conta?");
        int numerodaConta = sca.nextInt();

      System.out.println("qual o saldo?");
        Double saldo = sca.nextDouble();

        System.out.println("Olá " +nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia + ", conta " +numerodaConta + "e seu saldo " + saldo + " já está disponível para saque.");
        sca.close();
      }
    }
