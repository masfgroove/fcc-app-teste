<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib uri="http://www.mentaframework.org/tags-mtw/" prefix="mtw" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<html lang="pt-br">
	<head>
		<jsp:include page="/WEB-INF/jsp/Head.jsp" />
		<title>Portal FCC - Teste Pleno</title>
		
		<!-- Fancybox -->
		<link type="text/css" rel="stylesheet" href="/assets/fancybox/jquery.fancybox.css" />
		<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/fancybox/jquery.fancybox.pack.js"></script>
				
		<link type="text/css" rel="stylesheet" href="<c:out value="${pageContext.request.contextPath}" />/assets/css/paginaInicial.css" />
				
		<style>
			h4 {
				color: #b8b8b8;
			}
			
			/*#########################
			######## FAVORITOS ########
			##########################*/
			.titulo {
				margin-left:   50px;
				margin-top:    20px;
				margin-bottom: 15px;
			}
			
			.titFavor {
				margin-top: 45px;
			}
			
			.panel {
				padding: 10px;
			}
						
			.apps {
				line-height:           16px;
				white-space:           pre-wrap;
				vertical-align:        middle;
				display:               table-cell;
				width:                 64px;
				height:                64px;
				margin:                0px;
				margin-right:          28px;
				margin-bottom:         35px;
				font-size:             11px;
				text-decoration:       none;
				color:                 gray;
				font-weight:           bold;
				padding:               0;
				min-width:             40px;
				background:            transparent;
				float:                 left;
				-moz-border-radius:    5px;
				-webkit-border-radius: 5px;
				border-radius:         5px;
				text-align:            center;
				z-index:               10;
			}
			
			.apps:HOVER {
				/* implementação para o ie */
				box-shadow: 0px 0px 8px #a2a1a1;
				/* implementação para o firefox */
				-moz-box-shadow: 0px 0px 8px #a2a1a1;
				/* implementação para safari */
				-webkit-box-shadow: 0px 0px 8px #a2a1a1;
				color: #8f292f;
			}
			
			.descricao {
				font-size:   11px;
				font-weight: normal;
				color:       #bababa;
			}
			
			#botoes ul {
				list-style:      none;
				list-style-type: none;
				margin-left:     0px;
				margin-right:    0px;
				padding-left:    35px;
				padding-right:   20px;
			}
		</style>
		
		<script type="text/javascript" >	
			$(function() {
				$('#pesquisar').keyup(function(){
					var encontrou = false;
					var termo = $(this).val().toLowerCase();
					$('#botoes > div > a').each(function(){
						if($(this).text().toLowerCase().indexOf(termo) > -1) encontrou = true;
							if(!encontrou) $(this).hide();
							else $(this).show();
							encontrou = false;
						});
					$('#favoritos > div > div > a').each(function(){
						if($(this).text().toLowerCase().indexOf(termo) > -1) encontrou = true;
							if(!encontrou) $(this).hide();
							else $(this).show();
							encontrou = false;
						});
					});
				});
			
				$(".modalAppCommunicator").fancybox({
					"width":          "35%",
					"height":         "25%",
					"autoScale":      false,
					"autoSize":       false,
				    "autoResize":     false,
				    "autoCenter":     true,
					"transitionIn":   "none",
					"transitionOut":  "none",
					"type":           "iframe",
					"overlayShow":    true,
					"centerOnScroll": "true",
					"overlayOpacity": 0.9,
					"transitionIn":   "elastic",
					"transitionOut":  "elastic"
				});
				$( "div.fancybox-wrap").css( "height", "auto" );
				
				$(".tomcatDocumentation").fancybox({
					"width":          "100%",
					"height":         "100%",
					"autoScale":      false,
					"autoSize":       false,
				    "autoResize":     false,
				    "autoCenter":     true,
					"transitionIn":   "none",
					"transitionOut":  "none",
					"type":           "iframe",
					"overlayShow":    true,
					"centerOnScroll": "true",
					"overlayOpacity": 0.9,
					"transitionIn":   "elastic",
					"transitionOut":  "elastic"
				});	
				
				$(".mentawaiDocumentation").fancybox({
					"width":          "43%",
					"height":         "50%",
					"autoScale":      false,
					"autoSize":       false,
				    "autoResize":     false,
				    "autoCenter":     true,
					"transitionIn":   "none",
					"transitionOut":  "none",
					"type":           "iframe",
					"overlayShow":    true,
					"centerOnScroll": "true",
					"overlayOpacity": 0.9,
					"transitionIn":   "elastic",
					"transitionOut":  "elastic"
				});	
		</script>		
	</head>
<body>
	<jsp:include page="/WEB-INF/jsp/Top.jsp" />
	<div id="container" class="container">		
		<div id="principal" class="row">
			<div class='row'>
				<div class='col-md-10'>
					<h4 class="sub-header col-md-6">
					</h4>
				</div
				
				<div class="right-inner-addon col-md-2">
					<i class="glyphicon glyphicon-search col-md-3" ></i>
					<input id="pesquisar" type="text" name="pesquisar"  class="form-control" placeholder="Pesquisar Aplicativo" autofocus="autofocus" />
				</div>
			</div>

			<h4 class="sub-header">Aplicativos</h4>
			<div id="aplicativos" class="panel panel-default">
				<div id="botoes" class="row">
					<div class="col-md-12">
						<c:if test="${not empty listElegibleApplications}">
							<c:forEach items="${listElegibleApplications}" var="aplications">
								${aplications.linkAction}<span id="${aplications.cdAplicativo}" class="apps appsTitle" title="${aplications.dcAplicativo}"><img src="<c:out value="${pageContext.request.contextPath}" />/images/${aplications.imagem}" width="64px" height="64px" alt="${aplications.nmAplicativo}" />${aplications.nmAplicativo}</span></a>
							</c:forEach>
						</c:if
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/jsp/Footer.jsp" />	
</body>
</html>