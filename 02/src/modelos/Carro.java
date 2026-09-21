package modelos;

public class Carro extends Veiculo implements Lavavel {
    public Carro(String placa, String modelo, int horasEstacionada) {
        super(placa, modelo, horasEstacionada);
    }

    @Override
    public double calcularValor() {
        return getHorasEstacionada() * 8;
    }

    @Override
    public double calcularLavagem() {
        return 30;
    }
}
