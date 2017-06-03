<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>livroForm</title>
</head>
<body>
	<form name="cadastro_livros" method="get" action="./FrontController">
		nome: <input type="text" name="nome"/>
		<br>
		edicao: <input type="text" name="edicao"/>
				<br>
		editora: <input type="text" name="editora"/>
				<br>
		idioma: <input type="text" name="idioma"/>
				<br>
		qntPaginas: <input type="text" name="qntPaginas"/>
				<br>
		<input type="submit" value="Salvar"/>
	</form>
</body>
</html>