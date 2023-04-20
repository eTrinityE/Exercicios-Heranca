package ex4;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(0);
        Poupanca p = new Poupanca(0, 15);

        c.depositar(10000);
        c.sacar(15000);
        p.depositar(15000);
        p.sacar(20000);

        System.out.println("Saldo da Conta: " + c.getSaldo());
        System.out.println("Saldo da Poupança: " + p.getSaldo());
    }
}
