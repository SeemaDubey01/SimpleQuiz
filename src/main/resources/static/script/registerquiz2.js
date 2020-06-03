	var remainingSec = 10;
	var marks = 1000;
	setInterval(function(){
		$("#timer").text (remainingSec);
		remainingSec = remainingSec - 1;
		if (remainingSec < 0 ){
			//$("#quizform").submit();
			remainingSec = 10
		}

		setInterval(function(){
			marks = marks - 2;
			if (marks < 0 ) marks =0;
			$("#tMarks").attr("value",marks);
			$("#tmarks").text (marks);
		},100);

	},1000);