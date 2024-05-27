<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<div class="navbar navbar-fixed-top" style="background-color : #4b5050;" id="navTopoResponsivo">
	<div class="navbar-inner" style="border: 0; height: 100%;">  
		<div class="container" style="height: 100%;">
			<div class="row" style="height: 100%;">
				<div id="nomeUser" class="pull-left" style="color: white; font-weight: bold; display: table">
					<%=(String)(session.getAttribute("candidato")!=null?session.getAttribute("candidato"):"...")%>
				</div>
				<div class="pull-right">				
					<div id="logout" class="pull-right">
						<a href='<c:out value="${pageContext.request.contextPath}" />'>
							<span  class="glyphicon glyphicon-log-out" style="color: white;font-size: 22px; margin-right: 2px;"data-toggle="tooltip" data-placement="bottom" title="Sair do sistema"></span>
						</a>
					</div>
					<div id="linkInicial" class="pull-right">
						<span  class="glyphicon glyphicon-th" style="color: white;font-size: 22px; margin-right: 2px;"data-toggle="tooltip" data-placement="bottom" title="Menu aplicativos"></span>
						<span  class="glyphicon glyphicon-home" style="color: white;font-size: 22px;"data-toggle="tooltip" data-placement="bottom" title="Retornar à página inicial"></span>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>