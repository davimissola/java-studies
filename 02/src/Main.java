import modelos.Caminhao;
import modelos.Carro;
import modelos.Moto;

public class Main {
    public void main() {
        Carro carro1 = new Carro("A1B2C3D", "Gol", 5);
        Moto moto1 = new Moto("AA11BB2", "Motinha1", 2);
        Caminhao caminhao1 = new Caminhao("AAA111B","Caminhaozao", 1);

        System.out.println(carro1.calcularValor());
        System.out.println(carro1.calcularLavagem());

        System.out.println(moto1.calcularValor());
        System.out.println(moto1.calcularLavagem());

        System.out.println(caminhao1.calcularValor());
    }
}
