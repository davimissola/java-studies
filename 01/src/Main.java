import java.util.Scanner;

public class Main {
    static int opcao;
    static Scanner scanner = new Scanner(System.in);
    static Banco meuBanco = new Banco();


    static void main(String[] args) {
        do {
            seletorOpcao();
        } while(opcao != 0);
    }

    public static void seletorOpcao() {
        System.out.println("[0] Finalizar Programa");
        System.out.println("[1] Ver Saldo");
        System.out.println("[2] Depositar");
        System.out.println("[3] Sacar");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 0 -> System.out.println("Programa finalizado.");
            case 1 -> verSaldo();
            case 2 -> Depositar();
            case 3 -> Sacar();
        }
    }

    public static void verSaldo() {
        System.out.println("Saldo -> " + meuBanco.getSaldo());
    }

    public static void Depositar() {
        System.out.println("Digite a Quantidade que Quer Depositar : ");
        double valor = scanner.nextDouble();
        if (meuBanco.depositarSaldo(valor)) {
            System.out.println("Saldo atualizado");
        } else {
            System.out.println("Não foi possível depositar este valor.");
        }
    }

    public static void Sacar() {
        System.out.println("Digite a Quantidade que Quer Sacar : ");
        double valor = scanner.nextDouble();
        if (meuBanco.sacarSaldo(valor)) {
            System.out.println("Saldo atualizado");
        } else {
            System.out.println("Não foi possível sacar este valor.");
        }
    }
}