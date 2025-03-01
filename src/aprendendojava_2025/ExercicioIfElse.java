package aprendendojava_2025;

import java.util.Scanner;

public class ExercicioIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o seu salário: ");
        double salario = Double.parseDouble(scanner.nextLine());
        double salarioDecimal = salario / 100;
        double imposto;
        double aliquota;

        if (salario <= 34712.00) {
            aliquota = 9.70;
            imposto = salarioDecimal * aliquota;
        } else if (salario >= 34713 && salario <= 68508) {
            aliquota = 37.35;
            imposto = salarioDecimal * aliquota;

        } else {
            aliquota = 49.50;
            imposto = salarioDecimal * aliquota;
        }
        String totalImposto = String.format("%.2f", imposto);
        char euroSimbolo = '\u20AC';
        System.out.println("Você paga uma aliquota de " + aliquota + "%, o que resultará em um total de: " + totalImposto + euroSimbolo + " de imposto.");

    }
//    public static void main(String[] args) {
//        double salario = 70000;
//        double taxa1 = 9.70 / 100;
//        double taxa2 = 37.35 / 100;
//        double taxa3 = 49.50 / 100;
//        double valor;
//        if (salario <= 34.712){
//            valor = salario * taxa1;
//        }else if (salario >= 34.713 && salario <= 68.507) {
//            valor = salario * taxa2;
//        }else {
//            valor = salario * taxa3;
//        }
//        System.out.println(valor);
//    }
}
