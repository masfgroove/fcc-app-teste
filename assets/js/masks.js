/**
 * Aplica máscaras aos campos que possuem as classes correspondentes
 */
function applyMasks(){
	$(".cpfMask").mask("999.999.999-99");
	applyNumberMasks();
	$(".cepMask").mask("99999-999");
}

/**
 * Aplica máscara para números em todos os campos que possuírem a classe numberMask<br />
 * Para isso podem ser utilizados os atributos data-minLength(tamanho mínimo do valor) e data-maxLength(tamanho máximo)<br />
 * Caso o valor dos dois atributos não for informado ou se o campo não possuí-los será aplicada uma máscara 
 * para número sem limite de tamanho<br />
 * Se somente minLength for informado o tamanho máximo e mínimo do campo será esse<br />
 * Se apenas maxLength for informado o valor do campo será opcional mas possuirá o valor máximo
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

