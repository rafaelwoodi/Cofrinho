<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>Lista de Usuários</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/bootstrap-responsive.css" rel="stylesheet">
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/function.js"></script>
	<script type="text/javascript" src="js/bootstrap-dropdown.js"></script>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span2">
					<ul class="thumbnails">
						<li class="span10">
							<a href="#" class="thumbnail">
								<img src="imagens/cofrinho.jpg" alt="">
							</a>
						</li>
					</ul>
				</div>
				<div class="span10">
					<div class="navbar-inner">
						<ul class="nav nav-pills" id="menuSup">
							<li class="active menuSup">
								<a href="#">Início</a>
							</li>
							<li class="menuSup">
								<a href="#">Link</a>
							</li>
							<li class="menuSup">
								<a href="#">Link</a>
							</li>		
						</ul>
					</div>
				</div>	
			</div>
			<div class="row-fluid">
				<div class="span2">
					<div class="btn-group">
						<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu" style="display: block; position: static; margin-bottom: 5px; *width: 180px;">
						  <li><a tabindex="-1" href="#">Ação</a></li>
						  <li><a tabindex="-1" href="#">Outra ação</a></li>
						  <li><a tabindex="-1" href="#">Algo a mais aqui</a></li>
						  <li class="divider"></li>
						  <li><a tabindex="-1" href="#">Link separador</a></li>
						  <li class="dropdown-submenu">
							<a tabindex="-1" href="#">Mais opções</a>
								<ul class="dropdown-menu">
									<li><a href="#">aaaa</a></li>
						  </li>
						</ul>
					</div>
				</div>
				<div class="span10">
				<h4>Cabeçalho</h1>
			<table id="box-table-a" summary="Employee Pay Sheet">
						    <thead>
						    	<tr>
						    	    <th  scope="col" align="center">&nbsp;</th>
								    <th  scope="col" align="center">&nbsp;</th>
								    <th  scope="col" align="center">Login</th>
								    <th  scope="col" align="center">Nome Completo</th>
								    <th scope="col" align="center">Idade</th>        	
						        </tr>
						    </thead>
						     <tbody>
						     <tr>
			     			<td align="center">1</td>
			     			<td align="center">2</td>
			     			<td align="center">3</td>
			     			<td align="center">4</td>
			     			<td align="center">5</td>
			     	       </tr>
			             <tbody>
			   </table>
				</div>
			</div>
		</div>
</body>
</html>