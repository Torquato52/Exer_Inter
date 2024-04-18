package Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = Contratacao.contratarFuncionario(1, "Cleber", 2000, 0, "", "", 0, 0, 0);

        System.out.println("Funcionário");
        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}