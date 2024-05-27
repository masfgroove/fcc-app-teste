<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.mentaframework.org/tags-mtw/" prefix="mtw" %>
<html lang="pt-br">
	<head>
		<jsp:include page="/WEB-INF/jsp/Head.jsp" />		
		<title>Portal FCC - Teste Pleno</title>
		<%session.invalidate();%>
		<link type="text/css" rel="stylesheet" href="<c:out value="${pageContext.request.contextPath}" />/assets/bootstrap3/css/bootstrap.min.css" />
		<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/bootstrap3/js/bootstrap.min.js"></script>

		<style type="text/css">
			body {
				display:     block;
				padding-top: 10px;		
			}
			
			body > input {
				width: 80%;
			}
			
			label {
				padding-top: 15px;
			}
			
			.navbar {
	    		min-height: 40px;
	    	}
	    	
	    	div > #mensagem {
		    	display:     none; 
		    	margin-top:  50px; 
		    	margin-left: 85px; 
		    	position:    relative; 
		    	float:       left; 
		    	width:       53%;
	    	}
		</style>
		<script type="text/javaScript">		
			function validatesData() {				
				let candidato = $("#candidato").val();
				
				if( candidato == null
						|| candidato == "" 
							|| candidato == undefined ){
					
					$("#mensagem").css( "display", "block" );
					$("#mensagem-info").html( "<h4>Atenção</h4><br>O seu nome é necessário para iniciar o sistema." );
					return false;
				}
			}
		</script>
	</head>
	<body>
		<jsp:include page="/WEB-INF/jsp/Top.jsp" />
		<div class="container">
			<div id="mensagem" class="row">
				<div class="col-sm-12">
					<div class="alert alert-danger">
						<div class="row">
							<div class="col-sm-3">
								<img alt="Alerta!" src="<c:out value="${pageContext.request.contextPath}" />/images/alerta.png" class="img-responsive" />
							</div>
							<div id="mensagem-info" class="col-sm-9" style="padding-top: 10px"></div>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="margin-top: 250px">
				<div class="col-sm-6">
					<div class="col-sm-offset-3">
						<div class="panel panel-default" style="width: 500px;" >
							<div class="panel-body">
								<form action="<c:out value="${pageContext.request.contextPath}" />/initialPage/InitialPage.login.mtw" onSubmit="return validatesData();" autocomplete="off" method="post" role="form">
									<div id="iniciar-sessao-teste" style="margin: 35px">
										<h1>Iniciar Sessão Teste</h1>
										<label>Candidato</label>
										<input type="text" class="form-control" id="candidato" name="candidato" placeholder="Candidato" autofocus  />
										<div style="padding-top:15px;">
											<button class="btn btn-primary" type="submit" style="max-height:38px; width:100%" >Entrar</button>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>			
			</div>	
		</div>
		<jsp:include page="/WEB-INF/jsp/Footer.jsp" />	
	</body>
</html>