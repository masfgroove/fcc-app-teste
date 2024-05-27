<!DOCTYPE html>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://www.mentaframework.org/tags-mtw/" %> 
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<head>
	<jsp:include page="/WEB-INF/jsp/Head.jsp" />
</head>
<body>
	<div id="principal" class="container">
		<div class="titulo" style="margin-left: 0">
			<div class="boxMenu">
				<table style="width: 100%;">
					<tr>
						<td valign="top" style="width: 50%;">
							<div class="row" style="height: 50px; margin: auto;" >
								<div class="col-md-12">
									<display class="table table-bordered table-condensed relatorio" name="listElegibleEmployees" id="employee"  pagesize="500" requestURI="/">
										<display:column title="Funcionario">
											<mtw:out value="employee.nmEmployee" />
										</display:column>
										<display:column title="Status">
											<mtw:if test="employee.status" value="0" >
												<i class="glyphicon glyphicon- glyphicon-stats" style="color: red;"></i>
											</mtw:if>
											<mtw:if test="employee.status" value="1">
												<i class="glyphicon glyphicon- glyphicon-stats" style="color: green;"></i>
											</mtw:if>
										</display:column>
										<display:column title="Setor">
											<mtw:out value="employee.nmSector" />
										</display:column>
										<display:column title="Status da Chamada">											
											<mtw:if test="employee.availableCall" value="1" >
												<i class="glyphicon glyphicon- glyphicon-phone-alt" style="color: green;"></i>
											</mtw:if>
											<mtw:if test="employee.availableCall" value="2" >
												<i class="glyphicon glyphicon- glyphicon-earphone" style="color: orange;"></i>
											</mtw:if>
											<mtw:if test="employee.availableCall" value="3" >
												<i class="glyphicon glyphicon- glyphicon-phone" style="color: red;"></i>
											</mtw:if>
										</display:column>
									</display:table>
								</div>
							</div>
						</tr>
				</table>			
			</div>
		</div>	
	</div>	
</body>
</html>