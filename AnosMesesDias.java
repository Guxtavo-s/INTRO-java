package Introducao;
import java.util.Scanner;
public class AnosMesesDias {
public static void main(String[] args) {
	int anos,meses,dias,total;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Quantos anos você tem?");
	anos = leia.nextInt();
	System.out.println("Quantos meses você tem?");
	meses = leia.nextInt();
	System.out.println("Quantos dias você tem?");
	dias = leia.nextInt();
	
	total = (dias+(anos*365)+(meses*30));
			System.out.println("O total de dias é = "+total);
	
}
}
