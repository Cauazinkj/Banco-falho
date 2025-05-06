package banco.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float valor;

        ContaBanco p1 = new ContaBanco();
        p1.setDono("Cauã de Paula");
        p1.setNumConta(6969);
        p1.abrirConta("CP");
        p1.estadoAtual();

    }
}
