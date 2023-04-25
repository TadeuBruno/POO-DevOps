import javax.xml.stream.events.Comment;

public class Main {
    public static void main(String[] args) {
        vendedor obj1 = new vendedor(123456789009l, "Feijão", "Sim", 10);
        System.out.println(obj1.calcularSalario(50));
        System.out.println(obj1.calcularSalario(50, 100));
        System.out.println(obj1.calcularSalario());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Externo obj2 = new Externo(10, "Feijão", "não", 1, 10, 10);
        System.out.println(obj2.calcularSalario());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Commis obj3 = new Externo(10, "Feijão", "não", 1, 10, 10);
        System.out.println(obj2.calcularSalario());
    }
}