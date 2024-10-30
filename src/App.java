
interface Funcionario {
    double calcularBonus();
}

// classe funcionarioassalariado
class FuncionarioAssalariado implements Funcionario {
    private double bonusFixo = 5000.00;

    public double calcularBonus() {
        return bonusFixo;
    }
}

// classe FuncionarioHorista
class FuncionarioHorista implements Funcionario {
    private double totalAnualRecebido;

    public FuncionarioHorista(double totalAnualRecebido) {
        this.totalAnualRecebido = totalAnualRecebido;
    }

    public double calcularBonus() {
        return totalAnualRecebido * 0.10;
    }
}

// classe principal
public class Main {
    public static void main(String[] args) {
        // vai estar fazendo o salario de um funcionário assalariado
        Funcionario funcionario1 = new FuncionarioAssalariado();
        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionario1.calcularBonus());

        // vai estar fazendo o salario de um funcionario horista com o tonal no ano que ele vai receber
        Funcionario funcionario2 = new FuncionarioHorista(1800.00); 
        System.out.println("Bônus do Funcionário Horista: R$ " + funcionario2.calcularBonus());
    }
}

