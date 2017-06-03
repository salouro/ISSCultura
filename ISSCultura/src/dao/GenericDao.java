package dao;


public interface GenericDao<T> {
	T pesquisa(long id);
	
	void adicionar(T obj) throws Exception;
	
	void excluir(long id);
	
	void alterar();
	
}