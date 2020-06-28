$(document).ready(function() {
	$(document).bind("selectstart", function(){
		return false;
	});

	$(".pin").keyup(function(e) {
		var n = e.which;
		if(n >= 48 && n <= 57) {
			$(this).val(n - 48);
			$(this).next().focus();
			return;
		}
		if(n >= 96 && n <= 105) {
			$(this).val(n - 96);
			$(this).next().focus();
			return;
		}
	});

	$("#agree").click(function() {
		//todo
	});

	$("#reject").click(function() {
		native.exit();
	});
});