package ex5;

public class Equipamento {
    private boolean ligado;

    public void liga() {
        ligado = true;
    }

    public void desliga() {
        ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }
}

