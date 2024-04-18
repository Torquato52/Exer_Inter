package Funcionario;

public class FuncionarioIntegral extends Funcionario {
    private int bancoDeHoras;

    public FuncionarioIntegral(int id, String nome, double salario, int bancoDeHoras) {
        super(id, nome, salario);
        this.bancoDeHoras = bancoDeHoras;
    }

    public int getBancoDeHoras() {
        return this.bancoDeHoras;
    }

    public void setBancoDeHoras(int bancoDeHoras) {
        this.bancoDeHoras = bancoDeHoras;
    }
}
