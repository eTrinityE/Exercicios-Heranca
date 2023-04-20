package ex3;

public class Funcionario extends Pessoa {

    private int matricula;
    private double salario;

    public Funcionario() {}

    public Funcionario(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome);
        this.matricula = matricula;
        setSalario(salario);
    }

    public void setSalario(double valor) {
        if (valor >= 0) {
            this.salario = valor;
        }
    }

    public double getSalarioPrimeiraParcela() {
        return salario * 0.6;
    }

    public double getSalarioSegundaParcela() {
        return salario * 0.4;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

}
