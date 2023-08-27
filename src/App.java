import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        corrida corrida = new corrida();
        String modeloCarro;
        String motorCarro;
        String fabricanteCarro;
        String nomeMotorista;
        float quilometragemInicial = 0F;
        float quilometragemFinal = 0F;
        float quilometragemTotal =0F;
        float valorTotal = 0F;

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Corrida-------");

        System.out.println("Modelo do Carro: ");
        modeloCarro = scanner.nextLine();
        corrida.setmodeloCarro(modeloCarro);

        System.out.println("Motor do Carro: ");
        motorCarro = scanner.nextLine();
        corrida.setmotorCarro(motorCarro);

        System.out.println("Fabricante do Carro: ");
        fabricanteCarro = scanner.nextLine();
        corrida.setfabricanteCarro(fabricanteCarro);

        System.out.println("Nome do Motorista: ");
        nomeMotorista = scanner.nextLine();
        corrida.setnomeMotorista(nomeMotorista);

        System.out.println("Quilometragem inicial: ");
        quilometragemInicial = scanner.nextFloat();
        corrida.setquilometragemInicial(quilometragemInicial);

        System.out.println("Quilometragem Final: ");
        quilometragemFinal = scanner.nextFloat();
        corrida.setquilometragemFinal(quilometragemFinal);
        scanner.close();

        quilometragemTotal = corrida.calcularQuilometragemPercorrida();
        valorTotal = corrida.calcularValorTotal();

        System.out.println("\n\n DADOS DA CORRIDA:");
        System.out.println("Modelo do Carro: " + modeloCarro);
        System.out.println("Motor do Carro: " + motorCarro);
        System.out.println("Fabricante do Carro: " + fabricanteCarro);
        System.out.println("Nome do Motorista:" + nomeMotorista);
        System.out.format("Quilometragem percorrida: %.2f\n ", quilometragemTotal);
        System.out.format("Valor total da corrida: R$%.2f\n", valorTotal);


        

    }
}
