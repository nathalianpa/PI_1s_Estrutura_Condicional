package exercicios_20_03_2020;

import java.util.Scanner;

public class Ex_02_Triangulo {
	public static void main(String[] args) {
        double THRESHOLD = .0001;
        
        System.out.println("Informe o 1o. lado do triangulo:");
        Scanner stringSide1 = new Scanner(System.in);
        double side1 = Double.parseDouble(stringSide1.nextLine());
        
        System.out.println("Informe o 2o. lado do triangulo:");
        Scanner stringSide2 = new Scanner(System.in);
        double side2 = Double.parseDouble(stringSide2.nextLine());
        
        System.out.println("Informe o 3o. lado do triangulo:");
        Scanner stringSide3 = new Scanner(System.in);
        double side3 = Double.parseDouble(stringSide3.nextLine());
        
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side2 > side1)) {
            if (Math.abs(side1 - side2 - side3) < THRESHOLD) {
                System.out.println("As medidas formam um triangulo 'equilatero'");
            } else if((Math.abs(side1 - side2) < THRESHOLD) || (Math.abs(side2 - side3) < THRESHOLD) || (Math.abs(side3 - side1) < THRESHOLD)) {
                System.out.println("As medidas formam um triangulo 'isosceles'");
            } else {
                System.out.println("As medidas formam um triangulo 'escaleno'");
            }
        } else {
            System.out.println("As medidas nao formam um triangulo");
        }
    }

}
