<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<c:set var="context" value="${pageContext.request.contextPath}" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="Content-Language" content="pt-br">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/jquery.browser.js"></script>
<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/jquery.maskedinput.js"></script>
<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/jquery-ui-1.10.4.custom.min.js"></script>

<link type="text/css" rel="stylesheet" href="<c:out value="${pageContext.request.contextPath}" />/assets/css/jquery-ui-1.10.4.custom.min.css" />
<link type="text/css" rel="stylesheet" href="<c:out value="${pageContext.request.contextPath}" />/assets/bootstrap3/css/bootstrap.min.css" />

<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/bootstrap3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/bootbox.js"></script>

<link type="text/css" rel="stylesheet" href="<c:out value="${pageContext.request.contextPath}" />/assets/css/chosen/chosen.css" />
<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/chosen.jquery.min.js"></script>
<link type="text/css" rel="stylesheet" href="<c:out value="${pageContext.request.contextPath}" />/assets/css/footer.css" />
<link type="text/css" rel="stylesheet" href="<c:out value="${pageContext.request.contextPath}" />/assets/css/app.css" />
<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/masks.js"></script>
<link type="text/css" rel="stylesheet" href="<c:out value="${pageContext.request.contextPath}" />/assets/css/message.css" />
<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/util.js"></script>
<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/jquery.maskMoney.min.js"></script>
<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/bootstrap-select.min.js"></script>
<script type="text/javascript" src="<c:out value="${pageContext.request.contextPath}" />/assets/js/bootstrap-confirmation.min.js"></script>
<link type="text/css" rel="stylesheet" href="<c:out value="${pageContext.request.contextPath}" />/assets/css/bootstrap-select.min.css" />

<jsp:include page="/WEB-INF/jsp/loading.jsp" />

<script type="text/javascript">
	/* Abrir o datepicker em português do Brasil. */
	jQuery(function ($) {
	    $.datepicker.regional['pt'] = {
	        closeText:          'Fechar',
	        prevText:           '<Anterior',
	        nextText:           'Seguinte',
	        currentText:        'Hoje',
	        monthNames:         ['Janeiro', 'Fevereiro', 'Mar&ccedil;o', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro'],
	        monthNamesShort:    ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'],
	        dayNames:           ['Domingo', 'Segunda-feira', 'Ter&ccedil;a-feira', 'Quarta-feira', 'Quinta-feira', 'Sexta-feira', 'S&aacute;bado'],
	        dayNamesShort:      ['Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'S&aacute;b'],
	        dayNamesMin:        ['Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'S&aacute;b'],
	        weekHeader:         'Sem',
	        dateFormat:         'dd/mm/yy',
	        firstDay:           0,
	        isRTL:              false,
	        showMonthAfterYear: false,
	        yearSuffix:         ''
	    };
	    $.datepicker.setDefaults($.datepicker.regional['pt']);
	    
	    /*
	     * Aplica máscaras aos campos com as classes informadas
	     */
	    applyMasks();
	    
	    /**
	     * Tooltip do nome de usuário
	     */
	    $("#nomeUser").popover({
	    	html: true,
	 		content: $("#popoverNomeUser").html(),
	 		placement: 'bottom',
	 		trigger: 'click'
	 	});
	     
	    $(".navbar").hover(function(){
	    	$(this).click();
	    });
	});
</script>
<style type="text/css">
	.espacoAposTopo {
		height: 30px;
		width: 100%;
	}

	.navbar {
		filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#FF333333',endColorstr='#F2222222', GradientType=0)
	}
	.navbar-inner {
		filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#FF333333',endColorstr='#F2222222', GradientType=0)
	}
	.btn-navbar {
		filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#FF333333',endColorstr='#F2222222', GradientType=0)
	}
	
	.top-20 {
		margin-top: 20px;
	}
</style>