/**
 * Aplica m�scaras aos campos que possuem as classes correspondentes
 */
function applyMasks(){
	$(".cpfMask").mask("999.999.999-99");
	applyNumberMasks();
	$(".cepMask").mask("99999-999");
}

/**
 * Aplica m�scara para n�meros em todos os campos que possu�rem a classe numberMask<br />
 * Para isso podem ser utilizados os atributos data-minLength(tamanho m�nimo do valor) e data-maxLength(tamanho m�ximo)<br />
 * Caso o valor dos dois atributos n�o for informado ou se o campo n�o possu�-los ser� aplicada uma m�scara 
 * para n�mero sem limite de tamanho<br />
 * Se somente minLength for informado o tamanho m�ximo e m�nimo do campo ser� esse<br />
 * Se apenas maxLength for informado o valor do campo ser� opcional mas possuir� o valor m�ximo
 */
function applyNumberMasks() {
	var mask = "";
	var minLength = 0;
	var maxLength = 0;
	var optional = 0;
	
	$(".numberMask").each(function(){
		if($(this).data("minlength"))
			minLength = $(this).data("minlength");
		
		if($(this).data("maxlength"))
			maxLength = $(this).data("maxlength");
		
		if(maxLength == 0 && minLength == 0){
			$(this).keydown(function (e) {
		        if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110, 190]) !== -1 || (e.keyCode == 65 && e.ctrlKey === true) 
		        		|| (e.keyCode >= 35 && e.keyCode <= 39)) {
		        	return;
		        }
		        
		        if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {
		            e.preventDefault();
		        }
		    });
			
			return true;
		}
		
		optional = maxLength - minLength;
		
		for(var i = 0; i < minLength; i++){
			mask += "9";
		}
		
		if(maxLength > 0 && maxLength > minLength) {
			mask += "?";
			
			for(var i = 0; i < optional; i++){
				mask += "9";
			}
		}
		
		$(this).mask(mask, {placeholder: ""});
		maxLength = 0;
		minLength = 0;
	});
}

