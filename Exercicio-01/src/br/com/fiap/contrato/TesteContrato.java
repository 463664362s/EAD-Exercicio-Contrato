package br.com.fiap.contrato;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteContrato {

public static void main(String[] args) {
		
		//LocalDate data = LocalDate.of(2018, 06, 25);
		

		
        	Scanner scanner = new Scanner(System.in);
       

        
        	System.out.print("Qual o numero do contrato: ");
            int numeroContrato = scanner.nextInt();
            
            System.out.print("Data dd/MM/yyy: ");
        	String dataContrato = scanner.next();
        	
        	System.out.print("Valor do contrato: ");
        	double valorContrato = scanner.nextDouble();
        	
        	System.out.print("Parcelas: ");
            int parcelasContrato = scanner.nextInt();
            
            scanner.close();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataContratoFormatada = LocalDate.parse(dataContrato, formatter);
            
            
    		Contrato contrato = new Contrato(numeroContrato,dataContratoFormatada,valorContrato,parcelasContrato);
  
			contrato.imprimirInformacoes();
			contrato.parcelarValor();			

				
	}
}
