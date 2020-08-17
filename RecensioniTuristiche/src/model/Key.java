package model;

public class Key {

	private String parola;
	private int idCategoria;
	
	public Key(String parola, int idCategoria) {
		super();
		this.parola = parola;
		this.idCategoria = idCategoria;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
}
