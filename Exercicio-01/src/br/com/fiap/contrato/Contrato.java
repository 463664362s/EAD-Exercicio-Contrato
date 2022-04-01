package br.com.fiap.contrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contrato {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
	private int numero;
	private LocalDate data;
	private double valorContrato;
	private int numParcelas;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getValorParcela() {
		return valorContrato;
	}
	public void setValorParcela(double valorContrato) {
		this.valorContrato = valorContrato;
	}
	public int getNumParcelas() {
		return numParcelas;
	}
	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}
	
	
	public Contrato(int numero, LocalDate data, double valorContrato, int numParcelas) {
		super();
		this.numero = numero;
		this.data = data;
		this.valorContrato = valorContrato;
		this.numParcelas = numParcelas;
		
	}
	
	public void parcelarValor() {
		
		System.out.println("Parcelas:");
		for(int i = 0; i < numParcelas; ++i){
			LocalDate dataParcelas = data.plusMonths(i+1);
			double valorParcelado =  ((valorContrato/numParcelas) * (i+1)/100 + (valorContrato/numParcelas)) * 1.02;
			System.out.println(dataParcelas.format(formatter) + " - R$" + String.format("%.2f", valorParcelado));

		} 
	}
	
	public void imprimirInformacoes() {
		System.out.println("Numero contrato: " + numero);
		System.out.println("Data inicio contrato: " + data.format(formatter));
		System.out.println("Montante a ser pago: R$" + valorContrato);
		System.out.println("Numero de parcelas: " + numParcelas);

	}
}
