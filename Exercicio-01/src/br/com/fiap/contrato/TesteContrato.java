package br.com.fiap.contrato;

import java.time.LocalDate;
import java.util.Scanner;

public class TesteContrato {

public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(2018, 06, 25);
		Contrato contrato = new Contrato(8000,data,6000,15);
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
        	System.out.print("Qual o numero do contrato: ");
            int numeroContrato = scanner.nextInt();
			if (contrato.getNumero() == numeroContrato) {
				contrato.imprimirInformacoes();
				contrato.parcelarValor();
			
			} else if (numeroContrato == 0) {
				break;
			} else {
		        System.out.println("Contrato n�o encontrado tente novamente. \n");
			}
			
        }
	}
}
