package model;

import java.io.Serializable;
import java.util.List;

public class Livro implements Serializable {

	
	private static final long serialVersionUID = 5332722330191254219L;
	private long id;
	private String nome;
	private String edicao;
	private List<Autor> autores;
	private Editora editora;
	private String idioma;
	private int qntPaginas;
	
	public Livro() {
	}

	public int getQntPaginas() {
		return qntPaginas;
	}

	public void setQntPaginas(int qntPaginas) {
		this.qntPaginas = qntPaginas;
	}
	
	public long getId() {
		return id;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public String toString(){
		return this.nome + "; " + this.idioma + "; " + this.qntPaginas + "; " + this.editora.getNome();
	}
}