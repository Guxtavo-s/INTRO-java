package Introducao;
import java.util.Scanner;
public class DiasParaAnosMesesDias {

	public static void main(String[] args) {
	int anos,meses,dias;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite sua idade em dias: ");
	dias = leia.nextInt();
	
	anos = dias / 365;
			System.out.println("anos: "+anos);
	meses = (dias % 365) / 30;
			System.out.println("meses: "+meses);
	dias = (dias % 365) % 30;
			System.out.println("dias: "+dias);
	

	}

}
