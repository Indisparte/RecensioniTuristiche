package model;

public class Visitabile {

	private String nome;
	private String luogo;
	private String sitoWeb;
	private String telefono;
	private int fascia_prezzo;
	private String categoria;
	private int idVisitabile;
	
	public Visitabile(String nome, String luogo, String sitoWeb, String telefono, int fascia_prezzo, String categoria) {
		this.nome = nome;
		this.luogo = luogo;
		this.sitoWeb = sitoWeb;
		this.telefono = telefono;
		this.fascia_prezzo = fascia_prezzo;
		this.categoria = categoria;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLuogo() {
		return luogo;
	}
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	public String getSitoWeb() {
		return sitoWeb;
	}
	public void setSitoWeb(String sitoWeb) {
		this.sitoWeb = sitoWeb;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getFascia_prezzo() {
		return fascia_prezzo;
	}
	public void setFascia_prezzo(int fascia_prezzo) {
		this.fascia_prezzo = fascia_prezzo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getIdVisitabile() {
		return idVisitabile;
	}
	public void setIdVisitabile(int idVisitabile) {
		this.idVisitabile = idVisitabile;
	}
}
