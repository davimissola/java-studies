package modelos;

public class Moto extends Veiculo implements Lavavel {
    public Moto(String placa, String modelo, int horasEstacionada) {
        super(placa, modelo, horasEstacionada);
    }

    @Override
    public double calcularValor() {
        return getHorasEstacionada() * 4;
    }

    @Override
    public double calcularLavagem() {
        return 15;
    }
}
