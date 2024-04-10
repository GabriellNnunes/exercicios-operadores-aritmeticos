import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        // ENTRADA
        Scanner scanner = new Scanner(System.in);
    
        // 1- pedir para o usuário o seu peso.
       System.out.println("Informe seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        // 2- pedir para o usuário a sua altura em Metros.
        System.out.println("Informe sua altura em metros: ");
        double altura = scanner.nextDouble();


        // PROCESSAMENTO
        // 3- calcular o IMC.
        double imc = peso / (altura * altura);

        // // SAÍDA
        // 4- Imprime o resultado do IMC.
        System.out.println("Seu IMC é: "+ imc);

        scanner.close();
    }


}
