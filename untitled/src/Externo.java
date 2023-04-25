public class Externo extends vendedor{
    private double percComissao;
    private double adiconal;


    public Externo(long cpf, String nome, String cargo, double salarioBase, double percComissao, double adiconal) {
        super(cpf, nome, cargo, salarioBase);
        this.percComissao = percComissao;
        this.adiconal = adiconal;
    }

    @Override
    public String toString() {
        return "Externo{" +
                "percComissao=" + percComissao +
                ", adiconal=" + adiconal +
                '}';
    }

    double calcularSalario(){
        return getSalarioBase() + percComissao + adiconal;
    }
}
