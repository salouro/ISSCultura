package dao;

import java.sql.Connection;

public class LivroDao<T> implements GenericDao {
	@Override
	public T pesquisa(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionar(Object obj) throws Exception {
		Connection c = FactoryConexao.getConexao();
		System.out.println(c.toString());
	}

	@Override
	public void excluir(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}
}
