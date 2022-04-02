package br.com.fiap.contrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contrato {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private int numero;
	private LocalDate data;
	private double valor;
	private int parcelas;

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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}


	public Contrato(int numero, LocalDate data, double valor, int parcelas) {
		super();
		this.numero = numero;
		this.data = data;
		this.valor = valor;
		this.parcelas = parcelas;

	}

	public void parcelarValor() {

		System.out.println("Parcelas:");
		for(int i = 0; i < parcelas; ++i){
			LocalDate dataParcelas = data.plusMonths(i+1);
			double valorParcelado =  ((valor/parcelas) * (i+1)/100 + (valor/parcelas)) * 1.02;
			System.out.println(dataParcelas.format(formatter) + " - R$" + String.format("%.2f", valorParcelado));

		} 
	}

	public void imprimirInformacoes() {
		System.out.println("Numero contrato: " + numero);
		System.out.println("Data inicio contrato: " + data.format(formatter));
		System.out.println("Montante a ser pago: R$" + valor);
		System.out.println("Numero de parcelas: " + parcelas);

	}
}
