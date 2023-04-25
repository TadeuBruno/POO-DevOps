public class Comissionado extends vendedor{
    private double percComissao;


    public Comissionado(long cpf, String nome, String cargo, double salarioBase, double percComissao) {
        super(cpf, nome, cargo, salarioBase);
        this.percComissao = percComissao;
    }

    public double getPercComissao() {
        return percComissao;
    }

    public void setPercComissao(double percComissao) {
        this.percComissao = percComissao;
    }

    @Override
    public String toString() {
        return "Comissionado{" +
                "percComissao=" + percComissao +
                '}';
    }
    double calcularSalario(){
        return getSalarioBase() + percComissao;
    }
}
