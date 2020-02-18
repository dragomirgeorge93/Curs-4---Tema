package main;

public class Imobil {
	
	private String tipVila;
	private int nrEtaje;
	private double pret;
	
	public Imobil() {
		
	}
	
	public Imobil(String tipVila, int nrEtaje, double pret) {
		this.tipVila = tipVila;
		this.nrEtaje = nrEtaje;
		this.pret = pret;
	}
	
	public Imobil(String tipVila, double pret) {
		this.tipVila = tipVila;
		this.pret = pret;
		
	}
	
	public String getTipVila() {
		return this.tipVila;
	}
	public void setTipVila(String tipVila) {
		this.tipVila = tipVila;
	}
	
	
	public int getNrEtaje() {
		return this.nrEtaje;
	}
	public void setNrEtaje(int nrEtaje) {
		this.nrEtaje = nrEtaje;
	}
	
	
	public double getPret() {
		return this.pret;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}

}