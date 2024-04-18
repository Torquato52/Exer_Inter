package Funcionario;

public class FuncionarioParcial extends Funcionario{
    private String horaEntrada;
    private String horaSaida;

    public FuncionarioParcial(int id, String nome, double salario, String horaEntrada, String horaSaida) {
        super(id, nome, salario);
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public String getHoraEntrada() {
        return this.horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return this.horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

}
