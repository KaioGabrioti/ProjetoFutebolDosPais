<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
    	<meta charset="utf-8">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
    	<title>Futebol dos Pais</title>

    	<link href="css/bootstrap.min.css" rel="stylesheet">
    	<link href="css/style.css" rel="stylesheet">
	</head>
	<body>
		<c:import url="Menu.jsp"/> 
		<br><br>
		<div class="container">
       		
        	<form action="fazer_login" method="post">
				<div class="row">
					<div class="form-group col-md-3">
					</div>
					<div class="from-group col-md-6">
						<h3 class="page-header">Login</h3>
						<hr>
						<form>
  							<div class="form-group">
    							<label for="exampleInputEmail1">Email</label>
        						<input name="email" type="text" class="form-control" placeholder="exemplo@exemplo.com.br">
  							</div>
  							<div class="form-group">
    							<label for="exampleInputPassword1">Senha</label>
    							<input name="senha" type="password" class="form-control" id="exampleInputPassword1" placeholder="Digite sua senha">
  							</div>

  							<button type="submit" class="btn btn-primary">Login</button>
  							<a href="inicio" type="submit" class="btn btn-danger">Cancelar</a>
						</form>
					</div>
				</div>
					
			</form>    
		</div>
		
		
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	    <script src="js/jquery.min.js"></script>
	    <script src="js/bootstrap.min.js"></script>
	</body>

</html>