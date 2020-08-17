package model;

import java.sql.Date;

public class Recensione {

	private String titolo;
	private String testo;
	private String stelle;
	private String autore;
	private Date data_rec;
	private Date data_visita;
	private boolean segnalazione;
	private int idRecensione;
	private int idVisitabile;
	
	public Recensione(String titolo, String testo, String autore, Date data_rec) {
		super();
		this.titolo = titolo;
		this.testo = testo;
		this.autore = autore;
		this.data_rec = data_rec;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public String getStelle() {
		return stelle;
	}
	public void setStelle(String stelle) {
		this.stelle = stelle;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public Date getData_rec() {
		return data_rec;
	}
	public void setData_rec(Date data_rec) {
		this.data_rec = data_rec;
	}
	public Date getData_visita() {
		return data_visita;
	}
	public void setData_visita(Date data_visita) {
		this.data_visita = data_visita;
	}
	public boolean isSegnalazione() {
		return segnalazione;
	}
	public void setSegnalazione(boolean segnalazione) {
		this.segnalazione = segnalazione;
	}
	public int getIdRecensione() {
		return idRecensione;
	}
	public void setIdRecensione(int idRecensione) {
		this.idRecensione = idRecensione;
	}
	public int getIdVisitabile() {
		return idVisitabile;
	}
	public void setIdVisitabile(int idVisitabile) {
		this.idVisitabile = idVisitabile;
	}
}
