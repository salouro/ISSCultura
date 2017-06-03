package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Emprestimo implements Serializable {
	private long id;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private List<Livro> livros;
	private Aluno aluno;
	
	public Emprestimo() {
		
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public long getId() {
		return id;
	}



}