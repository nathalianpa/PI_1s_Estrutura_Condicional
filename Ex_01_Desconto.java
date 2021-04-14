package exercicios_20_03_2020;

import java.util.Scanner;

public class Ex_01_Desconto {
	public static void main(String[] args) {
        System.out.println("Informe o valor do produto:");
        Scanner stringCost = new Scanner(System.in);
        double cost = Double.parseDouble(stringCost.nextLine());
        
        if (cost >= 300.0) {
            double valueWithDiscount = cost - (cost * 0.2);
            double valueOfDiscount = cost - valueWithDiscount;
            String valueWithDiscountMessage = String.format("O custo com desconto: %.02f", valueWithDiscount);
            String valueOfDiscountMessage = String.format("O total do desconto: %.02f", valueOfDiscount);
            System.out.println(valueWithDiscountMessage);
            System.out.println(valueOfDiscountMessage);
        } else {
            double valueWithDiscount = cost - (cost * 0.15);
            double valueOfDiscount = cost - valueWithDiscount;
            String valueWithDiscountMessage = String.format("O custo com desconto: %.02f", valueWithDiscount);
            String valueOfDiscountMessage = String.format("O total do desconto: %.02f", valueOfDiscount);
            System.out.println(valueWithDiscountMessage);
            System.out.println(valueOfDiscountMessage);
        }
    }
}
