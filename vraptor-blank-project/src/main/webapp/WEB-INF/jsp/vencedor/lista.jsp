<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../css/Style.css">
<meta charset="utf-8">
<title>Lista de Concursos</title>
</head>
<header>
	<div>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="navbar-nav">
				<a class="nav-link opcoes text-white h5"
					href="/your.groupid/concurso/lista">Concursos</a> <a
					class="nav-link opcoes text-white h5"
					href="/your.groupid/vencedor/lista">Vencedores</a>
			</div>
			<h1 class="centraliza-h1 text-white">Loteria</h1>
		</nav>
	</div>
</header>
<body>
	<div>
		<div class="centraliza">
			<c:if test="${mensagem} != null">
				<h1>${mensagem}</h1>
			</c:if>
		</div>

		<br>
		<div class="btnt">
			<button class="btn btn-dark" type="submit"
				onClick="window.location.href='/your.groupid/vencedor/conferir';">Conferir
				Números!</button>
		</div>
		<hr>
		<div class="centraliza">
			<table class="table table-striped table-hover">
				<thead class="thead-dark">
					<tr>
						<th scope="row">Nome</th>
						<th scope="row">N do Concurso</th>
						<th scope="row">Numeros</th>
						<th scope="row">Data</th>
					</tr>
				</thead>
				<c:forEach var="concurso" items="${concursoList}">
					<c:forEach var="vencedor" items="${concurso.vencedor}">
						<tr>
							<td>${vencedor.getNome()}</td>
							<td>${concurso.numeroConcurso}</td>
							<td>${vencedor.numeros}</td>
							<td>${concurso.getDataFormatada()}</td>
						</tr>
					</c:forEach>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>