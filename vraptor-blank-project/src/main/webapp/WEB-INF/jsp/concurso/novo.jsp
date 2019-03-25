<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.11/jquery.mask.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../css/Style.css">
<meta charset="utf-8">
<title>Novo Concurso</title>
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
	<div class="centraliza tela-novo">
		<h1>Adicionar Concurso</h1>
		<form action="/your.groupid/concurso/salvar" method="post" id="form">
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Numero do Concurso</label>
				<div class="col-sm-10">
					<input type="text" name="numeroConcurso" class="form-control"
						placeholder="Numero do concurso" required>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Numeros</label>
				<div class="col-sm-10">
					<input type="text" name="numeros" class="form-control" required
						maxlength="12" id="numeros" placeHolder="00-00-00-00-00-00">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Data</label>
				<div class="col-sm-10">
					<input type="date" name="data" class="form-control" required>
				</div>
			</div>
			<button class="btn-success btn" type="submit" id="add">Adicionar
				Concurso</button>
		</form>
	</div>
	<script type="text/javascript">
		$("#numeros").mask("00-00-00-00-00-00");
	</script>
</body>
</html>