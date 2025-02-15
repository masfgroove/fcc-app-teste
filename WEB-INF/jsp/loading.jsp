<style>
	.loader {
/* 	    display: inline-block;
	    position: relative;
 */	    
		position: fixed; 		
		width: 64px;
	    height: 64px;
	    position: fixed;
	    z-index: 999;
	    overflow: visible;
	    margin: auto;
	    top: 0;
	    left: 0;
	    bottom: 0;
	    right: 0;	
	}
	.loader div {
	    animation: lds-roller 1.2s cubic-bezier(0.5, 0, 0.5, 1) infinite;
	    transform-origin: 32px 32px;
	}
	.loader div:after {
	    content: " ";
	    display: block;
	    position: absolute;
	    width: 6px;
	    height: 6px;
	    border-radius: 50%;
	    background: #8f292f;
	    margin: -3px 0 0 -3px;
	    
	}
	.loader div:nth-child(1) {
	    animation-delay: -0.036s;
	}
	.loader div:nth-child(1):after {
	    top: 50px;
	    left: 50px;
	}
	.loader div:nth-child(2) {
	    animation-delay: -0.072s;
	}
	.loader div:nth-child(2):after {
	    top: 54px;
	    left: 45px;
	}
	.loader div:nth-child(3) {
	    animation-delay: -0.108s;
	}
	.loader div:nth-child(3):after {
	    top: 57px;
	    left: 39px;
	}
	.loader div:nth-child(4) {
	    animation-delay: -0.144s;
	}
	.loader div:nth-child(4):after {
	    top: 58px;
	    left: 32px;
	}
	.loader div:nth-child(5) {
	    animation-delay: -0.18s;
	}
	
	.loader div:nth-child(5):after {
	    top: 57px;
	    left: 25px;
	}
	
	.loader div:nth-child(6) {
	    animation-delay: -0.216s;
	}
	
	.loader div:nth-child(6):after {
	    top: 54px;
	    left: 19px;
	}
	
	.loader div:nth-child(7) {
	    animation-delay: -0.252s;
	}
	
	.loader div:nth-child(7):after {
	    top: 50px;
	    left: 14px;
	}
	
	.loader div:nth-child(8) {
	    animation-delay: -0.288s;
	}
	
	.loader div:nth-child(8):after {
	    top: 45px;
	    left: 10px;
	}
	
	@keyframes lds-roller {
	    0% {
	        transform: rotate(0deg);
	    }
	    100% {
	        transform: rotate(360deg);
	    }
	}
	#loading {
	    display: block;
	    position: fixed;
	    top: 0;
	    left: 0;
	    z-index: 100;
	    width: 100%;
	    height: 100%;
	    background-color: rgba(192, 192, 192, 0.8);
	    background-repeat: no-repeat;
	    background-position: center;
	}	
</style>
<script>
		
    function onReady(callback) {
        var intervalId = window.setInterval(function() {
            if (document.getElementsByTagName('body')[0] !== undefined) {
            	window.clearInterval(intervalId);
            	callback.call(this);
        	}
        }, 100);
    }

    function setVisible(selector, visible) {
        document.querySelector(selector).style.display = visible ? 'block' : 'none';
    }

    onReady(function() {
        setVisible('body', true);
        setVisible('#loading', false);
    });
        
    function onLoad() {
    	showLoading()
    };
    
    function showLoading(){
    	if (document.querySelector('#loading').style.display === 'none') {
			setVisible('#loading', true);
		}
    };

    function hideLoading() {
    	setVisible('#loading', false);
    };
</script>   

<div id="loading">
	<div class="loader">
		<div></div> <div></div> <div></div> <div></div> 
		<div></div> <div></div> <div></div> <div></div>
	</div>	
</div>
