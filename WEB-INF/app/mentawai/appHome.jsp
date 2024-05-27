<!DOCTYPE html>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://www.mentaframework.org/tags-mtw/" prefix="mtw" %>
<head>
	<jsp:include page="/WEB-INF/jsp/Head.jsp"
	
	<style>
		.fieldset {
		    border:           1px solid #ddd;
		    margin:           0;
		    padding:          0 1.4em 1.4em;
		    background-color: white;
		    height:           auto; 
		    overflow:         auto;
		}
						
		legend {
		    font-size:     1em;
		    font-weight:   bold;
		    padding:       0 10px;
		    width:         auto;
		    margin-bottom: 5px;
		    border-width:  0px;
		}		
	</style>
</head>
<body>
	<div id="principal" class="container">
		<div class="titulo" style="margin-left: 0">
			<table style="width: 100%;">
				<tr>
					<td valign="top" >
						<div class="row">
							<div class="col-sm-6">
								<fieldset class="fieldset" >
									<legend style="margin-bottom: 10px"><b>Mentawai:</b></legend>
									<table>
										<tbody>												
										<tr>
	 							 		 <ul>
						 				  <li>
						 				  href="https://mentawaiblogphotography.photo.blog/2020/01/22/introducao-ao-framework-mentawai/" target="_blank">Framework Mentawai</a>
						 				  </li>
						 				 </ul>																						
										</tr>																						
										</tbody>										
									</table>	
								</fieldset>
							</div>
							
							<div class="col-sm-6">
								<fieldset class="fieldset" >
									<legend style="margin-bottom: 10px"><b>Componentes/Tags:</b></legend>
									<mtw:out value="mtwTaglib" 
								</fieldset>
							</div>
						</div>
					</td>
				</tr>
			</table>			
		</div>	
	</div>	
</body>
</html>