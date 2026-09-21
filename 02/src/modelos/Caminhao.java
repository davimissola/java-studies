package modelos;

public class Caminhao extends Veiculo {
    public Caminhao(String placa, String modelo, int horasEstacionada) {
        super(placa, modelo, horasEstacionada);
    }

    @Override
    public double calcularValor() {
        return getHorasEstacionada() * 15;
    }
}
