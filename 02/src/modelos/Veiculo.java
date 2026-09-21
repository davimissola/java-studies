package modelos;

public class Veiculo {
    private String placa;
    private String modelo;
    private int horasEstacionada;


    public Veiculo(String placa, String modelo, int horasEstacionada) {
        if (placa.length() != 7 || horasEstacionada < 0) {
            return;
        }
        this.placa = placa;
        this.modelo = modelo;
        this.horasEstacionada = horasEstacionada;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getHorasEstacionada() {
        return horasEstacionada;
    }

    public double calcularValor() {
        // ideal seria fazer com classe abstrata eu acho, mas não sei como fazer em java ainda
        return 0.0;
    }
}
