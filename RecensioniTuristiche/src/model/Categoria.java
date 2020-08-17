package model;

public class Categoria {

	private String nome;
	private String tema;
	private int idCategoria;
	
	public Categoria(String nome, String tema, int idCategoria) {
		this.nome = nome;
		this.tema = tema;
		this.idCategoria= idCategoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
}
