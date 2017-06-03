package controller;

import javax.servlet.http.HttpServletRequest;

import dao.GenericDao;
import dao.LivroDao;
import model.Editora;
import model.Livro;

public class LivroController {

	public void fazAlgo(HttpServletRequest req) {
		Editora e = new Editora();
		e.setNome(req.getParameter("editora"));
		Livro livro = new Livro();
		livro.setNome(req.getParameter("nome"));
		livro.setEdicao(req.getParameter("edicao"));
		livro.setEditora(e);
		livro.setIdioma(req.getParameter("idioma"));
		livro.setQntPaginas(Integer.parseInt(req.getParameter("qntPaginas")));
		GenericDao<Livro> cu = new LivroDao<Livro>();
		try {
			cu.adicionar(livro);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		System.out.println(livro.toString());
	}
}