package ex6;

public class TesteSobrescrita {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        animal.fazerBarulho();
        cachorro.fazerBarulho();
    }
}
