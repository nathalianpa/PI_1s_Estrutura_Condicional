package exercicios_20_03_2020;

import java.util.Scanner;

public class Ex_03_Bissexto {
	public static void main(String[] args) {
        System.out.println("Informe o ano:");
        Scanner stringYear = new Scanner(System.in);
        int year = Integer.parseInt(stringYear.nextLine());
        
        if ((year % 4 == 0) && !(year % 100 == 0)) {
            String message = String.format("O ano %d e bissexto", year);
            System.out.println(message);
        } else {
            String message = String.format("O ano %d nao e bissexto", year);
            System.out.println(message);
        }
    }
}
