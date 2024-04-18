package Funcionario;

public class Contratacao {
    public static Funcionario contratarFuncionario(int id, String nome, double salario, int bancoDeHoras, String horaEntrada, String horaSaida, int diaFimContrato, int mesFimContrato, int anoFimContrato) {
        if (bancoDeHoras > 0) {
            return new FuncionarioIntegral(id, nome, salario, bancoDeHoras);
        } else if (!horaEntrada.isEmpty() && !horaSaida.isEmpty()) {
            return new FuncionarioParcial(id, nome, salario, horaEntrada, horaSaida);
        } else {
            return new FuncionarioTemporario(id, nome, salario, diaFimContrato, mesFimContrato, anoFimContrato);
        }
    }
}