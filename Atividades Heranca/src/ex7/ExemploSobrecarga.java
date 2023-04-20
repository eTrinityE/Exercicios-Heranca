package ex7;

public class ExemploSobrecarga {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        ExemploSobrecarga exemplo = new ExemploSobrecarga();
        System.out.println(exemplo.somar(2, 3)); // imprime 5
        System.out.println(exemplo.somar(2.5, 3.5)); // imprime 6.0
        System.out.println(exemplo.somar(2, 3, 4)); // imprime 9
    }
}
