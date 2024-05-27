<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html lang="pt-br">
	<head>
		<jsp:include page="/WEB-INF/jsp/Head.jsp" />	
		<title>Portal FCC - Teste Pleno</title>
	</head>
	<body>
		<jsp:include page="/WEB-INF/jsp/Top.jsp" />	
		<div id="principal" class="container">		
			<div class="row" style="margin-top: 50px">
				<div class="col-md-12">
					<div class="alert alert-danger">
						<div class="row">
							<div class="col-md-1">
								<img alt="Alerta!" src="<c:out value="${pageContext.request.contextPath}" />/images/alerta.png" class="img-responsive" />
							</div>
							<div class="col-md-9" style="padding-top: 10px">
								<h4>Atenção</h4>
								Ocorreu um erro no sistema!
								Por favor, analise o erro abaixo e resolva o incidente.
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-12">
					<div class="alert alert-warning">
						<b>URL</b>: ${pageContext.errorData.requestURI}<br>
	    				<b>Status</b>: ${pageContext.errorData.statusCode}<br>
	    				<b>Exceção</b>: ${pageContext.errorData.throwable}<br>
						<b>Mensagem</b>: ${pageContext.errorData.throwable.cause}<br>
						<c:forEach var="stackTraceElement" items="${pageContext.errorData.throwable.stackTrace}">
	        				at ${stackTraceElement}<br>
	    				</c:forEach>
					</div>
				</div>
			</div>
		</div>	
		<jsp:include page="/WEB-INF/jsp/Footer.jsp" />
	</body>
</html>