public class vendedor {
    private long cpf;
    private String nome;
    private String cargo;
    private double salarioBase;

    public vendedor(long cpf, String nome, String cargo, double salarioBase) {
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }


    @Override
    public String toString() {
        return "vendedor{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public long getCpf() {
        return cpf;
    }


    public String getNome() {
        return nome;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    double calcularSalario(int desconto){
        double desconto_real = desconto/100;
        double novo_salario = salarioBase - (salarioBase*desconto_real);
        return novo_salario;
    }

    double calcularSalario(int desconto, int comissao){
        double desconto_real = desconto/100;
        double novo_salario = salarioBase - (salarioBase*desconto_real);
        return novo_salario+comissao;
    }

    double calcularSalario(){
        return salarioBase;
    }
}
